package Ex002;

public class ParameterizedWorker<TTT> {
    private TTT id;

    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public ParameterizedWorker(TTT id, String firstName, String lastName, int age, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public TTT getId(){
        return this.id;
    }



    public String fullName(){
        return String.format("%s %s", this.firstName, this.lastName);
    }
}
