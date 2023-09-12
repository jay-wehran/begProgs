/*
Jason Wehran
2/21/23
CSE007 Spring 2023: HW 3 
VSCode / JDK 11
This program will display Tribonacci sequence and give the Nth result of a given input within the sequence
*/
import java.util.Scanner;
public class GetTribonacci {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

    System.out.print("Enter Tribonacci number: ");  
        int n=sc.nextInt();
    if (n > 0) {
        int a = 0, b = 1, c = 1;  
        int d = a + b + c; 
        int e=0; 
    System.out.println("\nSequence: ");
    System.out.println("");  
    System.out.print(a+"\t"+b+"\t"+c);
        for(int i=4; i<=n; i++) {  
            System.out.print("\t"+d); 
                a=b;  
                b=c;  
                c=d;  
                d=a+b+c;
                e=d-b-a; 

            
            }  
            System.out.println("");
            System.out.println("");
            System.out.println("The Tribonacci number for n=" + n + " is " + e + ".");

        } else {
            System.out.println("Not a valid entry.");
        }

        System.out.println(); 

        sc.close();
    }  
}