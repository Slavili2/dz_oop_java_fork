import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {
    private List<StudyGroup> groups;
    public StudyGroupService(){
       groups = new ArrayList<>();
    }

    public void addGroup(){
        for (int i = 1; i <= 5; i++) {
            StudyGroup grp = new StudyGroup();
            grp.setTeacher(String.format("Teacher %d", i));
            for (int j = 1; j <=10; j++) {
                grp.setStudents(String.format("Student %d", j));
            }

            groups.add(grp);

        }

    }
    public List<StudyGroup> getGroups(){
        return this.groups;
    }
}
