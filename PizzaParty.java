
/*
    Jason Wehran
    2/7/23
    CSE007 Spring 2023: Lab 2
    VSCode / JDK 11
    Have computer do simple conversions
 */
import java.util.Scanner;


public class PizzaParty {
    public static void main(String[] args) {

        double budget;
        int numFriends;
        double avgSlicePerson;
        double costPerPizza;
        int wholePizzas;
        double totalPizzaCost;
        double totalTaxOwed;
        double total; 
        final int slicePerPizza = 8;
        final double salesTax = .06;
        final double deliveryFee = 4.99;


        Scanner scan = new Scanner(System.in) ;

        System.out.println("How much money do you have to spend?");
         budget = scan.nextDouble();

        System.out.println("How many friends will join you on Friday?");
         numFriends = scan.nextInt();

        System.out.println("How many slices will each person eat on Friday?");
         avgSlicePerson = scan.nextDouble();
        
        System.out.println("What is the cost per pizza on Friday?");
         costPerPizza = scan.nextDouble();

         System.out.println("How many friends will join you on Saturday? ");
         int numFriendsSat = scan.nextInt();

         System.out.println("How many slices will each person eat on Saturday?");
         double avgSliceSat = scan.nextDouble();

         System.out.println("How much does each pizza cost on Saturday?");
         double costSat = scan.nextDouble();

         //the following calculates the number of pizzas for friday night
        double slices = (numFriends + 1) * avgSlicePerson; 
        double pizzas = slices/slicePerPizza; 
        wholePizzas = (int) (Math.ceil(pizzas));

        //calculating the total cost for friday
        totalPizzaCost = wholePizzas * costPerPizza;
        totalTaxOwed = totalPizzaCost * salesTax;
        total = totalPizzaCost + totalTaxOwed + deliveryFee;

        //printing out friday results
        System.out.println("");
        System.out.println("Friday Night Party");
        System.out.printf("%d Pizzas: $%.2f\n",wholePizzas,totalPizzaCost);
        System.out.printf("Tax: $%.2f\n",totalTaxOwed);
        System.out.printf("Delivery Fee: $%.2f\n",deliveryFee);
        System.out.printf("Total Cost: $%.2f\n",total);
        System.out.println("");

        //calculaye the number of pizzas for saturday night
        double slicesSat = (numFriendsSat + 1) * avgSliceSat; 
        double pizzasSat = slicesSat/slicePerPizza; 
        int wholePizzasSat = (int) (Math.ceil(pizzasSat));

        //calculate the total cost for saturday
        double totalPizzaCostSat = wholePizzasSat * costSat;
        double totalTaxOwedSat = totalPizzaCostSat * salesTax;
        double totalSat = totalPizzaCostSat + totalTaxOwedSat + deliveryFee;

        //print out saturday results
        System.out.println("Saturday Night Party");
        System.out.printf("%d Pizzas: $%.2f\n",wholePizzasSat,totalPizzaCostSat);
        System.out.printf("Tax: $%.2f\n",totalTaxOwedSat);
        System.out.printf("Delivery Fee: $%.2f\n",deliveryFee);
        System.out.printf("Total Cost: $%.2f\n",totalSat);
        System.out.println("");

        //compare wkndTotal to budget
        double wkndTotal = total + totalSat;
        int totalPizzas = wholePizzas + wholePizzasSat;

        System.out.printf("Weekend Total: " + totalPizzas + " for $%.2f\n",wkndTotal);
        System.out.println("");
        System.out.println("Can You Afford? ");
        if (wkndTotal < budget) {
            System.out.println("You can afford Friday and Saturday!");
        } else if(budget < wkndTotal) {
            System.out.println("You cannnot afford Friday and Saturday!");
        }

        scan.close();
    }
    
}
