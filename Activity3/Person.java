package Activity3;
import java.util.Scanner;
public class Person {
    private String name;
    private int id;

    
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }

}
    
    class schooltest {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Student student = new Student("Albert Requizo", 54321, " Grade 10 ");
            Teacher teacher = new Teacher("Mr. Raphael", 17423, "Science");
            Staff staff = new Staff("Mr. Orola", 67270, "HR");

            System.out.println("Student Information:");
            student.displayInfo();
            System.out.println();
            System.out.println("Teacher Information:");
            teacher.displayInfo();
            System.out.println();
            System.out.println("Staff Information:");
            staff.displayInfo();
            System.out.println();
            
            scanner.close();
    
    
    }
}
