package com.company;


import java.util.Random;
import java.util.Scanner;
        /*
         * Create a program that will randomly select two numbers from 1-6
         * (like rolling two dice). Show the dice rolls.
         * You should also show the running score.
         * Prompt the user to either roll again or lose their turn.
         * A player scores the sum of the two dice thrown and
         * gradually reaches a higher score as they continue to roll.
         * If a single number 1 is thrown on either die,
         * the score for that whole turn is lost.
         * However a double 1 counts as 25.
         * When you reach a score of 100 (or more) the game ends.
         */
        public class Main {

            public static void main(String[] args) {
                Random r = new Random();
                Scanner sc = new Scanner(System.in);

                // Greeting
                System.out.println("Welcome! Lets Play Roll Dice!");

                // Variable to hold the sum.
                 int score = 0;

                // variable to hold the response
                 String response = "";
                 do {

                    // initialize two random numbers;
                    int num1 = 1 + r.nextInt(6);
                    int num2 = 1 + r.nextInt(6);
                   // String[] response = new String[0];
                   // boolean response = true;


                    // System Output : Prompts the User
                     System.out.println("You have thrown "+ num1 +" and "+ num2 +".");
                    // System.out.println("your score is " + score);
//                     score = score + (num1 + num2);
//                    System.out.println("Score: " + score);


                    if (num1 == 1 && num2 == 1) {
                        score = score + 25;
                        System.out.println("Score: " + score);

                    }
                    else if (num1 == 1&& num2>1){
                        System.out.println("Sorry, you lost your turn.");
                       // System.out.println("Roll again? ");
                        score= score+0;
                        System.out.println("Score: " + score);
                    }
                    else if (num1>1&&num2 == 1){
                        System.out.println("Sorry, you lost your turn.");
//                        System.out.println("Roll again?");
                        score= score+0;
                        System.out.println("Score: " + score);
                    }
                    else if ( num1 > 1 && num2 > 1) {
                        score = score + (num1 + num2);
                        System.out.println(score);
                    }
                         
//                    else  {
//                        score = num1 + num2;
//                    }
                         
                     System.out.println("Roll again?");
                     response = sc.next();
                     System.out.println();


                } while(score <=100 && response.equalsIgnoreCase("yes"));

                     if (sum > 100) {

            System.out.println("You have scored over 100");

            }
                    System.out.println("Thanks for playing!");

    }
