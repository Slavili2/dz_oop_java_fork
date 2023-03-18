package Ex002;

public class Worker {
    private int id;

    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public Worker(int id, String firstName, String lastName, int age, int salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String fullName(){
        return String.format("%s %s", this.firstName, this.lastName);
    }

}
