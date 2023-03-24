/**
 * Класс Student содержит свойства и методы характерные только для студентов
 * соответствует Single responsibility principle
 * реализация интерфейса BaseStudent  - это соответствие Liskov substitution principle
 */
public class Student extends PeopleOfUniversity implements BaseStudent{
    private String nameOfGroup;
    private int courseNumber;
    public Student(String fullName, int id, String nameOfGroup, int courseNumber){
        super(fullName, id);
        this.nameOfGroup = nameOfGroup;
        this.courseNumber = courseNumber;
    }

    public String getNameOfGroup(){
        return this.nameOfGroup;
    }

    public int getCourseNumber(){
        return this.courseNumber;
    }

}
