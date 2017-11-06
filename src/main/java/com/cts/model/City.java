package cts.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cityDistance")
public class City {

    @Id
    private String id;

    String cityName;

    double distance;

    public City(String cityName, double distance) {
        this.cityName = cityName;
        this.distance = distance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }


    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", cityName='" + cityName + '\'' +
                ", distance=" + distance +
                '}';
    }
}