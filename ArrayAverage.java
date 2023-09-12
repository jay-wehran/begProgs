/*
Jason Wehran
3/8/23
CSE007 Spring 2023: Week 7 participation
VSCode / JDK 11
This program will average certain items in an array
*/

import java.util.Random;
public class ArrayAverage {
    public static void main(String[] args) {
        Random ran = new Random();
        int len = Integer.parseInt(args[0]);
        // int len = Integer.parseInt(args[0])
        int[] numz= new int[len]; //declaring the array and assigning it a size
        int sum = 0;
        int min = 20, max = 0;
        int maxIndex = 0;
        int minIndex = 0;
        for (int i=0; i<numz.length; i++) {
            numz[i] = ran.nextInt(20)+1;
            sum += numz[i];


            if (numz[i] > max) {
                max = numz[i];
            }
            if (numz[i] < min) {
                min = numz[i];
            }
        }
        double average = sum/10.0;
        for(int temp:numz) {
            System.out.print(temp+" ");
        }
        System.out.println("The average of all elements is: " + average);


        // I was unsure about how to do the rest of this program
    }
}