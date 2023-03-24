public class Program {
    public static void main(String[] args) {
        /*
        Controller group = new Controller();
        group.viewGroup();

         */

        Staff teacher = new Staff("Иванов Иван Иваныч", 1,3);
        System.out.println("Преподаватель:");
        System.out.println(teacher.getFullName());
        System.out.println(teacher.getTeachingExperience());


        Student std = new Student("Петров Санёк",1, "5ИИТ-71", 1);
        System.out.println("Студент:");
        System.out.println(std.getFullName());
        System.out.println(std.getNameOfGroup());


    }
}
