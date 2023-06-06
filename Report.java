import java.util.LinkedList;

public class Report {
    private int numCorrectAnswers;
    private int numWrongAnswers;
    private LinkedList<Math> report = new LinkedList<Math>();
    public Report(){
        numCorrectAnswers = 0;  // number of correctly answered questions
        numWrongAnswers = 0;  // number of wrong answers
    }
    public void insert(Math newMath, int response){
        report.add(newMath);
        if(response == newMath.getAnswer()){
            numCorrectAnswers += 1;
        }
        else {
            numWrongAnswers += 1;
        }
    }
    public int getNumCorrectAnswers() {
        return numCorrectAnswers;
    }
    public int getNumWrongAnswers() {
        return numWrongAnswers;
    }

    public void generateReport(){
        int count = 1;

        for(Math quiz:report){
            System.out.println("\nQuestion #" + count + ":");
            System.out.println(quiz.getNum1());
            System.out.println(quiz.getOp());
            System.out.println(quiz.getNum2());
            System.out.println("-----");
            System.out.println(quiz.getAnswer());
            System.out.println(" ");
            count++;
        }
        System.out.println("---------------------------------");
        System.out.println("You answered " + numCorrectAnswers + " questions correctly.");
        System.out.println("You made " + numWrongAnswers + " mistakes.");
        if (numCorrectAnswers > numWrongAnswers) {
            System.out.println("Great job!");
        }
        else {
            System.out.println("You will do better next time..." );
        }
    }
}
