
import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);
    private String choice;
    private int problems = 3;
    private int pick = -1;
    private boolean quit = false;


    public void menu(){
        System.out.println("Hello math!");
        while((pick < 1) || (pick > 4)){
            System.out.print("\nMath Categories " +
                    "\n1: Addition " +
                    "\n2: Subtraction " +
                    "\n3: Multiplication " +
                    "\n4: Division" +
                    "\nWhat would you like to practice?: ");
            pick = scan.nextInt();
            setPick(pick);
        }

        while((problems < 1) || (problems > 50)){
            System.out.print("\nHow many " + getChoice() + " questions would you like to practice?: ");
            problems = scan.nextInt();
        }
    }
    public void setChoice(String choice){
        this.choice = choice;
    }
    public String getChoice(){
        return choice;
    }
    public void setPick(int pick){
        this.pick = pick;

        if(pick == 1){
            choice = "Addition";
        }
        else if(pick == 2){
            choice = "Subtraction";
        }
        else if(pick == 3){
            choice = "Multiplication";
        }
        else if(pick == 4){
            choice = "Division";
        }
        setChoice(choice);
    }
    public int getPick(){
        return pick;
    }
    public void setProblems(int problems) {
        this.problems = problems;
    }
    public int getProblems() {
        return problems;
    }
}
