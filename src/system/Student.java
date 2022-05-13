package system;

public class Student {
    private int ID;
    private String studentName;
    private int gradeLevel;
    private int amtPaid;
    private int amtTotal;

    public Student(int ID, String studentName, int gradeLevel){
        this.amtPaid = 0;
        this.amtTotal = 30000;
        this.ID = ID;
        this.studentName = studentName;
        this.gradeLevel = gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public void payAmt(int amt) {
        amtPaid += amt;
        School.updateTotalEarned(amtPaid);
    }

    public int getID() {
        return ID;
    }
    public int getGradeLevel() {
        return gradeLevel;
    }
    public int getAmtPaid() {
        return amtPaid;
    }
    public int getAmtTotal() {
        return amtTotal;
    }
    public int getRemainingAmt() {
        return amtTotal - amtPaid;
    }
    public String toString() {
        return "The student's name is: " + studentName + " Total amount paid so far is: $" + amtPaid;
    }
}
