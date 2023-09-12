import java.util.Scanner;
/*
Jason Wehran
2/18/23
CSE007 Spring 2023: Week 4 participation
VSCode / JDK 11
This program will produce an average based on 5 integer user inputs, and also modify for 10 user inputs
*/
public class Average2 {
    public static void main(String[] args){
        Scanner keys = new Scanner(System.in);
        int countNum = 10;
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
                    countNum = keys.nextInt(); // I feel like this is the wrong place to put this, and im not sure where it would go
                    loopNeeded = true;
                }

           }while(loopNeeded);

           sum += num;
           counter++;

           System.out.println("Average of 5 nums: "+ (sum/5));
        }
}
