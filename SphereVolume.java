
/*
    Jason Wehran
    2/7/23
    CSE007 Spring 2023: Homework 1
    VSCode / JDK 11
    Make a volume calculator when user enters radius
 */

import java.util.Scanner;

public class SphereVolume {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter the radius of the sphere");
        double r = scnr.nextDouble();

        double volume = (4.0/3.0)*Math.PI*(r*r*r);
        System.out.println("Volume of the sphere = " + volume);

              /*
         * The reason I used "4.0" and "3.0" is to identify that those numbers are 
         * doubles and that they should be divised as doubles and not integers.
         * Using the double values ensures that real division will be done
         * instead of integer division, which would give me a different ending 
         * value.
         */ 

    }
}
