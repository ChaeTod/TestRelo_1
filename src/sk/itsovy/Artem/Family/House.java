package sk.itsovy.Artem.Family;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class House {
    private String city;
    private String hood;
    private int hNum;
    private double hCost;
    private int rooms;
    private boolean onw; // T - the Person is owns this house. F - the person is in rent

    // To create not only the fulled constructors, so you can do like this: Person person1 = new Person();
    public House(){

    }

    public House(String city, String hood, int hNum, double hCost, int rooms, boolean own){
        this.city = city;
        this.hood = hood;
        this. hNum = hNum;
        this.hCost = hCost;
        this.rooms = rooms;
        this.onw = own;
    }

    public double gethCost() {
        return hCost;
    }

    public boolean isOnw() {
        return onw;
    }

    public int gethNum() {
        return hNum;
    }

    public int getRooms() {
        return rooms;
    }

    public String getCity() {
        return city;
    }

    public String getHood() {
        return hood;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void sethCost(double hCost) {
        this.hCost = hCost;
    }

    public void sethNum(int hNum) {
        this.hNum = hNum;
    }

    public void setHood(String hood) {
        this.hood = hood;
    }

    public void setOnw(boolean onw) {
        this.onw = onw;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
}


