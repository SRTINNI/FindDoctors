package com.example.finddoctors;

public class Neurology {

    private static String Name;
    private static String Qualifications;
    private static String Place;
    private static String Contacts;

    public Neurology() {
    }

    public Neurology(String name, String qualifications, String place, String contacts) {
        Name = name;
        Qualifications = qualifications;
        Place = place;
        Contacts = contacts;
    }

    public static String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public static String getQualifications() {
        return Qualifications;
    }

    public void setQualifications(String qualifications) {
        Qualifications = qualifications;
    }

    public static String getPlace() {
        return Place;
    }

    public void setPlace(String place) {
        Place = place;
    }

    public static String getContacts() {
        return Contacts;
    }

    public void setContacts(String contacts) {
        Contacts = contacts;
    }
}
