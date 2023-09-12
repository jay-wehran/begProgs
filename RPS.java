/*
Jason Wehran
3/2/23
CSE007 Spring 2023: Homework 4
VSCode / JDK 11
This program will produce a certain number of simulated rock paper scissors games. Number of games is to be determined by user
*/

import java.util.Scanner;
public class RPS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        boolean continueLooping = true;
        boolean newLoop = true;
        
    
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println();
        System.out.print("Please enter the name of player 1:");
        System.out.println();
        String name1 = sc.next();
    
        System.out.print("Please enter the name of player 2:");
        System.out.println();
        String name2 = sc.next();
    
        System.out.print("Please enter the amount of games you want to play: ");
        System.out.println();

            
            int numGames = sc.nextInt();
     while (continueLooping==true) {
            if (numGames <= 0 ) {
                System.out.println("Error - Invalid Number of Games. Please Try Again");
            } else if (numGames >= 0) {
                continueLooping = false;
                System.out.println(name1 + " vs. " + name2 + " for " + numGames + " rounds");
                System.out.println();
                
            }
        }
                int rock = 1;
                int paper = 2;
                int scissors = 3;
                int p1move = 0;
                int p2move = 0;
                int draw = 0;
                int p1wins = 0;
                int p2wins = 0;

                int roundNum = 0;
                int gamesPlayed = 0;
                while (newLoop==true) {
                    gamesPlayed++;
                    roundNum++;
                    
                    if (gamesPlayed <= numGames) {
                        p1move = (int) (Math.random() * 3 + 1);
                        p2move = (int) (Math.random() * 3 + 1);

                        if (p1move==rock && p2move==rock) {
                        System.out.println(name1 + " - rock; " + name2 + " - rock ");
                        System.out.println("Round " + roundNum + " is a draw.");
                        System.out.println();
                        draw = draw + 1;
           
                    } else if (p1move==rock && p2move==paper){
                    System.out.println(name1 + " - rock; " + name2 + " - paper ");
                    System.out.println("Round " + roundNum + " goes to: " + name2);
                    System.out.println();
                    p2wins = p2wins + 1;
        
                    } else if (p1move==rock && p2move==scissors){
                    System.out.println(name1 + " - rock; " + name2 + " - scissors ");
                    System.out.println("Round " + roundNum + " goes to: " + name1);
                    System.out.println();
                    p1wins = p1wins + 1;
              
                    } else if (p1move==paper && p2move==rock) {
                    System.out.println(name1 + " - paper; " + name2 + " - rock ");
                    System.out.println("Round " + roundNum + " goes to: " + name1);
                    System.out.println();
                    p1wins = p1wins + 1;
           
                    } else if (p1move==paper && p2move==paper){
                    System.out.println(name1 + " - paper; " + name2 + " - paper ");
                    System.out.println("Round " + roundNum + " is a draw.");
                    System.out.println();
                    draw = draw + 1;
        
                    } else if (p1move==paper && p2move==scissors){
                    System.out.println(name1 + " - paper; " + name2 + " - scissors ");
                    System.out.println("Round " + roundNum + " goes to: " + name2);
                    System.out.println();
                    p2wins = p2wins + 1;
              
                    } else if (p1move==scissors && p2move==rock) {
                    System.out.println(name1 + " - scissors; " + name2 + " - rock ");
                    System.out.println("Round " + roundNum + " goes to: " + name2);
                    System.out.println();
                    p2wins = p2wins + 1;
        
                    }  else if (p1move==scissors && p2move==paper){
                    System.out.println(name1 + " - scissors; " + name2 + " - paper ");
                        System.out.println("Round " + roundNum + " goes to: " + name1);
                        System.out.println();
                    p1wins = p1wins + 1;
            
                    }  else if (p1move==scissors && p2move==scissors){
                    System.out.println(name1 + " - scissors; " + name2 + " - scissors");
                    System.out.println("Round " + roundNum + " is a draw.");
                    System.out.println();
                    draw = draw + 1;
                    }  
                } else if (gamesPlayed > numGames) {
                    newLoop = false;
                        System.out.println("Thank you for playing!");
                        System.out.println();
                        System.out.println("There were " + (gamesPlayed - 1) + " rounds played!");
                        System.out.println();
                        System.out.println(name1 + " had " + p1wins + " win(s); " + name2 + " had " + p2wins + " win(s); Total amount of draws: " + draw);
            }
        }
    }
}