package calculator;

import java.util.List;

public final class Calculator implements Calculable {

    private String primaryArg;
    private int[] primaryArgArray;

    public Calculator(String primaryArg) {

        this.primaryArgArray = partComplexToArray(primaryArg);
    }

    @Override
    public Calculable sum(String arg) {
        int[] tempArray = partComplexToArray(arg);
        int firstValue = this.primaryArgArray[0] + tempArray[0];
        int secondValue = this.primaryArgArray[1] + tempArray[1];

        this.primaryArg = secondValue > 0 ? firstValue + " + " + secondValue + "i":firstValue + "" + secondValue + "i";
        return this;
    }

    @Override
    public Calculable multi(String arg) {
        int[] tempArray = partComplexToArray(arg);
        int firstValue = this.primaryArgArray[0]*tempArray[0] + this.primaryArgArray[1]*tempArray[1]*(-1);
        int secondValue = this.primaryArgArray[1]*tempArray[0] + this.primaryArgArray[0]*tempArray[1];

        this.primaryArg = secondValue > 0 ? firstValue + " + " + secondValue + "i":firstValue + "" + secondValue + "i";

        return this;
    }

    @Override
    public Calculable division(String arg) {
        return this;
    }

    @Override
    public String getResult() {
        return primaryArg;
    }

    @Override
    public int[] partComplexToArray(String arg) {
        int[] tempArray = new int[2];
        String firstDigit="";
        String secondDigit="";
        int counter = 0;
        char[] dst = new char[arg.length()];

        arg.getChars(0,arg.length(), dst, 0);

        for (int i = 0; i < dst.length-1; i++) {
            if(i == 0 || (counter == 0 && Character.isDigit(dst[i]))){
                firstDigit+=dst[i];
            }else {
                secondDigit+=dst[i];
                counter++;
            }
        }

        if(Character.isDigit(dst[dst.length-2]) == false){
            secondDigit+="1";
        }
        tempArray[0] = Integer.parseInt(firstDigit);
        tempArray[1] = Integer.parseInt(secondDigit);

        return tempArray;
        //System.out.println("Первое число из массива: "+ this.primaryArgArray[0]);
        //System.out.println("Второе число из массива: "+ this.primaryArgArray[1]);
    }
}
