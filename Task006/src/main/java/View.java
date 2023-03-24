import java.util.ArrayList;
import java.util.List;

public class View {
    private StudyGroupService groups;
    public View(StudyGroupService groups){
        this.groups = groups;
    }

    public void setStudyGroups(){
        List<Staff> tempTeachers = new ArrayList<>();
        tempTeachers.add(new Staff("Преподаватель №1", 1, 10));
        tempTeachers.get(0).setAcademicSubjects("История");
        tempTeachers.get(0).setAcademicSubjects("Обществознание");
        tempTeachers.get(0).setAcademicSubjects("Право");
        tempTeachers.add(new Staff("Преподаватель №2", 1, 8));
        tempTeachers.get(1).setAcademicSubjects("Математика");
        tempTeachers.get(1).setAcademicSubjects("Физика");
        tempTeachers.get(1).setAcademicSubjects("Сопромат");
        tempTeachers.add(new Staff("Преподаватель №3", 1, 6));
        tempTeachers.get(2).setAcademicSubjects("Химия");
        tempTeachers.get(2).setAcademicSubjects("Экология");
        tempTeachers.get(2).setAcademicSubjects("Биология");

        for (int i = 0; i < tempTeachers.toArray().length ; i++) {
            List<Student> tempStudent = new ArrayList<>();

            for (int j = 1; j <= 10; j++) {
                tempStudent.add(new Student("Студент №"+((i*10)+j), ((i*10)+j),"Группа №"+(i+1), i+1));
            }
            groups.addGroup(tempTeachers.get(i), tempStudent);
        }
    }

    public void getStudyGroups(){
        for (var parentItem: groups.getGroups()) {
            System.out.print("Преподаватель: ");
            System.out.println(parentItem.getTeacher().getFullName());
            System.out.println("Ведёт такие предметы как: ");
            for (var subjectsItem: parentItem.getTeacher().getAcademicSubjects()) {
                System.out.println("\t"+subjectsItem);
            }
            System.out.print("У группы: ");
            System.out.println(parentItem.getStudents().get(0).getNameOfGroup());
            System.out.println("В которой учатся студенты:");
            for (var childItem: parentItem.getStudents()) {
                System.out.println("\t"+childItem.getFullName());
            }

            System.out.println("\n---------разделитель-----------\n");
        }
    }

}
