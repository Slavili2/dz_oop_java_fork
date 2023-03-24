import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {
    private List<StudyGroup> groups;
    public StudyGroupService(){
       groups = new ArrayList<>();
    }

    public void addGroup(String teacher, List<String> students){
        groups.add(new StudyGroup(teacher, students));

    }
    public List<StudyGroup> getGroups(){
        return this.groups;
    }
}
