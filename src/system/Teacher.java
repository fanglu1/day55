package system;

public class Teacher {
    private int ID;
    private String teacherName;
    private int teacherSalary;
    private int salaryEarned;

    public Teacher(int ID, String teacherName, int teacherSalary) {
        this.ID = ID;
        this.teacherName = teacherName;
        this.teacherSalary = teacherSalary;
        this.salaryEarned = 0;
    }

    public int getID() {
        return ID;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public int getTeacherSalary() {
        return teacherSalary;
    }

    public void setTeacherSalary(int teacherSalary) {
        this.teacherSalary = teacherSalary;
    }

    public void recieveTeacherSalary(int teacherSalary){
        salaryEarned += teacherSalary;
        School.updateTotalSpent(teacherSalary);
    }

    public String toString() {
        return "Name of the teacher is: " + teacherName + " Total salary earned: $" + salaryEarned;
    }
}
