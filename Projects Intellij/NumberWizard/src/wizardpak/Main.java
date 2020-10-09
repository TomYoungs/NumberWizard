package wizardpak;

import java.util.Scanner;

public class Main {
    static int calculation(float lRange, float hRange){
        float calc = (hRange + lRange)/2;
        int guess = (int)calc;
        return guess;
    }
    public static void main(String[] args) {

        System.out.println("think of a number between 1 and 100. l for less m for more");
        int lRange = 1;
        int hRange = 100;
        int guess = calculation(lRange, hRange);
        boolean incorrect = true;
        while(incorrect){
            System.out.println("is it " + guess + "?");

            Scanner myInput = new Scanner(System.in);
            String userGuess = myInput.nextLine();
            if (userGuess.contains("l")){
                hRange = guess;
                guess = calculation(lRange, hRange);
            }
            else if (userGuess.contains("m")){
                lRange = guess;
                guess = calculation(lRange, hRange);
            }
            else if (userGuess.contains("yes")){
                System.out.println("yay!");
                incorrect = false;
            }
            if(lRange == hRange ){
                System.out.println("lies...");
                incorrect=false;
            }
        }

    }

}

