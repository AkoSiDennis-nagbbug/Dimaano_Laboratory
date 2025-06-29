package Activity3;
public class Student extends Person {
    private String gradeLevel;

    public Student(String name, int id, String gradeLevel) {
        super(name, id);  
        this.gradeLevel = gradeLevel;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();  
        System.out.println("Grade Level: " + gradeLevel);
    }

    @Override
    public String toString() {
        return super.toString() + ", Grade Level: " + gradeLevel;
    }
}
