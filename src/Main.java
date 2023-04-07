public class Main {
    public static void main(String[] args) {

        StudentManager studentManager = new StudentManager();
        Student student = new Student("Necati1", "Keleş1", 1, "10", "Ankara1");
        Student student1 = new Student("Necati4", "Keleş4", 4, "40", "Ankara4");
        Student student2 = new Student("Necati5", "Keleş5", 5, "50", "Ankara5");
        studentManager.add(student);
        studentManager.add(student1);
        studentManager.add(student2);

        studentManager.delete(2);

        for (Student std : studentManager.getAll()) {
            System.out.println(std.getFirstName() + ":" + std.getStundentNo());
        }
    }
}