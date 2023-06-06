//*************************************************************************
//Math.java
//Date: 06/06/2023
//Author: David Taylor
//Test project for myself. Make a math quiz app using java.
//***** room for improvement *****
//*add comments
//*remove unused functions
//*use inheritance for math functions?
/*
 This program can be used as a math tutor for a young student.
 it repeatedly allows the user to practice solving Multiplication questions until the user inputs "q" to stop
 when the practice for the user stops, this program generates the report:
 (1) the list of questions with correct answers which the user has practiced;
 (2) the total number of questions the user has solved;
 (3) the total number of mistakes the user has made;
 (4) display either "Great job!"(if (2) > (3)) or "You will do better next time..." (otherwise)
 it then quits the program.
 */
//*************************************************************************

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello world!");
        String quit;
        boolean ONOFF = true;

        Report report = new Report();
        Menu menu = new Menu();

        menu.menu();

       while(ONOFF){
            Math math = new Math();
            if(menu.getPick() == 1){
                math.Addition();
            }
            else if(menu.getPick() == 2){
                math.Subtraction();
            }
            else if(menu.getPick() == 3){
                math.Multiplication();
            }
            else if(menu.getPick() == 4){
                math.Division();
            }

            math.print();
            System.out.print("\nWhat do you think the answer is?: ");
            int response = scan.nextInt();
            // check if it is the correct answer
            if (math.checkAnswer(response)) {
                System.out.println("Congratulations! " + response + " is the right answer.");
            }
            else {
                System.out.println("Sorry, the correct answer is " + math.getAnswer() + ".");
            }
            boolean LOOP = true;
            report.insert(math,response);
            while(LOOP) {
                System.out.println("\nMove on to the Question?: ");
                System.out.print("(Enter \"y\" to move on, or \"q\" to quit): ");
                scan.nextLine();
                quit = scan.nextLine().toLowerCase();

                if(quit.equals("q")){
                    LOOP = false;
                    ONOFF = false;
                }
                else if(quit.equals("y")){
                    LOOP = false;
                }
                else{
                    System.out.println("Invalid Response!!!");
                }
            }
        }
        report.generateReport();

        System.out.println();
    }
}