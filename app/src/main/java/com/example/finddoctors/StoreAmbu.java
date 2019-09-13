package com.example.finddoctors;

public class StoreAmbu {

    private int id;
    private String name;
    private String place;
    private String number;

    public StoreAmbu(int id, String name, String place, String number) {
        this.id = id;
        this.name = name;
        this.place = place;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
