/*
Jason Wehran
2/17/23
CSE007 Spring 2023: Lab 4
VSCode / JDK 11
This program will check for a palindrome given a number or integer
*/

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        String phrase = "";
        int number = 0;
        boolean loop = true;
        boolean isNum = false;

        do {
            System.out.println("Enter a message (either Int or String)");
            if(in.hasNextInt()){
                // read it in
                number = in.nextInt();
                //chreck if in range
            if(number >=11 && number <= 1000000 ) {
                //      if yes: end loop
                loop = false;
                isNum = true;
            } else {
                //      if no: repromt
                System.out.println("Integer out of range.");
                }
            } else{
                phrase = in.nextLine();
                loop = false;
            }


          } while (loop);

            if(isNum){
            //this is where the coee will go to revers the value
                int reverse = 0;
                int digit, temp = number;
            while (temp !=0){
                digit = temp % 10; //isolate the right most digit
                reverse = reverse * 10 + digit;
                temp /= 10;
            }
            if(reverse == number){
                System.out.println("int " + number + " is a palindrome");
            }else {
                System.out.println("int " + number + " is NOT a palindrome");

            }
        }else {
            //handle the inpit as a string
            String phraseNoSp = "";
            for(int i = 0; i<phrase.length(); i++){
                if(!Character.isWhitespace(phrase.charAt(i))){
                    phraseNoSp+=phrase.charAt(i);
                }
            }


           String rev = "";
           for(int index = phraseNoSp.length()-1; index >= 0; index--){
                rev +=phraseNoSp.charAt(index);
           }
           if(rev.equals(phraseNoSp)){
            System.out.println("String " + phrase + " is a palindrome");
           } else {
            System.out.println("String " + phrase + " is NOT a palindrome");
           }

        }
    }
}