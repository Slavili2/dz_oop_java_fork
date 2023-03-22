public class Controller {
    public void viewGroup(){
        StudyGroupService groups = new StudyGroupService();
        groups.addGroup();

        for (var parentItem: groups.getGroups()) {
            System.out.println(parentItem.getTeacher());
            for (int i = 0; i < parentItem.getStudents().toArray().length; i++) {
                System.out.println("\t"+parentItem.getStudents().get(i));
            }
            System.out.println("--------------------------------------");
        }
    }
}
