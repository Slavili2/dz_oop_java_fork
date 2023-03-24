import java.util.ArrayList;
import java.util.List;

/**
 * Класс StudyGroupService формирует набор групп во главе с преподавателем
 */
public class StudyGroupService {
    private List<StudyGroup> groups;
    public StudyGroupService(){
       groups = new ArrayList<>();
    }

    public void addGroup(Staff teacher, List<Student> students){
        groups.add(new StudyGroup(teacher, students));
    }
    public List<StudyGroup> getGroups(){
        return this.groups;
    }
}
