import java.util.HashMap;
import java.util.Scanner;
import java.util.UUID;

public class Student {
//Attr

    private City hometown;
    private String name;
    private final UUID studentID;
    private Student buddy;
    Scanner myScan = new Scanner(System.in);
    School sch;

    //Constr


    public Student(String name,City hometown, School sch){
        this.sch= sch;
        this.studentID = UUID.randomUUID();

        this.name= name;

        this.hometown = hometown;
    }

    //Getters & setters

    public String reportBuddyName(){
        return buddy.name;
    }

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
        HashMap<String, City> cityHashMap =sch.getCityHashMap();
        for (String i : cityHashMap.keySet()) {
            System.out.println(i);
        }

        this.hometown = hometown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getStudentID() {
        return studentID;
    }


}
