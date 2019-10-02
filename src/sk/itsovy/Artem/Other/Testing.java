package sk.itsovy.Artem.Other;

import jdk.nashorn.internal.ir.CallNode;

public class Testing {
    public void task_1() {
        for (int i = 1230; i < 10000; i++) {
            if (i % 615 == 0) {
                System.out.println(i);
            }
        }
    }

    public void task_2() {
        for (int i = 100; i < 1000; i++) {

        }
    }

    public void task_3() {
        int count = 0;
        for (int i = 10; i < 100; i++) {
            if (i % 3 == 0)
                count++;
        }
        System.out.println(count);
    }

    public void task_4() {
        int j = 10000000, count = 0;
        for (int i = 1; i <= j; i++) {
            if (j % i == 0)
                count++;
        }
        System.out.println(count);
    }

    public void task_5() {
        int a = 45, b = 87, c = 37;
        double obJem = a * b * c, poverh = 2 * (a * b + b * c + a * c);
        System.out.println(obJem);
        System.out.println(poverh);
    }

    public void task_6() {
        double j = 0.5;
        for (int i = 10; i >= 2; i -= 0.5) {
            System.out.println(i);
            System.out.println(i - j);
        }
    }

    public void task_7() {
        int num = 1;
        for (int i = 7; i > 0; i--) {
            num *= i;
        }
        System.out.println(num);
    }

    public void task_8() {
        for (int i = 100; i < 1000; i++) {
            if (i % 2 != 0 && i % 27 == 0 && i % 13 != 0)
                System.out.println(i);
        }
    }

    public void task_9() {
        for (int i = 0; i < 10000; i += 91)
            if (i % 2 == 0)
                System.out.println(i);
    }

    public void task_10() {
        for (int i = 10000; i < 99999; i++) {
            int a = i % 10, b = (i / 10) % 10, c = (i / 100) % 10, d = (i / 1000) % 10, e = (i / 10000) % 10;
            if (a == e && b == d)
                System.out.println(i);
        }
    }

    public void newTask() {
        int j = 1973, count = 0;
        for (int i = 2; i < Math.sqrt(j); i++) {
            int a = (i / 1000) % 10, b = (i / 100) % 10, c = (i / 10) % 10, d = i % 10;
            if (j % i == 0) {
                //System.out.print(i+ " ");
                //System.out.println(a+ " " +b+ " " +c+ " " +d);
                count++;
            }
            if (count == 0) {
                System.out.println("The first number is: " + i);
            } else {
                System.out.println("This is not a first number!");
            }
        }
    }

    public void whileLoop_1() {
        int i = 10000;
        while (i < 100000) {
            int a = i % 10, b = (i / 10) % 10, c = (i / 100) % 10, d = (i / 1000) % 10, e = (i / 10000) % 10;
            if ((a + b + c + d + e) == 43)
                System.out.println(i);
            i++;
        }
    }

    public void whileLoop_2() {
        int m = 100000 - (100000 % 613);
        System.out.println(m);
    }

    public void doWhileLoop() {
        int value = 10;
        int space = 0, star = 0;
        for (int i = 1; i <= value; i++) {
            space = value - i;  // 10 - 1
            System.out.print(" ");  //left stage space
            for (int j = 1; j <= space; j++) {
                star = i * 2 - 1;  //1 * 2 - 1
                //System.out.println(" ");
                System.out.print(" "); // left stage space
            }
            for (int m = 1; m <= star; m++){
                //System.out.print("    ");
                System.out.print(" * ");
            }
            System.out.println(" ");
        }

        // Full triangle
        /*
        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print(" ");
            }
            for (int m = 1; m <= i; m++) {
                System.out.print(" ");
            }

            }
            //System.out.println(" ");
            for (int k = 1; k <= 10; k++) {
                System.out.print(" ");
            for (int z = 1; z <= k; z++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
         */


        //Full oblique quad
        /*
        for (int i = 1; i <= 5; i++){
            for (int j = 10; j >= i; j--){
                System.out.print(" ");
            }
            for (int k = 1; k <= 15; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
         */

        /* !The same task, but in a different way from the teacher!
        for (int r = 1; r <= 10; r++) {
            for (int m = 1; m < r; m++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= 11 - r; z++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
         */
        /*
        for (int r = 10; r >= 1; r--) {
            for (int m = 1; m <= 10 - r; m++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= r; z++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
         */
/*
        for (int r = 10; r >= 1; r--) {
            for (int m = 10; m >= 1 + r; m--) {
                System.out.print(" ");
            }
            for (int z = 1; z <= r; z++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
 */

        /* !The same task as belong, but in a different way from the teacher!
        for (int r = 1; r <= 10; r++) {
            for (int m = 1; m <= 10 - r; m++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= r; z++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        */

        /*
        // Show the triangle in opposite direction.
        int p = 10;
        for (int a = 1; a <= 10; a++) {
            p = p - 1;
            for (int c = 0; c <= p; c++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= a; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        */

        /*
        System.out.println("--------------");
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= i; j++) {
                //i = 10 - i - j;
                if (j == 1) {
                    System.out.print("              ");

                }
            }

        for (int z = i; z >= 1; z--){
                System.out.print("*");
                //for (int z = 1; z <= 2; z++){
                  //  System.out.print("  ");
                //}
            }
            //System.out.print("*");
            System.out.println(" ");
            //System.out.println(i);
        }
        */

        /* The part of the triangle from down to up
        for (int i = 20; i >= 1; i--){
            for (int j = i; j >= 1; j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
         */

        /*
        for (int i = 1; i <= 30; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
            System.out.println(i);
        }
         */



        /* //Same as below, but with one for
        for (int i = 1; i <= 15; i++){
            System.out.print("*");
            if (i % 5 == 0)
                System.out.println(" ");
        }
        */


        /*
        for (int j = 1; j < 4; j++){
            for (int i = 1; i < 6; i++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
*/

        /*
        for (int j = 1; j < 5; j++){
            for (int i = 1; i <= j; i++){
                System.out.print("**");
            }
            System.out.println(" ");
        }
         */


        /*int j = 0;
        for (int i = 2; i < 5; i++){
            j = 1;
            while(j <= i){
                System.out.println("*");
                j++;
            }
        }

         */

        /*int i = 5, k = 7, n = 0;
        do {
            n = k * i;
            i++;
            k = k + 3;
            System.out.println(n);
        } while (5 * i < k);

         */
    }

/*
    public void iBanCalc(){
        String iBan = "02000000188051515300";

        System.out.println("----------------");
        System.out.println(iBan.length());

        int mood = Integer.parseInt(iBan) % 97;
        mood *= 98;

        System.out.println(mood);
            }
 */

    public void whileChange() {
        int a = 20, b = 45, c = 0;
        if (a < b) {
            a = b - a; //a = 25, b = 45
            b = b - a; //a = 25, b = 20
            a = a + b; //a = 45, b = 20
            System.out.println("-----------------");
            System.out.println(a);
            System.out.println(b);
        }
    }


    public void whileMSD() {
        int a = 22, b = 40, c = 0;
        boolean cond = true;
        if (a < b) {
            c = a; //48
            a = b; //88
            b = c; //48
        }
        while (a % b != 0) {  // a = 88 % b = 48
            c = b; //48
            b = a - b; //40
            a = c; //48
            if (a < b) {
                c = a; //48
                a = b; //88
                b = c; //48
            }
        }
        System.out.println("--------------");
        //System.out.println(a);
        System.out.println(b);
    }

    public void whileLoop_3() { //

        int a = 6, b = 8, c = 1;
        while ((a * c) % b != 0) {
            c++;
        }
        System.out.println(a * c);
    }

/*
        int a = 6, b = 4;
        int j = 1;
        while ((a * b) % j != 0) {
            j++;
        }
        System.out.println(a * j);
    }
 */


    //Old task 7
    /*
    public int task_7(int n){
        if (n == 0){
            return 0;
        } else {
            return n * (n - 1);
        }
    }
     */


    public void getAllNumbers() {

        double j = 1;
        double n = 1 / j;
        double value = 1;
        double summ = 0;
        int count = 0;

        /*
        while (j != 100){
            j = j + 1;
            n = 1/j;
            //value = value + (1/n);
            //System.out.println(j);
            System.out.println(n);
            count++;
        }
        //System.out.println(n);

        System.out.println(count);
        */
        for (int i = 1; i < 100; i++) {
            value = (double) 1 / i;
            summ += value;
        }
        System.out.println(summ);

        /*
        for (int i = 1; i < 100; i++) {
            j = j + value;
            value = value * 2;
        }
        j = (j/1000);
        System.out.println((double)j);
        */

        /*
        System.out.println(j);
        j = 0;
        j = ((1 + 158)*158)/2; // Math method
        System.out.println(j);
         */
    }
        /*
        int time = 514623; // day, time, min, sec
        int day = time/86400;
        time = time % 86400;
        int hour = time/3600;
        time = time % 3600;
        int minutes = time/60;
        int sec = time % 60;
        System.out.println("Time: " +time+ " Days: " +day+ " Hours: " +hour+ " Minutes: " +minutes+ " Secs: " +sec);
*/
        /*
        int count = 0;
        //int j = 870;
        for (int i = 1000; i < 10000; i++){
            int a = i % 10, b = (i/1000) % 10, c = (i/100) % 10, d = (i/10) % 10; //4325 5 - a, 4 - b, 3 - c, 2 - d
            if (i % 12 == 0 && b > a && c % 2 == 0){
            //if (b > a && c % 2 == 0 && (a + b + c + d <= 12)){
                System.out.println(i);
                count++;
            }

            //i = i * 2;
            //if ((i % 2 == 0 || i % 3 == 0) && i % 10 != 0)
                //if (i % 10 != 0)
                    //System.out.print(i + " ");
        }
        System.out.println(count);
        // for (int i = 0; i < 100; i += 2) more shorter version of for loop

         */


    public void getAllDecNumb() {
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            int a = i % 10, b = (i / 10) % 10, c = (i / 100) % 10;
            if ((i % 2 != 0) && (a + b + c < 6))
                count++;
            //if ((a == b && b != c) || (b == c && b != a) || (c == a && c != b)) 112 115
            //if (a + b <= c && b + c <= a) 101 202 303 404 505...
            //System.out.print(i + " ");
        }
        System.out.println(count);
        /*
        for (int i = 99; i > 10; i -= 2){
            System.out.print(i + " ");
        }

         */
    }
}
