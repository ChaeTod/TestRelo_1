package sk.itsovy.Artem.Family;

import java.time.Month;

public class Mobile {
    private String brand;
    private String model;
    private String phoneNum;

    public Mobile (){  // Constructor without any parameters

    }

    public Mobile (String brand, String model, String phoneNum){
        this.brand = brand;
        this.model = model;
        this.phoneNum = phoneNum;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}


