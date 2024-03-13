public class Teacher extends User {
    private int teacherId;

    public Teacher(String name, int birthYear, int teacherId) {
        super(name, birthYear);
        this.teacherId = teacherId;
    }

    // Геттер и сеттер
    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}
