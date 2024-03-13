public class StudentView {
    // Метод для вывода данных студента в консоль
    public void printStudentDetails(Student student) {
        System.out.println("Student Information:");
        System.out.println("Name: " + student.getName());
        System.out.println("Birth Year: " + student.getBirthYear());
        System.out.println("Student ID: " + student.getStudentId());
    }
}
