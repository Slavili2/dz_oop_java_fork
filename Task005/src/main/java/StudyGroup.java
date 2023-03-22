import java.util.ArrayList;
import java.util.List;

public class StudyGroup {
    private String teacher;
    private List<String> students;

    public StudyGroup(String teacher, List<String> studentsList){
        this.teacher = teacher;
        this.students = studentsList;
    }



    public String getTeacher(){
        return this.teacher;
    }


    public List<String> getStudents(){
        return this.students;
    }
}
