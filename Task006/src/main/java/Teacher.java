import java.util.List;

public interface Teacher {

    void setAcademicSubjects(String subject);
    List<String> getAcademicSubjects();

    int getTeachingExperience();
    void setTeachingExperience(int teachingExperience);

}
