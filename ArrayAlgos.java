/*
    Jason Wehran
    4/13/23
    CSE007 Spring 2023: Lab 8
    VSCode / JDK 11
    Program will run different algorithms based on method
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class ArrayAlgos{
public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("What size 1d array would you like?");
    int size = scnr.nextInt();
    int[] arrayToPlay = randomArray(size);



    System.out.println("Original Array: \n"+Arrays.toString(arrayToPlay));
    System.out.println("List in Ascending Order");
    ascendArray(arrayToPlay);
    printArray(arrayToPlay);

    System.out.println("What number would you like to search for?");
    int key = scnr.nextInt();
    int index = linearSearch(arrayToPlay, key);
    if (index != -1) {
        System.out.println("Your key was found at index " + index);
    } else {
        System.out.println("Your key was not found"); }

    System.out.println("List in Descending Order:");
    descendArray(arrayToPlay);
    printArray(arrayToPlay);
    System.out.println("Performing a binary search on your sorted array.");
    index = binarySearch1d(arrayToPlay, key);
    if (index != -1) {
        System.out.println("Your key was found at index " + index);
    } else {
        System.out.println("Your key was not found"); }

    System.out.println("Enter the number of rows in your 2D array: ");
    int rows = scnr.nextInt();
    System.out.println("Enter the number of columns in your 2D array: ");
    int cols = scnr.nextInt();
    int[][] randomArray2dim = randomArray(rows, cols);
    printArray(randomArray2dim);
    System.out.println("Enter a number to search for in your 2D array: ");
    key = scnr.nextInt();
    int[] indexArray = linearSearch(randomArray2dim, key);
    if (indexArray[0] != -1) {
         System.out.println("Your key was found at row " + indexArray[0] + ", column " + indexArray[1]);
    } else {
        System.out.println("Your key was not found");}

    scnr.close();
    }


public static int[] randomArray(int size){
    Random rand = new Random();
    int[] intArray = new int[size];
    for (int i = 0; i < intArray.length; i++){
        intArray[i] = rand.nextInt(100);
    }
    return intArray;
}
public static int[][] randomArray(int rows, int cols){
    Random rand = new Random();
    int[][] array = new int[rows][cols];
    int max = rows*cols;
    for (int i = 0; i < rows;i++){
        for (int j = 0; j< cols; j++){
            array[i][j] = rand.nextInt(max);
        }
    }
    return array;
}

public static void ascendArray(int[] arrayToPlay){ //! used insertion sort here
    for (int i = 1; i < arrayToPlay.length;i++){
        int temp = arrayToPlay[i];
        int j = i -1;
        while (j>=0 && arrayToPlay[j] > temp){ //descending(<) ascending(>)
            arrayToPlay[j+1] = arrayToPlay[j];
            j--;
        }
        arrayToPlay[j+1] = temp;
       }
}

public static void descendArray (int[]arrayToPlay){
    for (int i = 0; i < arrayToPlay.length-1;i++){
        int minIndex = i;
        for (int j = i + 1;j<arrayToPlay.length;j++){
            if (arrayToPlay[j] > arrayToPlay[minIndex]){ //* Line to change from ascending(<) to descending(>) */
                minIndex = j;
            }
        }
        int temp = arrayToPlay[i];
        arrayToPlay[i] = arrayToPlay[minIndex];
        arrayToPlay[minIndex] = temp;
    }
}

public static int linearSearch(int[] arrayToPlay, int key){
    for (int i = 0; i < arrayToPlay.length;i++){
        if (arrayToPlay[i] == key){
            return i;
        }
    }
    return -1;
}

public static int[] linearSearch(int[][] searchArray2d, int key){
    int[] result = {-1,-1};

    for (int i = 0; i < searchArray2d.length; i++){
        for (int j = 0; j < searchArray2d[i].length;j++){
            if (searchArray2d[i][j] == key){
                result[0] = i;
                result[1] = j;
                return result;
            }
        }
    }
    return result;
}

public static int binarySearch1d(int[] arrayToPlay, int key){
    int left = 0; //initialziing the left most index (0)
    int right = arrayToPlay.length-1; // initializing the right most index (5)

    while(left <= right){ // starting the while loop to check that array values are searchable
        int mid = (left + right) /2; // if above while statement is true, initializing the mid variable to start binary search
        if (key == arrayToPlay[mid]){ // returning mid if it matches target
            return mid;
        } else if (key > arrayToPlay[mid]){ //making the right index mid -1 to cut list in half if target is less than mid
            right = mid -1;
        } else if(key < arrayToPlay[mid]){ // making the left index mid + 1 to cut list in half if target is greater than mid
            left = mid + 1;
        }
        }
        return -1;
}

public static void printArray(int[] arrayToPlay){ //I created this method because I wanted my main method to look less crowded
    for (int i = 0; i < arrayToPlay.length;i++){
        System.out.print(arrayToPlay[i] + " ");
    }
    System.out.println();
}

public static void printArray(int[][] randomArray2dim){ //I overloaded this method because I wanted my main method to look less crowded
    for (int i = 0; i < randomArray2dim.length;i++){
        for (int j = 0; j < randomArray2dim[i].length;j++){
            System.out.print(randomArray2dim[i][j] + " ");
        }
        System.out.println();
    }
}


}