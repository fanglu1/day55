package system;

import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalEarned;
    private static int totalSpent;

    public School(List<Teacher> teachers, List<Student> students){
        this.teachers = teachers;
        this.students = students;
        totalEarned = 0;
        totalSpent = 0;
    }
    public List<Student> getStudents() {
        return students;
    }
    public int getTotalEarned() {
        return totalEarned;
    }
    public static void updateTotalEarned(int moneyEarned) {
        totalEarned += moneyEarned;
    }
    public int getTotalSpent() {
        return totalSpent;
    }
    public static void updateTotalSpent(int moneySpent){
        totalEarned -= moneySpent;
    }
 }
