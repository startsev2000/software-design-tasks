public class Student {
    private final int id;
    private final String name;
    private final String lastName;
    private final String group;
    private int grade;

    public Student(int id, String name, String lastName, String group, int grade) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.group = group;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Name: " + name + "; Last name: " + lastName + "; Group: " + group + "; Grade: " + grade;
    }
}
