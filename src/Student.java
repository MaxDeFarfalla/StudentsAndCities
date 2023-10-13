import java.util.ArrayList;

public class Student {
//Attr

    private Student buddy;
    private City hometown;
    private String name;
    private int studentId;

    //Constr
    public String reportBuddyName(){
        return buddy.name;
    }

    public Student(int studentId,String name,City hometown){
        this.studentId = studentId;
        this.name= name;
        this.hometown = hometown;
    }

    //Getters & setters

    public Student getBuddy() {
        return buddy;
    }

    public void setBuddy(Student buddy) {
        this.buddy = buddy;
    }

    public City getHometown() {
        return hometown;
    }

    public void setHometown(City hometown) {
        this.hometown = hometown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
