/*
Jason Wehran
3/21/23
CSE007 Spring 2023: Homework 5 
VSCode / JDK 11
This program will create a madlibs scheme based off choice
*/

import java.util.Random;
import java.util.Scanner;

public class Madlibs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean loop = true;

        //declaring all arrys below

        String[] adjective = {"alert", "angry", "anxious", "attrctive", "bad", "bewildered", 
         "blue", "bored", "breakable", "calm", "charming", "clear", "clumsy", "comfortable"};

        String[] subject = {"dog", "cat", "horse", "ice", "wood", "baseball player", "professor",
         "deck of cards", "student", "boat", "crane", "mouse", "building", "statue", "airplane"};

        String[] verb = {"hit", "grabbed", "ran", "swung", "ate", "drank","melted", "glanced",
         "made", "attacked", "defended", "drove", "flew", "paid", "threw"};

        String[] object = {"person", "couch", "desk", "golf club", "house", "technician", "programmer",
         "manager", "Santa Clause", "Maverick", "fighter jet", "basketball", "keys", "water bottle", "clay"};

        //declaring random class in order to generate a random number

        Random ran = new Random();


        //prompting the user

        while(loop) {
            System.out.println("Please select an option below: ");
            System.out.println("1 - Create Personal Mad Lib ");
            System.out.println("2 - Generate Random Mad Lib ");
            System.out.println("3 - Quit Program");
            System.out.println();

            int input = sc.nextInt();

            if (input == 1) {
                System.out.print("Enter the first adjective: ");
                String adj1 = sc.next();
                System.out.println();

                System.out.print("Enter the second adjective: ");
                String adj2 = sc.next();
                System.out.println();

                System.out.print("Enter the subject of the sentence: ");
                String sub = sc.next();
                System.out.println();

                System.out.print("Enter a verb: ");
                String vrb = sc.next();
                System.out.println();

                System.out.print("Enter the third adjective: ");
                String adj3 = sc.next();
                System.out.println();

                System.out.print("Enter the object of the sentence: ");
                String objct = sc.next();
                System.out.println();

                System.out.println("Your Personal Madlibs sentence is: ");
                System.out.println();
                System.out.println("The " + adj1 + " " + adj2 + " " + sub + " " + vrb + " the " + adj3 + " " + objct);
                System.out.println();
                System.out.println();
                System.out.println("Returning to Menu...");
                System.out.println();
                System.out.println();

            } else if (input == 2) {
                
                int adj1r = new Random().nextInt(adjective.length);
                int adj2r = new Random().nextInt(adjective.length);
                int subr =  new Random().nextInt(subject.length);
                int vrbr = new Random().nextInt(verb.length);
                int adj3r = new Random().nextInt(adjective.length);
                int objr = new Random().nextInt(object.length);
                
                int results[] = {adj1r, adj2r, subr, vrbr, adj3r, objr};


                System.out.println();
                System.out.println("Your randomly generated mad libs sentence is: " + "The " + adjective[adj1r] + " " + adjective[adj2r] + " " + 
                subject[subr] + " " + verb[vrbr] + " " + adjective[adj3r] + " " +object[objr]);
                System.out.println();
                System.out.println();
                System.out.println("Returning to menu...");
                System.out.println();
                System.out.println();

                } else if (input == 3){
                    System.out.println();
                    System.out.println("Thanks for playing, have a nice day!");
                    loop = false;

            } else {
                System.out.println(input + " is an invalid entry. Please Try Again.");
            }
        }
    }

}