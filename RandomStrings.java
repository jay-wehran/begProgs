/*
    Jason Wehran
    4/12/23
    CSE007 Spring 2023: HW7
    VSCode / JDK 11
    Have the program fill a one or two dimension array with random strings
 */

import java.util.Scanner;
import java.util.Random;
public class RandomStrings{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in); //! This declares the scanner

        System.out.println("Enter the dimension of a 1D array");
        int length = getInt(s); //! this invokes the method getInt using the scanner from above


        System.out.println("Enter two dimensions -- row and col for the 2D array");
        int row = getInt(s);
        int col = getInt(s);
        String[] words = new String[length];
        String[][] moreWords = new String[row][col];
 
 
        fillArray(words); //! print the 1d array
        System.out.println();
        System.out.println("Words: ");
        System.out.println();
        printArray(words);
        fillArray(moreWords); //! prints the 2d array
        System.out.println();
        System.out.println("More Words:");
        System.out.println();
        printArray(moreWords); //!prints the 
        
        System.out.println();
        

 
        insertionSortArray(words);
        System.out.println();
        System.out.println("Sorted Words(1D): ");
        printArray(words);
 
        System.out.println();
 
        String key = "Exam 2";
        searchArray(words,key);
        // searchArray(words, words[0]);
 

        System.out.println();
        System.out.println("Lots of Words (Again): ");
        System.out.println();
        printArray(moreWords);
        System.out.println();
 
 
        insertionSortArray(moreWords[0]);
        System.out.println("Lots of Words, Sorted first row: ");
        printArray(moreWords);
 
 
        reverseArrays(moreWords);
        System.out.println();
        System.out.println("Lots of Words Reversed: ");
        System.out.println();
        printArray(moreWords);
        System.out.println();
 
 
        String key1 = "TESTINGSEARCH";
        searchArray(moreWords, key1);
        searchArray(moreWords, moreWords[row-1][col-1]);
        s.close(); 
    }
    

    // this method will validate that the user inputs correct dimensions ranging from 5:95
    public static int getInt(Scanner s){
        int num = 0;
        boolean loopControl = true;
        do{
            if(s.hasNextInt()){
                num = s.nextInt();
                if(num >=5 && num <=95){
                    loopControl = false;
                } else {
                    System.out.println("Out of range -- 5:95");
                }
            } else {
                System.out.println("not an int");
                // scan.nextLine();
            }
        } while (loopControl);
        return num;
    }


    //this method generates a random char within the given range
    public static char generateChar(){ 
        Random rand = new Random();
        int r = rand.nextInt(3); // Generate a random integer between 0 and 2 inclusive
        if (r == 0) {
            return (char)(rand.nextInt(10) + '0');
        } else if (r == 1) {
            return (char)(rand.nextInt(26) + 'A');
        } else {
            return (char)(rand.nextInt(26) + 'a');
        }
    }

    //this method will fill the 1D array with random strings made from the random characters generated
    public static void fillArray(String[] words){ 
        for (int i = 0; i < words.length; i++){
            char[] chars = new char[10];
            for (int j = 0; j < 10; j++){
                chars[j]= generateChar();
            }
            words[i] = new String(chars);
        }
    }
    //this method will fill the 2D array with random strings made from the random characters generated
    public static void fillArray(String[][]moreWords){ 
        for (int i = 0; i < moreWords.length; i++){ //! find out how this actually works because it would be good to know
            for (int j = 0; j < moreWords[i].length;j++){ 
                char[] chars = new char[10];  
                for (int k=0;k<10;k++){
                    chars[k] = generateChar();
                }
                moreWords[i][j] = new String(chars);
            }
        }
    }
    //this method uses a for loop to print the 1D array
    public static void printArray(String[] words){ 
        for (int i = 0; i < words.length; i++){
            System.out.println(words[i] + " ");
        }
    }
    //this method uses a for loop to print the 2D array
    public static void printArray(String[][]moreWords){ 
        for (int i = 0; i < moreWords.length; i++){
            for (int j = 0; j < moreWords[i].length;j++){
                System.out.print(moreWords[i][j] + " ");
            }
            System.out.println();
    }
}
    //this method iterates through the the sorted 1D array and puts it in descending order based on unicode value
    public static void insertionSortArray(String[]words){
        for (int i = 1; i<words.length;i++){ //using i = 1 because loop starts at index 1 and compares to the left
            String temp = words[i]; //in this case temp will be equal to the number in the 1st index
            int j = i -1; // declaring int j to assign j to index 0 in this case 
            while(j>=0 && words[j].compareTo(temp) < 0){// if j >= 0 and the 0 index is less than index 1 ... descending(<)
                words[j+1] = words[j]; //the new min will be j+1
                j--; // this will decrement j once every loop
            }
            words[j+1] = temp; // this will move the swapped number to the right
        }
    }
    // this method reverses the 2D array by row and column
    public static void reverseArrays(String[][]moreWords){
        for (int i = 0; i < moreWords.length / 2; i++){
            for (int j = 0; j < moreWords[i].length; j++){
                String temp = moreWords[i][j];
                moreWords[i][j] = moreWords[moreWords.length - i - 1][moreWords.length - j - 1];
                moreWords[moreWords.length - i - 1][moreWords.length - j - 1] = temp;
            }
        }
    }
    //this method searches for a key word within the 1D array
    public static void searchArray(String[]words, String key){ 
        int left = 0; //initializing this to the 0 index in the array (0, "Alex")
        int right = words.length -1; //initializing this to the last index in the array (6, "Frank")

        while (left <= right){ //if the first index is less than or equal to the highest index, run the loop (0<6)
            int mid = (left + right) / 2; //initializing this so that the middle index is established (0 + 6 / 2) = (3, "Charlie")
            if (words[mid].equals(key)){ //if the target is equal to the middle index, return (Alex ≠ Charlie)
                System.out.println(mid);
            } else if (key.compareTo(words[mid]) < 0){  //(Alex < Charlie)
                right = mid - 1; //the right variable will be equal to the former mid -1 (right = Charlie - 1 ) --> Bob
            } 
        }
        System.out.println(key + " was not found in the 1D array");

        // the 1D had to be sorted prior to invoking this method because a binary search can only happen if an array is sorted
        // or else it will not work.
    }

    //this method iterates through the first row of the sorted 2D array and puts it in descending order based on unicode value
    public static void insertionSortArray(String[][] moreWords){
        for (int i = 1; i < moreWords[0].length; i++){
            String key = moreWords[0][i];
            int j = i - 1;
            while (j>=0 && moreWords[0][j].compareTo(key) < 0){
                moreWords[0][j+1] = moreWords[0][j];
                j--;
            }
            moreWords[0][j+1] = key;
        }
    }
    //this method searches for a key word within the 1D array
    public static void searchArray(String[][]moreWords, String key){ 
        boolean located = false; 
        for (int i = 0; i <moreWords.length;i++){
            for (int j = 0; j < moreWords[i].length; j++){
                if (moreWords[i][j] == key){
                    located = true;
                    break;
                }
            }
        }
        if (located) {
            System.out.println(key + " was found within the 2D array.");
        } else {
            System.out.println(key + " was not found within the 2D array.");
        }
    } 

}
    

