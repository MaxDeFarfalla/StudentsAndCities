import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

       HashMap<String, Student> students = new HashMap<String, Student>();


      City stockholm = new City("Sweden","Stockholm");


        students.put("max", new Student(1,"max",stockholm));
        students.put("erik", new Student(2,"Erik",stockholm));
        students.get("max").setBuddy(students.get("erik"));
        System.out.println(students.get("max").getBuddy().getName());
        System.out.println(students);
        do {
            boolean cont = true;
            addStudent(students);
            System.out.println("Enter additional Students? yes/no");
            Scanner myScan = new Scanner(System.in);
            String answer = myScan.nextLine();
            if (answer != "yes") {

            }
        }while ();


    }

    public static HashMap<String, Student> addStudent(HashMap<String, Student> students) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = myScan.nextLine();
        System.out.println("Enter country of birth");
        String country = myScan.nextLine();
        System.out.println("Enter city of birth");
        String city = myScan.nextLine();
        students.put(name, new Student(students.size()+1, name, new City(country, city)));
        System.out.println("New Student profile created");

        System.out.println(Arrays.asList(students));
        return students;
    }
}