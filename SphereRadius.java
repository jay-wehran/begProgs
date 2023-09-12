
/*
    Jason Wehran
    2/7/23
    CSE007 Spring 2023: Homework 1
    VSCode / JDK 11
    Make a radius calculator when user enters volume
 */

import java.util.Scanner;
public class SphereRadius {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter the radius of the sphere");
        double v = scnr.nextDouble();

        //radius = (3*volume/4pi)^1/3

        double radius = Math.cbrt((3.0 * v) / (4.0 * Math.PI));

        System.out.println("Radius is equal to: " + radius);

    }


}
