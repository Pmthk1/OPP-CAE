import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private String id;
    private int score;

    public Student(String name, String id, int score) {
        this.name = name;
        this.id = id;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    public String calGrade() {
        if (score >= 85) {
            return "A";
        } else if (score >= 75) {
            return "B";
        } else if (score >= 65) {
            return "C";
        } else if (score >= 45) {
            return "D";
        } else {
            return "F";
        }
    }

    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Grade : " + calGrade());
    }
}

public class lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("Enter your Name (or type 'Exit' to finish):");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("Exit")) {
                break;
            }

            System.out.println("Enter your ID:");
            String id = scanner.nextLine();

            System.out.println("Enter your score:");
            int score = Integer.parseInt(scanner.nextLine());

            students.add(new Student(name, id, score));
        }

        System.out.println("******** Summary ************");
        for (Student student : students) {
            student.displayInfo();
            System.out.println();
        }
        scanner.close();
    }
}





