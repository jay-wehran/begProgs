import java.util.Scanner;
public class ATM_FullMenu {
    public static void main(String[]args){
       
        Scanner input = new Scanner(System.in);


        double balance = 8673846.00;
        String fullName = ("Jason Wehran");
        String accountNum = ("0000000000");
        int pin = 0000;
        char accountType = 'C';
        final double ATM_FEE = 4.75;




        System.out.println("Enter Pin:");
        pin = input.nextInt();
        if(pin == 0000) {
            System.out.println("");
            System.out.println("Welcome to the Bank of America ATM System");
            System.out.println("Main menu:");
            System.out.println("");
            System.out.println("1 - View my balance");
            System.out.println("2 - Withdraw");
            System.out.println("3 - Deposit Funds");
            System.out.println("4 - View User Menu");
            System.out.println("5 - Exit"); 
            System.out.println("");
            System.out.println("Enter number 1-4 that coorelates with request: ");
        } else {
            System.out.println("Invalid pin! Try again...");
        }  
        
        int choice = input.nextInt();
        switch(choice) {
            case 1:
        System.out.println("Your current balance is " + "$" + balance);
                break;
            case 2:
        System.out.println("");
        System.out.println("Enter money to be withdrawn:");

        int withdraw = input.nextInt();
        if(balance >= withdraw) {
            double wBalance = balance - withdraw;
        System.out.println("");
        System.out.println("Remaining Balance = $" + wBalance);
        System.out.println("Please collect your money from the bottom of the machine.");
        System.out.println("");
        }
        else {
            System.out.println("");
            System.out.println("Insufficient Amount. Current Balance is: $" + balance);
            System.out.println("");
        }
        break;
            case 3:
        System.out.println("");
        System.out.println("Enter deposit amount:");
       
        int deposit = input.nextInt();


        double dBalance = balance + deposit;
        System.out.println("");
        System.out.println("Money has been deposited.");
        System.out.println("");
        System.out.println("Your current balance is = $" + dBalance );
        System.out.println("");
        break;

        case 4: 
        final int PIN = 1234;
        final String acct_num = "1234567890";
        String firstName = "Jason";
        String lastName = "Wehran";
        double currBal = 126.43;

        String password = "Password!";
        int passPin = 0;
        do {
        System.out.println("Enter Pin");
        passPin = input.nextInt();

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
        choice = input.next().charAt(0);
        
        
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
                    entry = input.next();

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

                    newPass = input.next(); 

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
                break;

            case 5:
            System.out.println("Are you sure you want to exit?");
        

        String yesOrNo = input.next();
        switch(yesOrNo) {
            case "YES":
                System.out.println("Have a Nice Day!");
        break;
            case "NO":
                System.out.println("Returning to main menu..."); //at this point I am very unsure as to how I would loop it back to the beginning...
        }
        input.close();

    }
  }
}
}
