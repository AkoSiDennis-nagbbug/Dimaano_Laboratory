package Activity3;
public class Teacher extends Person {
    private String subject; 

    
    public Teacher(String name, int id, String subject) {
        super(name, id);  
        this.subject = subject;  
    }

    
    public String getSubject() {
        return subject;
    }

    
    public void setSubject(String subject) {
        this.subject = subject;
    }

    
    @Override
    public void displayInfo() {
        super.displayInfo();  
        System.out.println("Subject: " + subject);  
    }

    
    @Override
    public String toString() {
        return super.toString() + ", Subject: " + subject;  
    }
}


