import java.util.Scanner;
public class BankUser{
    public static void main(String[]args){
        Scanner scnr = new Scanner(System.in);
        final int PIN = 1234;
        final String acct_num = "1234567890";
        String firstName = "Jason";
        String lastName = "Wehran";
        double currBal = 126.43;

        String password = "Password!";
        int passPin = 0;
        do {
        System.out.println("Enter Pin");
        passPin = scnr.nextInt();

        if (passPin != PIN) {
            System.out.println();
            System.out.println("Incorrect Pin. Try again");
            System.out.println(); }

        } while (passPin != PIN); 

        System.out.println();
        System.out.println("Bank User Menu");
        System.out.println("B: Display Current Balance");
        System.out.println("U: View Username");
        System.out.println("P: Change Password");
        System.out.println("Q: Program ends");

        System.out.println("");
        System.out.print("ENTER LETTER ASSOCIATED WITH DESIRED REQUEST: ");
        char choice = scnr.next().charAt(0);
        
        
        switch (choice) {
            case 'B':
                System.out.println("");
                System.out.printf("YOUR CURRENT BALANCE IS: $%.2f\n",currBal);
                System.out.printf("YOU ARE ABLE TO WITHDRAW: $%.2f\n",currBal);
                System.out.println("");
                int floorBal = (int) Math.floor(currBal);
                if (floorBal % 20 == 0) {
                    System.out.println(floorBal);
                } else {
                    System.out.println("Not a multiple of 20");
                }
                break;
            case 'U':
                int len1 = lastName.length();
                String lastNum = acct_num.substring(9,10);
                String secondLastNum = acct_num.substring(8, 9);
                if (len1 >= 5) {
                String userLast = lastName.substring(0,5);
                String userFirst = firstName.substring(0,1);
                System.out.println("YOUR CURRENT USERNAME IS: " + userLast + userFirst + secondLastNum + lastNum);
                } else if (len1 < 5) {
                    String userFirst = firstName.substring(0,1);
                    System.out.println("YOUR CURRENT USERNAME IS: " + lastName + userFirst + secondLastNum + lastNum);
                }
                break;
            case 'P':
            String entry = "";
            String newPass= ""; 
                do {
                    System.out.println();
                    System.out.println("ENTER CURRENT PASSWORD:");
                    System.out.println();
                    entry = scnr.next();

                    if (!entry.equals(password)) {
                        System.out.println();
                        System.out.println("Incorrect Password, Try Again");
                        System.out.println(); }
                    
                } while (!entry.equals(password));

                do {
                    System.out.println();
                    System.out.print("NEW PASSWORD MUST CONTAIN:\n FIVE CHARACTERS\n ONE CAPITAL LETTER\n ONE SPECIAL CHARACTER\n"); 
                    System.out.println();
                    System.out.print("ENTER NEW PASSWORD: ");
                    System.out.println();

                    newPass = scnr.next(); 

                 if (newPass.equals(password)) {
                    System.out.println();
                    System.out.println("NEW PASSWORD MATCHES OLD PASSWORD PLEASE PICK A NEW PASSWORD");
                    System.out.println(); }
                    else if (!newPass.equals(password)) {
                        System.out.println();
                        System.out.println("YOU HAVE SUCCESSFULLY CHANGED YOUR PASSWORD");
                    }
                } while (newPass.equals(password));

                System.out.println("Your new password is" + newPass);
                break;


            case 'Q': 
            System.out.println();
            System.out.println("Thank you for your time, have a nice day!");        
            System.out.println();
            break;

            default:
            System.out.println("Invalid Entry");

            
    
        }
        scnr.close();
    }
}
