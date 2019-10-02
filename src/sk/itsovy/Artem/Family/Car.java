package sk.itsovy.Artem.Family;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Car {
    private String carModel;
    private String carNum;
    private double carCost;
    private int carPet;
    private Person person;

    public Car(double carCost, String carModel, int carPet, String carNum){
        this.carCost = carCost;
        this.carModel = carModel;
        this.carNum = carNum;
        this.carPet = carPet;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getCarPet() {
        return carPet;
    }

    public void setCarPet(int carPet) {
        this.carPet = carPet;
    }

    public double getCarCost() {
        return carCost;
    }

    public void setCarCost(double carCost) {
        this.carCost = carCost;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }

    public double tCarCost(){
        return carCost - ((2019 - carPet) * 800);
    }

}
