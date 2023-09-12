

/*
    Jason Wehran
    1/27/23
    CSE007 Spring 2023: Lab 1
    VSCode / JDK 11
    Have computer do simple conversions
 */

public class ConvertWeight {
    public static void main (String args[]) {
        final double kgPerPound = 0.45359237;
        double weightInPounds = 150.32;
        double weightInKilograms; 

        weightInKilograms = kgPerPound*weightInPounds;
        System.out.println(weightInPounds + " lbs is equivalent to " + weightInKilograms + " kg");

    }
    
}
