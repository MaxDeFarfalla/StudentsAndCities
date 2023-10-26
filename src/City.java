import java.util.ArrayList;

public class City {
//Attr
    private String country;
    private String cityName;
    private ArrayList<Student> residence;

    //Constr

    public City(String country, String cityName){
        this.country = country;
        this.cityName = cityName;
    }

    //Getters


    public String getCountry() {
        return country;
    }

    public String getCityName() {
        return this.cityName;
    }

    public ArrayList<Student> getResidence() {
        return residence;
    }

    public void setResidence(ArrayList<Student> residence) {
        this.residence = residence;
    }
}
