package sk.itsovy.Artem.Other;

public class FreeClass {
    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayN(int N) {

        while (N != 0) {
            System.out.println("--------------------------------");
            System.out.println("Hello user, I'm the quite big program, but now I only calculate some examples. Thank you!");
            N--;
        }
        /*
        for (int i = 0; i < N; i++){
            System.out.println("Hello to world from the for loop!");
        }
*/
        System.out.println(" ");
    }

    public int getRoundNum(int number) {
        /*
        while (number != 0) {
            if (number % 2 == 0) {
                return number;
            } else {
                number++;
            }
        }
        return number;
         */

        if (number % 2 == 0){
            return number;
        } else {
            return number + 1;
        }
    }
/*
    public int getNexCont(int b){
        if (b % 2 == 0){
            return b;
        } else {
            b++;
            if (b % 2 == 0){
                return b;
            } else {
                return b;
            }
        }
    }
 */
}

