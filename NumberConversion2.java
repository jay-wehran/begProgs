/*
Jason Wehran
2/14/23
CSE007 Spring 2023: Homework 2
VSCode / JDK 11
This program will convert a 4-bit, 3-digit, or 2-digit value into it's 
equivalent base-10 number.
*/

/*   #1 
 * 
 * a.) Numbering systems are a way to represent various types of numbers such as the decimal, binary, octal, or hexadecimal numbering systems.
 * b.) The binary numbering system is important because it simplifies the design and communication of the computers we use.
 * c.) 1. The decimal(base-10)numbering system is used when we are counting, for example, counting to 9.
 *     2. The hexadecimal numbering system is often used in machine code, as this numbering system allows for the use of less storage and more numbers.
 * d.) The biggest value an integer variable can hold is 2147483647. The binary value of that number is 01111111111111111111111111111111.
 */   


 import java.util.Scanner;

 public class NumberConversion2 {
     public static void main(String[] args) {
 
         System.out.print("Enter a type (hex, octal, binary): ");
         Scanner sc = new Scanner(System.in);
         String typeNum = sc.next();
 
 
         switch(typeNum) {
             case "hex": 
                 System.out.print("Enter a 2 digit hexadecimal value: ");
                 String userHex = sc.next();
                 char firstHex = userHex.charAt(0);
                 char secondHex = userHex.charAt(1);
                 int firstDecimal = 0;
                 int secondDecimal = 0;
                 switch(firstHex)

                 {

                     case '0':
                         firstDecimal = (int)(firstHex-'0') * 16; break;
                     case '1':
                         firstDecimal = (int)(firstHex-'0') * 16; break;
                     case '2':
                         firstDecimal = (int)(firstHex-'0') * 16; break;
                     case '3':
                         firstDecimal = (int)(firstHex-'0') * 16; break;
                     case '4':
                         firstDecimal = (int)(firstHex-'0') * 16; break;
                     case '5':
                         firstDecimal = (int)(firstHex-'0') * 16; break;
                     case '6':
                         firstDecimal = (int)(firstHex-'0') * 16; break;
                     case '7':
                         firstDecimal = (int)(firstHex-'0') * 16; break;
                     case '8':
                         firstDecimal = (int)(firstHex-'0') * 16; break;
                     case '9':
                         firstDecimal = (int)(firstHex-'0') * 16; break;
                     case 'A':
                         firstDecimal = 10 * 16; break;
                     case 'B':
                         firstDecimal = 11 * 16; break;
                     case 'C':
                         firstDecimal = 12 * 16; break;
                     case 'D':
                         firstDecimal = 13 * 16; break;
                     case 'E':
                         firstDecimal = 14 * 16; break;
                     case 'F':
                         firstDecimal = 15 * 16; break;
                 }

                 switch(secondHex)

                 {

                    case '0':
                        secondDecimal = (int)(secondHex-'0'); break;
                    case '1':
                        secondDecimal = (int)(secondHex-'0'); break;
                    case '2':
                        secondDecimal = (int)(secondHex-'0'); break;
                    case '3':
                        secondDecimal = (int)(secondHex-'0'); break;
                    case '4':
                        secondDecimal = (int)(secondHex-'0'); break;
                    case '5':
                        secondDecimal = (int)(secondHex-'0'); break;
                    case '6':
                        secondDecimal = (int)(secondHex-'0'); break;
                    case '7':
                        secondDecimal = (int)(secondHex-'0'); break;
                    case '8':
                        secondDecimal = (int)(secondHex-'0'); break;
                    case '9':
                        secondDecimal = (int)(secondHex-'0'); break;
                     case 'A':
                         secondDecimal = 10; break;
                     case 'B':
                         secondDecimal = 11; break;
                     case 'C':
                         secondDecimal = 12; break;
                     case 'D':
                         secondDecimal = 13; break;
                     case 'E':
                         secondDecimal = 14; break;
                     case 'F':
                         secondDecimal = 15; break;

                 }
 
            
                 int hexAnswer = firstDecimal + secondDecimal;
                 System.out.println(userHex+" is "+ hexAnswer + " in decimal form.");
                 break; 

                 case "octal": {
                    System.out.println("Please enter a 3 digit octal value: ");
                    String userOctal = sc.next();
                    char firstOctal = userOctal.charAt(0);
                    char secondOctal = userOctal.charAt(1);
                    char thirdOctal = userOctal.charAt(2);
                    firstDecimal = (int)(firstOctal-'0') * (8 * 8);
                    secondDecimal = (int)(secondOctal-'0') * (8);
                    int thirdDecimal = (int)(thirdOctal-'0');

                    int octAnswer = firstDecimal + secondDecimal + thirdDecimal;
                    System.out.println(userOctal + " is " + octAnswer + " in decimal form.");
                    break; 
                    
                 }

                case "binary": {
                    System.out.println("Please enter a 4 digit binary value:");
                    String userBinary = sc.next();
                    char firstBinary = userBinary.charAt(0);
                    char secondBinary = userBinary.charAt(1);
                    char thirdBinary = userBinary.charAt(2);
                    char fourthBinary = userBinary.charAt(3);

                    firstDecimal = (int)(firstBinary-'0') * (2 * 2 * 2);
                    secondDecimal = (int)(secondBinary-'0') * (2 * 2);
                    int thirdDecimal = (int)(thirdBinary-'0') * (2);
                    int fourthDecimal = (int)(fourthBinary-'0');
                    
                    int binAnswer = firstDecimal+secondDecimal+thirdDecimal+fourthDecimal;
                    System.out.println(userBinary + " is " + binAnswer + " in decimal form.");
                    break;
            }
                    default: 
                    System.out.println("Invalid Entry.");
                    break;

        }
        sc.close();
    }
            
}


 