/**
 * Класс содержащий в себе общие свойства и методы как преподавателей так и студентов.
 * соответствует Single responsibility principle
 * также соответствует Open-closed principle, т.е. на его основе можно создать любого сотрудника/студента учебного заведения
 */
public abstract class PeopleOfUniversity implements People{
    private String fullName;
    private int id;

    public PeopleOfUniversity(String fullName, int id){
        this.fullName = fullName;
        this.id = id;
    }

    public String getFullName(){
        return this.fullName;
    }

    public int getId(){
        return this.id;
    }
}
