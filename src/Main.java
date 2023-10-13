import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {

       HashMap<String, Student> students = new HashMap<String, Student>();


      City stockholm = new City("Sweden","Stockholm");


        students.put("Max", new Student(students.size(),"Max",stockholm));
        students.put("Erik", new Student(students.size(),"Erik",stockholm));
        students.get("Max").setBuddy(students.get("Erik"));
        System.out.println(students.get("Max").getBuddy().getName());
        System.out.println(students);
        boolean cont = true;
        //

        do {
        //Adds new Students to hashmap of Students
            addStudent(students);
            System.out.println("Enter additional Students? yes/no");
            Scanner myScan = new Scanner(System.in);
            String answer = myScan.nextLine().toLowerCase();
            if (!answer.equals("yes") && !answer.equals("y")) {
                cont = false;
            }
        }while (cont);


    }

    private static HashMap<String, Student> addStudent(HashMap<String, Student> students) {
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