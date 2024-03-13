import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> users = new ArrayList<>();

    // Метод для создания и добавления студента
    public void createStudent(String name, int birthYear) {
        int maxId = 0;
        for (User user : users) {
            if (user instanceof Student) {
                Student student = (Student) user;
                if (student.getStudentId() > maxId) {
                    maxId = student.getStudentId();
                }
            }
        }
        Student newStudent = new Student(name, birthYear, maxId + 1);
        users.add(newStudent);
    }

    // Метод для создания и добавления учителя
    public void createTeacher(String name, int birthYear) {
        int maxId = 0;
        for (User user : users) {
            if (user instanceof Teacher) {
                Teacher teacher = (Teacher) user;
                if (teacher.getTeacherId() > maxId) {
                    maxId = teacher.getTeacherId();
                }
            }
        }
        Teacher newTeacher = new Teacher(name, birthYear, maxId + 1);
        users.add(newTeacher);
    }

    public List<User> readUsers() {
        return users;
    }
}
