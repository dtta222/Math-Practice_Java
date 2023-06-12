public class Math {
    private char op;
    private int num1;
    private int num2;
    private int answer;

    public void Addition(){
        // The first one is in the range of [1, 500];
        // The second one is in the range of [1, 500].
        int max = 500, min = 1;
        // Generate random int value from min to max
        // Generate two random numbers:
        num1 = (int) java.lang.Math.floor(java.lang.Math.random() * (max - min + 1) + min);
        num2 = (int) java.lang.Math.floor(java.lang.Math.random() * (max - min + 1) + min);
        answer = num1 + num2;
        op = '+';
    }

    public void Subtraction(){
        // check for negative numbers
        answer = -1;
        // loops if answer is negative
        while (answer < 0) {
            // The first one is in the range of [1, 500];
            // The second one is in the range of [1, 500].
            int max = 500, min = 1;
            // Generate random int value from min to max
            // Generate two random numbers:
            num1 = (int) java.lang.Math.floor(java.lang.Math.random() * (max - min + 1) + min);
            num2 = (int) java.lang.Math.floor(java.lang.Math.random() * (max - min + 1) + min);
            answer = num1 - num2;
        }
        op = '-';
    }

    public void Multiplication(){
        // Generate two random numbers:
        // The first one is in the range of [1, 100];
        // The second one is in the range of [1, 9].
        int upperMax = 100, UpperMin = 1;
        int lowerMax = 9, lowerMin = 1;
        // Generate random int value from min to max
        // Generate two random numbers:
        num1 = (int) java.lang.Math.floor(java.lang.Math.random() * (upperMax - UpperMin + 1) + UpperMin);
        num2 = (int) java.lang.Math.floor(java.lang.Math.random() * (lowerMax - lowerMin + 1) + lowerMin);
        answer = num1 + num2;
        op = '*';
    }

    public void Division(){
        // remainder check
        int r_check = 1;

        while (r_check != 0) {
            // loops if answer has a remainder

            // Generate two random numbers:
            // The first one is in the range of [1, 999];
            // The second one is in the range of [1, 9].
            int upperMax = 999, UpperMin = 1;
            int lowerMax = 9, lowerMin = 1;
            num1 = (int) java.lang.Math.floor(java.lang.Math.random() * (upperMax - UpperMin + 1) + UpperMin);
            num2 = (int) java.lang.Math.floor(java.lang.Math.random() * (lowerMax - lowerMin + 1) + lowerMin);
            r_check = num1 % num2;
        }
        answer = num1 / num2;
        op = '/';
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public int getNum1() {
        return num1;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int getNum2() {
        return num2;
    }
    public char getOp() {
        return op;
    }
    public int getAnswer() {
        return answer;
    }
    public boolean checkAnswer(int response){
        return answer == response;
    }
    public void print(){
        System.out.println(num1);
        System.out.println(op);
        System.out.println(num2);
        System.out.println("-----");
        //System.out.println(answer);
    }
}
