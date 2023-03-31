package calculator;

import java.util.List;

public final class Calculator implements Calculable {

    private String primaryArg;
    private int[] primaryArgArray;

    public Calculator(String primaryArg) {
        this.primaryArg = primaryArg;
        this.primaryArgArray = partComplexToArray(primaryArg);
    }

    @Override
    public Calculable sum(String arg) {
        int[] tempArray = partComplexToArray(arg);
        int firstValue = this.primaryArgArray[0] + tempArray[0];
        int secondValue = this.primaryArgArray[1] + tempArray[1];

        this.primaryArg = secondValue > 0 ? firstValue + "+" + secondValue + "i":firstValue + "" + secondValue + "i";
        return this;
    }

    @Override
    public Calculable multi(String arg) {
        int[] tempArray = partComplexToArray(arg);
        int firstValue = this.primaryArgArray[0]*tempArray[0] + this.primaryArgArray[1]*tempArray[1]*(-1);
        int secondValue = this.primaryArgArray[1]*tempArray[0] + this.primaryArgArray[0]*tempArray[1];

        if(secondValue == 0)
            this.primaryArg = ""+firstValue;
        else
            this.primaryArg = secondValue > 0 ? firstValue + "+" + secondValue + "i":firstValue + "" + secondValue + "i";

        return this;
    }

    private String multi(String arg1, String arg2){
        String tempResult = "";
        int[] tempArray1 = partComplexToArray(arg1);
        int[] tempArray2 = partComplexToArray(arg2);
        int firstValue = tempArray1[0]*tempArray2[0] + tempArray1[1]*tempArray2[1]*(-1);
        int secondValue = tempArray1[1]*tempArray2[0] + tempArray1[0]*tempArray2[1];

        if(secondValue == 0)
            tempResult = ""+firstValue;
        else
            tempResult = secondValue > 0 ? firstValue + "+" + secondValue + "i":firstValue + "" + secondValue + "i";

        return tempResult;
    }

    @Override
    public Calculable division(String arg) {
        int[] tempArray = partComplexToArray(arg);
        //Общий множитель в виде комплексного числа
        String tempMnozhitel = tempArray[1] > 0 ? tempArray[0] + "-" + tempArray[1] + "i":tempArray[0] + "+" + tempArray[1]*(-1) + "i";

        int[] chislitel = partComplexToArray(multi(this.primaryArg, tempMnozhitel));
        int znamenatel = Integer.parseInt(multi(arg, tempMnozhitel));

        this.primaryArg = chislitel[1] > 0 ? (double)chislitel[0]/znamenatel + "+" + (double)chislitel[1]/znamenatel  + "i": (double)chislitel[0]/znamenatel + "" + (double)chislitel[1]/znamenatel + "i";

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
    }
}
