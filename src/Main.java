import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        HashMap<String, Student> students = new HashMap<String, Student>();
        HashMap<String[],City> cities = new HashMap<String[], City>();

        cities.put(new String[] {"Sweden", "Stockholm"}, new City("Sweden", "Stockholm"));

        System.out.println(cities.get(new String[] {"Sweden", "Stockholm"}).getName());
        students.put("max", new Student(1,"max",stockholm));
        students.put("erik", new Student(2,"Erik",stockholm));
        students.get("max").setBuddy(students.get("erik"));
        System.out.println(students.get("max").getBuddy().getName());
        System.out.println(students);

    }

    public static HashMap<String, Student> addStudent(HashMap<String, Student> students) {
        Scanner myScan = new Scanner(System.in);
        String name = myScan.nextLine();
        String country = myScan.nextLine();
        String city = myScan.nextLine();
        students.put(name, new Student(students.size()+1, name, new City(country, city)));
        return students;
    }
}