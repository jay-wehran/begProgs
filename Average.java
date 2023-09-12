import java.util.Scanner;

/*
Jason Wehran
2/18/23
CSE007 Spring 2023: Week 4 participation
VSCode / JDK 11
This program will produce an average based on 5 integer user inputs
*/

public class Average {
    public static void main(String[]args){
        //validate that the user typed and integer & read it in
        //add the integer to a running total
        //repeat above steps 5 times
        //divide the sum by 5
        Scanner keys = new Scanner(System.in);

        int counter = 0;
        double sum = 0;
        while (counter < 5);
        int num = 0;
           boolean loopNeeded = true;
           do{
                System.out.println("Enter an Integer");
                if(keys.hasNextInt()){//if the user typed an int (and followed directions)
                    num = keys.nextInt();
                    loopNeeded = false;
                }else {
                    System.out.println("Not an int");
                    String junk = keys.nextLine();
                }

           }while(loopNeeded);

           sum += num;
           counter++;

           System.out.println("Average of 5 nums: "+ (sum/5));
        }
        
    }

    // the program compiles but does not run and I was unable to figure out why
    

