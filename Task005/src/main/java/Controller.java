import java.util.ArrayList;
import java.util.List;

public class Controller {
    public void viewGroup(){
        StudyGroupService groups = new StudyGroupService();



        for (int i = 1; i <= 5; i++) {
            List<String> tempStudentsList = new ArrayList<>();
            String tempTeacher = String.format("Teacher №%d", i);
            for (int j = 1; j <=10; j++) {
                tempStudentsList.add(String.format("Student №%d", j));
            }
            groups.addGroup(tempTeacher, tempStudentsList);

        }

        for (var parentItem: groups.getGroups()) {
            System.out.println(parentItem.getTeacher());
            for (int i = 0; i < parentItem.getStudents().toArray().length; i++) {
                System.out.println("\t"+parentItem.getStudents().get(i));
            }
            System.out.println("--------------------------------------");
        }
    }
}
