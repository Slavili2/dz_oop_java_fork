import java.util.ArrayList;
import java.util.List;

public class Staff extends PeopleOfUniversity implements Teacher{

    private List<String> academicSubjects;
    private int teachingExperience;
    public Staff(String fullName, int id, int teachingExperience){
        super(fullName, id);
        this.teachingExperience = teachingExperience;
        this.academicSubjects = new ArrayList<>();
    }

    public void setAcademicSubjects(String subject){
        this.academicSubjects.add(subject);
    }

    public List<String> getAcademicSubjects(){
        return this.academicSubjects;
    }

    public int getTeachingExperience(){
        return this.teachingExperience;
    }

    public void setTeachingExperience(int teachingExperience){
        this.teachingExperience = teachingExperience;
    }
}
