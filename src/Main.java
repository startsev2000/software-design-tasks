import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    protected static ArrayList<Student> students = new ArrayList<>();

    public static void fillStudentList() {
        for (int i = 0; i < random.nextInt(35) + 2; ++i) {
            students.add(new Student(i, "Student " + i, "Studentov " + i, "219", -1));
        }
        System.out.println("Students list successfully filled!");
    }

    public static void main(String[] args) {
        fillStudentList();
        System.out.println("1. /r - choose random student");
        System.out.println("2. /l - list of students with grades");
        System.out.println("3. /end - finish program");

        System.out.print(">");
        String input = scanner.next();
        while (true) {
            switch (input) {
                case "/r" -> {
                    int randomId = random.nextInt(students.size());
                    if (students.get(randomId).getGrade() == 0) {
                        System.out.println("Student " + students.get(randomId).getLastName() + " is answering:");
                        System.out.println("Is he in the class? y/n");
                        String answer = scanner.next();
                        if (answer.equals("y") || answer.equals("yes")) {
                            System.out.println("Grade for the answer: ");
                            int grade = scanner.nextInt();
                            students.get(randomId).setGrade(grade);
                            System.out.println("Grade saved!");
                        } else if (answer.equals("n") || answer.equals("no")) {
                            System.out.println("Student " + students.get(randomId).getLastName() + " is absent!");
                            students.get(randomId).setGrade(0);
                        } else {
                            System.out.println("Incorrect command!");
                        }
                    } else {
                        System.out.println("Student " + students.get(randomId).getLastName() + " already answered!");
                        System.out.println("Choose another student with /r.");
                    }

                }
                case "/l" -> {
                    for (Student student : students) {
                        System.out.println(student);
                    }
                }
                case "/end" -> {
                    System.out.println("Program finished working!");
                    return;
                }
            }
            System.out.print(">");
            input = scanner.next();
        }
    }
}
