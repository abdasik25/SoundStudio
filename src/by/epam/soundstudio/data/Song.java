/**
 * Created by Alexander Lomat on 08.05.19
 * Version 0.0.1
 * DATA: Abstract Class SONG
 */


package by.epam.soundstudio.data;

public abstract class Song {

    private long id;
    private String name;
    private int durationInSeconds;
    private double cost;
    private String country;
    private int establishmentYear;

    public static final int SECONDS_DIVISOR = 60;

    public Song(long id, String name, int durationInSeconds, double cost, String country, int establishmentYear) {
        this.id = id;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
        this.cost = cost;
        this.country = country;
        this.establishmentYear = establishmentYear;
    }

    public Song() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public void setDurationInSeconds(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getEstablishmentYear() {
        return establishmentYear;
    }

    public void setEstablishmentYear(int establishmentYear) {
        this.establishmentYear = establishmentYear;
    }


}


