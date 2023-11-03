import java.util.*;
import java.util.function.BiConsumer;

public class School {
  private ArrayList<City> cities = new ArrayList<>();
   private HashMap<String, Student> students = new HashMap<>();

   private HashMap<String, City> cityHashMap = new HashMap<>();
    public School() {
        start();
    }

    public void start(){


        //Set of cities

        City berlin = new City("Germany", "Berlin");
        City tokyo = new City("Japan", "Tokyo");
        City london = new City("UK", "London");
        City oslo = new City("Norway", "Oslo");

        cities.add(berlin);

        cities.add(tokyo);
        cities.add(oslo);
        cities.add(london);
        String name= "Gothenburg";
        cityHashMap.put(name,new City("Sweden",name));
        name = "Stockholm";
        cityHashMap.put(name,new City("Sweden",name));
        System.out.println(cityHashMap);

        students.put("Max", new Student("Max",cityHashMap.get("Stockholm"),this));
        students.put("Erik", new Student("Erik",cityHashMap.get("Stockholm"), this));
        students.get("Max").setBuddy(students.get("Erik"));
        System.out.println(students.get("Max").getBuddy().getName());
        System.out.println(students);
        boolean cont = true;

        do{
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

    private HashMap<String, Student> addStudent(HashMap<String, Student> students) {
        Scanner myScan = new Scanner(System.in);


       System.out.print("Enter name:");
        String name = myScan.nextLine();


        /*System.out.println("Enter country of birth");
        String country = myScan.nextLine();
        System.out.println("Enter city of birth");
        String city = myScan.nextLine();*/
        // Get input for hometown and verify existence take hometown from cities array

       /* for (City hometown : cities) {
            System.out.println(hometown.getCityName());
        } */

        for (Map.Entry<String,City> entry : cityHashMap.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.print("Select hometown:");

        String hometownEntry = myScan.nextLine();


        students.put(name, new Student(name,cityHashMap.get(hometownEntry),this));
        System.out.println("New Student profile created");

cityHashMap.get(hometownEntry).setResidence(students.get(name));

        System.out.println(Arrays.asList(students));
        return students;

    }

    //Getters and setters


    public HashMap<String, Student> getStudents() {
        return students;
    }

    public HashMap<String, City> getCityHashMap() {
        return cityHashMap;
    }
}

