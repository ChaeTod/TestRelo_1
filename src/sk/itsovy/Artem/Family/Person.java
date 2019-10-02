package sk.itsovy.Artem.Family;
import java.time.YearMonth;

public class Person {
    // Declaration of the variables
    private String name; // Usually, I'll need to use two variables for the first and the second name of the person.
    private int age;
    private boolean gender;  //T - male, F - female.
    private double height;
    private int weight;
    private char status; //S - single, M - married, D - divorced, W - widow.
    private Mobile mobile; // default NULL
    private Calculator calc;
    private Car cars;
    private House house;

    // Methods a.k.a - function. Working, when someone called it and it can return something.
/*
    void about(){
        System.out.println("Hello, I'm class Person.");
    }
*/
    public Person (String  name, int age, double height, int weight, boolean gender, char status){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.status = status;
        this.gender = gender;
    }

    public Person() {

    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Car getCars() {
        return cars;
    }

    public void setCars(Car cars) {
        this.cars = cars;
    }

    public Mobile getMobile() {
            return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public Calculator getCalc() {
        return calc;
    }

    public void setCalc(Calculator calc) {
        this.calc = calc;
    }

    public String getName() {
        return name;
    }

    public void setName(String meno) {
        name = meno;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    double calculateBMI() {
        double bmi;
        bmi = weight/(height * height);
        // System.out.println("Your BMI: " +bmi); // We have our own method to display it!
        return bmi;
    }

    String bmiCalc(){
        String afford;
        if (calculateBMI() <= 80 && calculateBMI() >= 50){
            afford = "BMI is fine!";
        } else  {
            afford = "BMI is BAD!";
        }
        return afford;
    }

   String getBMIStatus() {
        if (calculateBMI() < 20)
            return "povozovka";
        if (calculateBMI() < 25)
            return "optimal";
        if (calculateBMI() < 30)
            return "nadoptimal";

        return "dotacny";
    }

    public boolean hasHouse(){
        return house != null;
    }

    public String getOwnName_H(){
        if (hasHouse()){
            return getName();
        } else {
            return null;
        }
    }

    public boolean hasMobilePhone() {
        if(mobile == null)
            return false;
        else
            return true;
    }

    public boolean hasCar(){
        return cars != null;
    }

    public String getOwnName_C(){
        if (hasCar())
            return getName();
        else
            return null;
    }

    public boolean hasCalculator(){
        return calc != null;
    }

    private static YearMonth now(){
        //YearMonth now = now();
        return now();
    }

    public void m_Show(){
        System.out.println("------------------------------------");
        System.out.println(" Name: " +name);
        System.out.println(" Age: " +age);
        System.out.println(" Height/Weight: " +height+ "/" +weight);
        System.out.println(" BMI: " +bmiCalc()+ "(" +getBMIStatus()+")");
        System.out.println(" Gender: " +gender);
        System.out.println(" Status: " +status);

        if (hasMobilePhone()){
            System.out.println(" Phone: " +mobile.getModel());
        } else {
            System.out.println(name+ " haven't any phone yet!");
            System.out.println("-------------------------------------");
        }
        if (hasHouse()){
            System.out.println(name+ " has a House:");
            h_Show();
        } else {
            System.out.println(name+ " haven't any house yet!");
            System.out.println("-------------------------------------");
        }
        if(hasCar()){
            System.out.println(name+ " have a car: ");
            c_Show();
        } else {
            System.out.println(name+ " haven't any Car yet!");
        }
        System.out.println("-------------------------------------");
    }

    public void h_Show(){
        //System.out.println("This is house of: " +);
        //System.out.println("----------------------------------");
        System.out.println(" The house belongs to " + getOwnName_H());
        System.out.println(" House is in: " +house.getCity());
        System.out.println(" House is hood: " +house.getHood());
        System.out.println(" House has a num: " +house.gethNum());
        System.out.println(" House is cost about: " +house.gethCost());
        System.out.println(" House has " +house.getRooms()+ " rooms.");
        //System.out.println("House owned?" +house.isOnw());
        //System.out.println("-----------------------------------");
    }

    public void c_Show(){
        //System.out.println("-------------------------------------");
        System.out.println(" The car is belong to " +getOwnName_C());
        System.out.println(" Car's model is: " +cars.getCarModel());
        System.out.println(" Car's year of manufacture: " +cars.getCarPet());
        System.out.println(" Car's number is: " +cars.getCarNum());
        System.out.println(" Car was cost from start: " +cars.getCarCost());
        System.out.println(" Car's value for now: " +cars.tCarCost());
        System.out.println("-------------------------------------");
    }

    static void showDate(){
        System.out.println("Date is: " +YearMonth.now());
    }

    int getDateOfBirth(){
        //YearMonth now = new YearMonth();
      // int now = now();
       //YearMonth now = now();
       int dOfB = 2019 - age;

       return dOfB;
    }


}


