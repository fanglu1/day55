package system;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher hector = new Teacher(1, "Hector", 500);
        Teacher matt = new Teacher(2, "Matt", 700);
        Teacher julian = new Teacher(3, "Julian", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(hector);
        teacherList.add(matt);
        teacherList.add(julian);

        Student fang = new Student(1, "Fang", 4);
        Student nick = new Student(2, "Nick", 12);
        Student cameron = new Student(3, "Cameron", 5);
        List<Student> studentList = new ArrayList<>();
        studentList.add(fang);
        studentList.add(nick);
        studentList.add(cameron);

        School ghs = new School(teacherList, studentList);

        Teacher erin = new Teacher(6, "Erin", 900);

        ghs.addTeacher(erin);

        fang.payAmt(5000);
        nick.payAmt(6000);
        System.out.println("GHS has earned $" + ghs.getTotalEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        hector.recieveTeacherSalary(hector.getTeacherSalary());
        System.out.println("GHS has spent for salary to " + hector.getTeacherName() + " and now has $" + ghs.getTotalEarned());
        matt.recieveTeacherSalary(matt.getTeacherSalary());
        System.out.println("GHD has spent for salary to " + matt.getTeacherName() + " and now has $ " + ghs.getTotalEarned());

        System.out.println(nick);
        matt.recieveTeacherSalary(matt.getTeacherSalary());
        System.out.println(matt);
    }
}
