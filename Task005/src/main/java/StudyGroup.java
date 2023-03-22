import java.util.ArrayList;
import java.util.List;

public class StudyGroup {
    private String teacher;
    private List<String> students;

    public StudyGroup(){
        students = new ArrayList<>();
    }

    public void setTeacher(String teacher){
        this.teacher = teacher;
    }

    public String getTeacher(){
        return this.teacher;
    }

    public void setStudents(String nameStudent){
        this.students.add(nameStudent);
    }

    public List<String> getStudents(){
        return this.students;
    }
}
