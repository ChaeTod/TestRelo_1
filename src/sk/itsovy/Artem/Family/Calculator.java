package sk.itsovy.Artem.Family;

import com.sun.deploy.net.proxy.ProxyUnavailableException;

public class Calculator {
    private boolean power;
    private String cName;

    public Calculator(boolean power, String cName) {
        this.cName = cName;
        power = false;
    }

    public Calculator() {

    }

    public boolean isPower() {
        return power;
    }

    public void turnOn() {
        power = true;
    }

    public void turnOff() {
        power = false;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int add(int a, int b) {
        if (isPower()) {
            return a + b;
        } else {
            return 0; // Not null, because int
        }
    }

    public void toggleStatus() {
        power = !power;

        /* More complicated way to check this condition
        if (isPower()){
            turnOff();
        } else {
            turnOn();
        }
       */
    }

    public double calculateDiagonalRectangle(int w, int l) {
        if (isPower()) {
            return Math.sqrt((w * w) + (l * l));
        } else {
            return 0;
        }
    }

    public double calAverageNum(int a, int b, int c) {
        if (isPower()) {
            return (double) (a + b + c) / 3; // 3.0
        } else {
            return 0;
        }
    }

    public double calculateCircleArea(double r) {
        if (isPower()) {
            return Math.PI * (r * r);
        } else {
            return 0;
        }
    }

    public double calculateBallVolume(double r) {
        if (isPower()) {
            return (double) (4 / 3) * Math.PI * Math.pow(r, 3);
        } else {
            return 0;
        }
    }

    public int calculateQuadHeight(int a, int b, int c, int d){
        if (isPower()){
            return a * b * c * d;
        } else {
            return 0;
        }
    }

    public double deptCalculator(int month, int year, double summ){
        if (isPower()){
            int rez = (year - 2019) * 12 + month;
            return (double)((rez * 8)/100) + summ;
        } else {
            return 0;
        }
    }

    public String convertDecimalToHexadecimal(int value) {
        if (isPower()) {
            return Integer.toHexString(value);
        } else {
            return null;
        }
    }

    public String convertDecimalToBycimal(int value) {
        if (isPower()) {
            return Integer.toBinaryString(value);
        } else {
            return null;
        }
    }

    public int calculateSquareArea(int a) {
        if (isPower()) {
            return a * a;
        } else {
            return 0;
        }
    }

    public double cmToInch(double a) {
        if (isPower()) {
            return a * 0.393701;
        } else {
            return 0;
        }
    }

    public double inchToSm(double a) {
        if (isPower()) {
            return a * 2.54;
        } else {
            return 0;
        }
    }

}
