/*
Jason Wehran
3/23/23
CSE007 Spring 2023: Lab 5 
VSCode / JDK 11
This program will store roster and rating information for a soccer team.
*/

import java.util.Scanner;
import java.util.Random;


public class Roster {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] name = new String[8];
        int[] rating = new int[8];
        int inputNum = 1;

        //prompting the user for the input of 8 names and their respective ratings
        System.out.println("Enter 8 names and their respective ratings: ");
        System.out.println();
        for (int i = 0; i < 8; i++){
            System.out.print("Player " + inputNum + " name (Example: Wehran,Jason): ");
            name[i] = sc.next(); //storing input into first array
            inputNum++;
            System.out.print("Player Rating: "); 
            boolean looper = true;
            while (looper) {
                if (sc.hasNextInt()) {
                    rating[i] = sc.nextInt();
                    if (rating[i] >= 1 && rating[i] <= 9) {
                        looper = false;
                    } else {
                        System.out.println("Invalid Entry, try again...");
                        System.out.println();
                    }
                }
            }
        }
        int[] number = new int[8];
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(100); // randomly generating and storing 8 numbers
        }

        int sum = 0;
        for (int i = 0; i < rating.length; i++) {
            sum += rating[i];
        }

        double average  = (double) sum / rating.length;
        boolean loop = true;

        while(loop) {
        System.out.println();
        System.out.println("Choose a menu option: ");
        System.out.println("o - Output roster ");
        System.out.println("a - Output players above a rating ");
        System.out.println("u - Update player rating ");
        System.out.println("q - Quit ");

        char input = sc.next().charAt(0);
        System.out.println();
            switch (input) {
                case 'o':
                System.out.println("ROSTER:");
                int playNum = 1;
                for (int i = 0; i < 8; i++)
                    System.out.println("Player " + playNum + ": " + name[i] + "; " + "Jersey #: " + number[i] 
                    + "; " + "Rating: " + rating[i] + ";");
                    playNum++;
                    System.out.printf("Average player rating is: %.3f", average);
                    System.out.println();
                    System.out.println();
                    System.out.println("Returning to menu...");
                    System.out.println();
                break;

                case 'a':
                System.out.println("What rating would you like to search for?");
                System.out.println("Rating: ");
                int inputR = sc.nextInt();
                for(int i = 0; i < rating.length; i++){
                    if(rating[i] >= inputR){
                        System.out.println("Name: " + name[i] + "; Rating: " + rating[i] + "; Jersey #: " + number[i]);
                }
            } 
                break;

                case 'u': 
                System.out.println("Who do you want to update? ");
                String nameR = sc.next();
                for(int i = 0; i < name.length; i++){
                    if(name[i].equals(nameR)){
                        System.out.println("What should their new rating be? ");
                        boolean loopers = true;
                while (loopers) {
                    if (sc.hasNextInt()) {
                        int newRating = sc.nextInt();
                        if (newRating >= 1 && newRating <= 9) {
                            loopers = false;
                            rating[i] = newRating;
                            System.out.println("Name: " + name[i] + "; Rating: " + rating[i] + "; Jersey #: " + number[i]);
                    } else {
                        System.out.println("Invalid Entry, try again...");
                        System.out.println();                   
                } 
            }      
        }
    }
}         
                break;

                case 'q':
                System.out.println("Thanks for using our program and have a great day!");
                loop = false;
                break;
                default: 
                System.out.println("Invalid Entry... Try Again");
                System.out.println();

            }
        }
    }
}

     
