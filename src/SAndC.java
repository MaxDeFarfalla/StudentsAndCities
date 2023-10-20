import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class SAndC {
    ArrayList<City> cities = new ArrayList<City>();
    HashMap<String, Student> students = new HashMap<String, Student>();
    public SAndC() {
        start();
    }

    public void start(){


        //Set of cities

        City berlin = new City("Germany", "Berlin");
        City tokyo = new City("Japan", "Tokyo");
        City london = new City("UK", "London");
        City oslo = new City("Norway", "Oslo");
        City stockholm = new City("Sweden", "Stockholm");
        cities.add(berlin);
        cities.add(stockholm);
        cities.add(tokyo);
        cities.add(oslo);
        cities.add(london);

        students.put("Max", new Student("Max",stockholm));
        students.put("Erik", new Student("Erik",stockholm));
        students.get("Max").setBuddy(students.get("Erik"));
        System.out.println(students.get("Max").getBuddy().getName());
        System.out.println(students);
        boolean cont = true;

        do

        {
            //Adds new Students to hashmap of Students
            addStudent(students);
            System.out.println("Enter additional Students? yes/no");
            Scanner myScan = new Scanner(System.in);
            String answer = myScan.nextLine().toLowerCase();
            if (!answer.equals("yes") && !answer.equals("y")) {
                cont = false;
            }
        }while(cont);


    }

    private static HashMap<String, Student> addStudent(HashMap<String, Student> students) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = myScan.nextLine();
        System.out.println("Enter country of birth");
        String country = myScan.nextLine();
        System.out.println("Enter city of birth");
        String city = myScan.nextLine();
        students.put(name, new Student(name, new City(country, city)));
        System.out.println("New Student profile created");
        System.out.println(Arrays.asList(students));
        return students;

    }
}

