/*
Jason Wehran
3/30/23
CSE007 Spring 2023: Lab 6 
VSCode / JDK 11
This program will generate integers representing student grades, sorts the list in ascending order, 
and searches for a specific grade or grade range as indicated by the user.
*/

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class RandomGrades{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numStudents = 0;

        while (true) {
            System.out.print("Enter the number of students enrolled in CSE7 (between 5 and 150): ");
            String line = sc.nextLine();

            // Check if the input is an integer
            boolean isInteger = true;
            int num = 0;
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c < '0' || c > '9') {
                    isInteger = false;
                    break;
                } else {
                    num = num * 10 + (c - '0');
                }
            }

            if (isInteger) {
                if (num >= 5 && num <= 150) {
                    numStudents = num;
                    break;
                } else {
                    System.out.println("Error: Please enter an integer between 5 and 150.");
                }
            } else {
                System.out.println("Error: Please enter an integer.");
            }
        }
        //Creating array of integers 0-100
        int[] grades = new int[numStudents];
        Random rand = new Random();
        for (int i = 0; i < numStudents; i++) {
            grades[i] = rand.nextInt(101);
    }
    //printing the unsorted array
    System.out.println();
    System.out.println("Unsorted Array: " + Arrays.toString(grades));
    System.out.println();

        //Sorting the array in ascending order using the insertion sort method
        // insertion sort algorithm
    for (int i = 1; i < grades.length; i++) {
        int key = grades[i];
        int j = i - 1;

        while (j >= 0 && grades[j] > key) {
            grades[j + 1] = grades[j];
            j = j - 1;
        }

        grades[j + 1] = key;
}
    // printing the sorted array
System.out.print("Sorted array: ");
for (int i = 0; i < grades.length; i++) {
    System.out.print(grades[i] + " ");
}

// calculating the average course grade'
double sum = 0;
for (int i = 0; i < grades.length; i++) {
    sum += grades[i];
}
double average = sum / grades.length;

// printing the average course grade
System.out.println();
System.out.printf("%nAverage course grade: %.3f%n", average);
System.out.println();

//prompt the user for grade search
int gradeCount = grades.length;
boolean validInput = false;
int grade = 0;

while (!validInput) {
    System.out.print("Enter a grade to search for (0-100) or a letter grade range (A,B,C,D,F): ");
    String input = sc.nextLine().toUpperCase();

    switch (input) {
        case "A":
        case "a":
            int countA = 0;
            for (int i = 0; i < grades.length; i++) {
                if (grades[i] >= 90) {
                    countA++;
                }
            }
            System.out.println("There are " + countA + " grades in the A range.");
            break;
        case "B":
        case "b":
            int countB = 0;
            for (int i = 0; i < grades.length; i++) {
                if (grades[i] >= 80 && grades[i] < 90) {
                    countB++;
                }
            }
            System.out.println("There are " + countB + " grades in the B range.");
            break;
        case "C":
        case "c":
            int countC = 0;
            for (int i = 0; i < grades.length; i++) {
                if (grades[i] >= 70 && grades[i] < 80) {
                    countC++;
                }
            }
            System.out.println("There are " + countC + " grades in the C range.");
            break;
        case "D":
        case "d":
            int countD = 0;
            for (int i = 0; i < grades.length; i++) {
                if (grades[i] >= 60 && grades[i] < 70) {
                    countD++;
                }
            }
            System.out.println("There are " + countD + " grades in the D range.");
            break;
        case "F":
        case "f":
            int countF = 0;
            for (int i = 0; i < grades.length; i++) {
                if (grades[i] < 60) {
                    countF++;
                }
            }
            System.out.println("There are " + countF + " grades in the F range.");
            break;
        default:
            System.out.println("Invalid input. Try Again");
            break;

}
}
    }
}
