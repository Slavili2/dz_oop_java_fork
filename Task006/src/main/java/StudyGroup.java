import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс StudyGroup формирует группу связывая преподавателя и нескольких студентов.
 * соответствует Single responsibility principle
 */
public class StudyGroup {
    private Staff teacher;
    private List<Student> students;

    public StudyGroup(Staff teacher, List<Student> studentsList){
        this.teacher = teacher;
        this.students = studentsList;
    }

    public Staff getTeacher(){
        return this.teacher;
    }


    public List<Student> getStudents(){
        return this.students;
    }
}
