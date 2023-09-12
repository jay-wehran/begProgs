
/*
Jason Wehran
2/21/23
CSE007 Spring 2023: HW 3 
VSCode / JDK 11
This program will simulate the casino game craps using random die rolls.
*/
import java.util.Scanner;
public class Craps {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int randDie1 = (int)(Math.random() * 6 + 1);
        int randDie2 = (int)(Math.random() * 6 + 1);
        System.out.println("randDie1: " + randDie1);
        System.out.println("randDie2: " + randDie2);


        if (randDie1 == 1 && randDie2 == 1 ){
            System.out.println("The name of the roll is Snake Eyes");
        }
        else if (randDie1 == 2 && randDie2 == 1){
            System.out.println("The name of the roll is Ace Deuce");
        }
        else if (randDie1 == 2 && randDie2 == 2){
            System.out.println("The name of the roll is Hard Four");
        }
        else if (randDie1 == 3 && randDie2 == 1){
            System.out.println("The name of the roll is Easy Four");
        }
        else if (randDie1 == 3 && randDie2 == 2){
            System.out.println("The name of the roll is Fever Five");
        }
        else if (randDie1 == 3 && randDie2 == 3){
            System.out.println("The name of the roll is Hard Six");
        }
        else if (randDie1 == 4 && randDie2 == 1){
            System.out.println("The name of the roll is Fever Five");
        }
        else if (randDie1 == 4 && randDie2 == 2){
            System.out.println("The name of the roll is Easy Six");
        } 
        else if (randDie1 == 4 && randDie2 == 3){
            System.out.println("The name of the roll is Seven Out");
        } 
        else if (randDie1 == 4 && randDie2 == 4){
            System.out.println("The name of the roll is Hard Eight");
        } 
        else if (randDie1 == 5 && randDie2 == 1){
            System.out.println("The name of the roll is Easy Six");
        }
        else if (randDie1 == 5 && randDie2 == 2){
            System.out.println("The name of the roll is Seven Out");
        }
        else if (randDie1 == 5 && randDie2 == 3){
            System.out.println("The name of the roll is Easy Eight");
        }
        else if (randDie1 == 5 && randDie2 == 4){
            System.out.println("The name of the roll is Nine");
        } 
        else if (randDie1 == 5 && randDie2 == 5){
            System.out.println("The name of the roll is Hard Ten");
        } 
        else if (randDie1 == 6 && randDie2 == 1){
            System.out.println("The name of the roll is Seven Out");
        }
        else if (randDie1 == 6 && randDie2 == 2){
            System.out.println("The name of the roll is Easy Eight");
        }
        else if (randDie1 == 6 && randDie2 == 3){
            System.out.println("The name of the roll is Nine");
        }
        else if (randDie1 == 6 && randDie2 == 4){
            System.out.println("The name of the roll is Easy Ten");
        }
        else if (randDie1 == 6 && randDie2 == 5){
            System.out.println("The name of the roll is Yo-leven");
        }
        else if (randDie1 == 6 && randDie2 == 6){
            System.out.println("The name of the roll is Boxcards");
        }
        else if (randDie1 == 1 && randDie2 == 2){
            System.out.println("The name of the roll is Ace Deuce");
        }
        else if (randDie1 == 1 && randDie2 == 3){
            System.out.println("The name of the roll is Easy Four");
        }
        else if (randDie1 == 2 && randDie2 == 3){
            System.out.println("The name of the roll is Fever Five");
        }
        else if (randDie1 == 1 && randDie2 == 4){
            System.out.println("The name of the roll is Fever Five");
        }
        else if (randDie1 == 2 && randDie2 == 4){
            System.out.println("The name of the roll is Easy Six");
        } 
        else if (randDie1 == 3 && randDie2 == 4){
            System.out.println("The name of the roll is Seven Out");
        } 
        else if (randDie1 == 1 && randDie2 == 5){
            System.out.println("The name of the roll is Easy Six");
        }
        else if (randDie1 == 2 && randDie2 == 5){
            System.out.println("The name of the roll is Seven Out");
        }
        else if (randDie1 == 3 && randDie2 == 5){
            System.out.println("The name of the roll is Easy Eight");
        }
        else if (randDie1 == 4 && randDie2 == 5){
            System.out.println("The name of the roll is Nine");
        } 
        else if (randDie1 == 1 && randDie2 == 6){
            System.out.println("The name of the roll is Seven Out");
        }
        else if (randDie1 == 2 && randDie2 == 6){
            System.out.println("The name of the roll is Easy Eight");
        }
        else if (randDie1 == 3 && randDie2 == 6){
            System.out.println("The name of the roll is Nine");
        }
        else if (randDie1 == 4 && randDie2 == 6){
            System.out.println("The name of the roll is Easy Ten");
        }
        else if (randDie1 == 5 && randDie2 == 6){
            System.out.println("The name of the roll is Yo-leven");



            }
            System.out.println("Would you like to play again? Type y or n");
            char choice = sc.next().charAt(0);
            switch(choice) {
                case 'y': 
                // unsure about how to return to start, i understand it is something about putting this in the loop.
                case 'n':
               System.out.println("Thanks for playing. Have a nice day!");
            }
        }
        }

    
