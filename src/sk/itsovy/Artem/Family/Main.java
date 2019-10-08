package sk.itsovy.Artem.Family;


import sk.itsovy.Artem.Other.FreeClass;
import sk.itsovy.Artem.Other.Testing;

import java.util.Date;

public class Main {
    public static void main(String[] args) { //Input parameters args - is a variable. String - variable and [] - is a field. This field needs to set an arguments to the start of the program.
    //static - later, but it indicates
        Date year, month;
        Person person1 = new Person(); // Declare the new variable type Person in memory with empty arguments.
        Person person2 = new Person();

        //Persons set arguments
        person1.setName("Dominik");
        person1.setAge(25);
        person1.setHeight(1.83);
        person1.setWeight(110);

        person2.setName("Lucia");
        person2.setAge(18);
        person2.setHeight(1.74);
        person2.setWeight(80);

        System.out.println(person1);
        System.out.println(person2);
/* Old declare of a Constructor
        Mobile mobile1 = new Mobile();
        mobile1.setBrand("Huawei");
        mobile1.setModel("P20 Pro");
        mobile1.setPhoneNum("+425842168456");
 */
        Person student = new Person("Oliver", 19, 1.95, 97, true, 'S');
        Person worker = new Person("Ocelot", 42, 1.84, 102, true, 'M');
        Person officer = new Person("Hank", 32, 1.75, 94, true, 'S');


        Car basic1 = new Car(55688.86,"GMC Tow-Car", 1994,"AF452C");
        Car lux1 = new Car(122580, "Mercedes-Benz G63 AMG", 2016, "FF00145");

        Mobile mobile1 = new Mobile("Huawei", "P20 Pro", "+442216844122");

        Mobile mobile2 = new Mobile("Nokia", "Lumia 80", "+425846546456");

        House brook1 = new House("New-York", "Main Brooklin", 11245, 111254.65, 6, true);
        House washing = new House("Washington", "DC", 74452, 1288568.20, 5, false);

        //Set of the variables to objects by methods
        person1.setMobile(mobile1);

        student.setMobile(mobile2);
        student.setCars(basic1);
        officer.setCars(lux1);

        worker.setHouse(brook1);
        officer.setHouse(washing);
        worker.m_Show();
        student.m_Show();
        officer.m_Show();
/*  Old output
        System.out.println("Your BMI: " +person1.calculateBMI());
        System.out.println("Your result is: " +person1.bmiCalc());
        System.out.println("Result: " +person1.getBMIStatus());
        System.out.println("Date: " +person1.getDateOfBirth());
*/

/*  Old output conditions
        if(student.hasMobilePhone()){
            System.out.println("Phone numb: " +student.getMobile().getPhoneNum());
        } else {
            System.out.println("Student has no mobile phone!");
        }

       if (student.hasCar()){
            System.out.println("Car numb: " +student.getCars().getCarNum());
        } else {
            System.out.println("Student has no car!");
        }
*/
        System.out.println("Car cost for now is: " + basic1.tCarCost());


        Calculator casio = new Calculator(false,"Casio YX552");
        person2.setCalc(casio);

        if (person2.hasCalculator()){
            casio.turnOn();
            System.out.println(" The summ of two numbers - " +person2.getCalc().add(2, 5));
            System.out.println(" The Square Area - " +person2.getCalc().calculateSquareArea(5));
            System.out.println(" The cm to inch - " +person2.getCalc().cmToInch(12));
            System.out.println(" The inch to cm - " +person2.getCalc().inchToSm(2));
            System.out.println(" The conversation - " +person2.getCalc().convertDecimalToHexadecimal(85473));
            System.out.println(" The conversation binary - " +person2.getCalc().convertDecimalToBycimal(85473));
            System.out.println(" The diagonal is - " +person2.getCalc().calculateDiagonalRectangle(10, 15));
            System.out.println(" THe circle area calc - " +person2.getCalc().calculateCircleArea(2));
            System.out.println(" The binary num - " +person2.getCalc().calAverageNum(2, 5, 8));
            System.out.println(" The volume of the ball - " +person2.getCalc().calculateBallVolume(5));
            System.out.println(" The height of the squad - " +person2.getCalc().calculateQuadHeight(5,6,8,2));
            System.out.println(" The dept is now - " +person2.getCalc().deptCalculator(5,2025,16000));
        }

        FreeClass storm1 = new FreeClass();
        //storm1.sayHello();
        storm1.sayN(1);
        //System.out.println(" The binary numbers is - " +storm1.getRoundNum(5));
        //System.out.println(" The second chanse is - " +storm1.getNexCont(11));

        Testing story = new Testing();
        //story.getAllNumbers();
        //story.getAllDecNumb();

        //DU:
        /*
        story.task_1();
        //story.task_2();
        story.task_3();
        story.task_4();
        story.task_5();

         */
        //story.task_6();
        //story.newTask();
        //story.task_7();
        /*

        story.task_8();
        story.task_9();
        //story.task_10();
        */
        //story.whileLoop_1();
        //story.whileLoop_2();
        //story.whileLoop_3();
        //story.iBanCalc();
        story.doWhileLoop();
        //story.whileChange();
        //story.whileMSD();
        /*
        System.out.println("------------------");
        System.out.println(story.task_7(7));

         */



        //person1.showDate();



    }
}
