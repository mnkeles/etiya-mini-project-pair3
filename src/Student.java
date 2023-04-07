public class Student {
    private String firstName;
    private String lastName;
    private int studentNo;
    private String nationalId;
    private String group;

    public Student() {

    }

    public Student(String firstName, String lastName, int studentNo, String nationalId, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNo = studentNo;
        this.nationalId = nationalId;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStundentNo() {
        return studentNo;
    }

    public void setStundentNo(int stundentNo) {
        this.studentNo = stundentNo;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
