import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BabyClass babyClass = new BabyClass("BC001");
        MiddleClass middleClass = new MiddleClass("MC001");
        TopClass topClass = new TopClass("TC001");

        Teacher teacher1 = new Teacher("T001", "Alice", "Early Childhood Educator");
        Teacher teacher2 = new Teacher("T002", "Bob", "Assistant");

        babyClass.assignTeacher(teacher1);

        Student student1 = new Student("S001", "John", 2, "Mary");
        Student student2 = new Student("S002", "Emma", 3, "James");

        babyClass.enrollStudent(student1);
        babyClass.enrollStudent(student2);

        babyClass.conductActivity("Singing");
        babyClass.conductActivity("Painting");

        babyClass.generateClassReport();
    }
}