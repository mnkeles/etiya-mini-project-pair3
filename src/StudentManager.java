import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class StudentManager {
    public List<Student> studentList = new ArrayList<>();

    public StudentManager() {
        studentList.add(new Student("Necati", "Keleş", 1, "10", "Ankara"));
        studentList.add(new Student("Necati2", "Keleş2", 2, "20", "Ankara2"));
        studentList.add(new Student("Necati3", "Keleş3", 3, "30", "Ankara3"));
    }

    public void add(Student student) {
        for (Student student1 : studentList) {
            if (student.getStundentNo() == student1.getStundentNo()) {
                System.out.println("Hata --> studentNo : " + student.getStundentNo() + " mevcut");
                return;
            }
        }
        studentList.add(student);
        System.out.println(student.getFirstName() + "  Eklendi");
    }

    public void delete(int studentNo) {
        for (Student student : studentList) {
            if (studentNo == student.getStundentNo()) {
                studentList.remove(student);
                break;
            }
        }
    }

    public List<Student> getAll() {
        return studentList;
    }
}
