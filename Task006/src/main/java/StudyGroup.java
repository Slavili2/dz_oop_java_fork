import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudyGroup {
    //private Map<Staff, List<Student>> group = new HashMap<>();
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
