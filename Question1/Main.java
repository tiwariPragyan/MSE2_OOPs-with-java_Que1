import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(
            101,
            "Pragyan",
            "pragyan@gmail.com",
            "B.Tech IT",
            90,
            85,
            Arrays.asList("Java", "Python", "Spring Boot")
        );

        System.out.println("STUDENT DETAILS");
        System.out.println("----------------------");
        System.out.println(s1);

        // Testing setter
        s1.setProgrammingScore(95);

        System.out.println("\nAfter updating programming score:");
        System.out.println(s1.getProgrammingScore());
    }
}
