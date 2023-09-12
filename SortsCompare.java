/*
Jason Wehran
3/31/23
CSE007 Spring 2023: HW6
VSCode / JDK 11
This program will randomly generate two arrays and calculate which sorting method is faster
*/
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class SortsCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // prompting user for the length of the array
        boolean flag = true;
        int length;

        while (true) {
            System.out.println("Enter an integer value greater than 50: ");
            length = sc.nextInt();
            if (length < 50) {
                System.out.println("This Integer is less tha 50... please try again.");
            } else {
                System.out.println();
                flag = false;
                break;
            }
        }

        // generate the random array
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(length);
        }

        // copying the original array into a new array
        int[] copy = new int[length];
        for (int i = 0; i < length; i++) {
            copy[i] = array[i];
        }

        // printing the array
        System.out.println("Original Array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Copied Array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(copy[i] + " ");
        }
        System.out.println();

        // sort array1 using insertion sort and measure time
        long startInsertTime = System.nanoTime();
        insertionSortDesc(array);
        long endInsertTime = System.nanoTime();
        long totalInsertTime = endInsertTime - startInsertTime;
        // sort array2 using selection sort and measure time
        long startSelectTime = System.nanoTime();
        selectionSortDesc(copy);
        long endSelectTime = System.nanoTime();
        long totalSelectTime = endSelectTime - startSelectTime;
        System.out.println();

        // printing out insertion sorted array
        System.out.println("Sorted Array (Insertion Sort): ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Insertion sort time: " + totalInsertTime + "ns");
        System.out.println();

        // printing out selection sorted array
        System.out.println("Sorted Array (Selection Sort): ");
        for (int j = 0; j < copy.length; j++) {
            System.out.print(copy[j] + " ");
        }
        System.out.println();
        System.out.println("Selection sort time: " + totalSelectTime + "ns");
        System.out.println();


        System.out.println();
        System.out.println();
        if (totalInsertTime < totalSelectTime) {
            System.out.println("The Insertion Sort was faster.");
        } else {
            System.out.println("The Selection Sort was faster.");
        }
    }

    // creating a separate method to keep code organized
    public static void insertionSortDesc(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] < current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }

    //creating a seperate method
    public static void selectionSortDesc(int[] copy){
        for (int i = 0; i<copy.length-1; i++){
            int max = i;
            for (int j = i + 1; j<copy.length; j++){
                if (copy[j] > copy[max]) {
                    max = j;
                }
            }
            int temp = copy[i];
            copy[i] = copy[max];
            copy[max] = temp;
        }
    }
}