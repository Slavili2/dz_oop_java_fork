import java.util.ArrayList;
import java.util.List;

public class Controller {
    private StudyGroupService groups;
    private View view;
    public Controller(){
        this.view = new View(new StudyGroupService());
    }

    public void setGroups(){
        this.view.setStudyGroups();
    }

    public void viewGroup(){
        this.view.getStudyGroups();
    }
}
