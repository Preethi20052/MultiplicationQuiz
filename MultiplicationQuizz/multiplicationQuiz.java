import java.util.Scanner;
import java.util.Random;

public class MultiplicationQuiz {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            
        
            int num1 = random.nextInt(10) + 1;
            int num2 = random.nextInt(10) + 1;

            System.out.println("What is " + num1 + "*" + num2 +"?  (Enter 0 to exit)" );
            int userAns = scanner.nextInt();


            if (userAns == 0){
                System.out.println("Thatk you for practicing multiplication!");
                break;
            }

            int correctAns = num1 * num2;

            if (userAns == correctAns){
                System.out.println("Correct! ");
                
            }
            else{
                System.out.println("Wrong!" + "\nCorrect answer " + correctAns);
            }

        }
        scanner.close();
    }
}