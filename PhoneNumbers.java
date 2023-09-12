
/*
 * Jason Wehran
 * 2/7/2023
 * VSCode / Java 11
 * Lab 2 part 2
 * This program will ask the user for a month and day to determine the season
 * using switch(case)
 */
import java.util.Scanner;

public class PhoneNumbers {
    public static void main (String[] args) {
    
    long PhoneNumber;

    Scanner phone = new Scanner(System.in);
    System.out.print("Enter in your cell phone number: ");
    PhoneNumber = phone.nextLong();

    //2015723003 -> (201) 572-3003
    long rightMost = PhoneNumber % 10000;
    long firstSix = PhoneNumber /= 10000;
    long midThree = firstSix % 1000;
    long firstThree = firstSix /= 1000;
    System.out.println("Formatted phone number: " + "(" + firstThree + ") " + midThree + "-" + rightMost);

    phone.close();
    }
    
    
}
