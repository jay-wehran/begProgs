/*
Jason Wehran
3/5/23
CSE007 Spring 2023: Week 6 participation
VSCode / JDK 11
This program will print out items in the array as well as the length of the word
*/

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words = new String[5];
        int numWord = 1;

        for (int i = 0; i<words.length; i++) {
            System.out.println();
            System.out.println("Enter in word " + numWord + ":");
            words[i] = sc.next();
            numWord++;

        }
        for (int i =0; i<words.length; i++) {
            System.out.println(words[i] + " - length = " + words[i].length());

        }

    }
}