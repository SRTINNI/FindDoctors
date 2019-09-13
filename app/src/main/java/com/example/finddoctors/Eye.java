package com.example.finddoctors;

public class Eye {

    private String Name;
    private String Qualifications;
    private String Place;
    private String Contacts;

    public Eye() {
    }

    public Eye(String name, String qualifications, String place, String contacts) {
        Name = name;
        Qualifications = qualifications;
        Place = place;
        Contacts = contacts;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getQualifications() {
        return Qualifications;
    }

    public void setQualifications(String qualifications) {
        Qualifications = qualifications;
    }

    public String getPlace() {
        return Place;
    }

    public void setPlace(String place) {
        Place = place;
    }

    public String getContacts() {
        return Contacts;
    }

    public void setContacts(String contacts) {
        Contacts = contacts;
    }
}
