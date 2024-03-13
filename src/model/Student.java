
public class Student extends User {
    private int studentId;

    public Student(String name, int birthYear, int studentId) {
        super(name, birthYear);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
