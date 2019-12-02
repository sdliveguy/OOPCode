// Steven Nguyen
// Math flashcard program that generates and teaches addition and multiplication
import java.util.Scanner;
import java.util.Random;
public class NguyenMathTutorStart {
    public static void main(String[] args) {
        // Title introduction so it only appears once when program is executed and not repeated in loop till program is restarted
        System.out.println("*******************************");
        System.out.println("     Electronic Math Tutor");
        System.out.println("*******************************\n");
        var sc = new Scanner(System.in);
        Random rnd = new Random();
        int choice, numProb, numOp, num1, num2, resp, ans, correct;
        while (true) {
            System.out.println("Choose the type of problem: ");
            System.out.println("1. Addition");
            System.out.println("2. Multiplication");
            System.out.println("3. Mixed");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            // break ends program during loop
            if (choice == 4) {
                break;
            }
            else {
                // asks how many problems and maximum operand
                // correct count to 0
                System.out.print("How many problems? ");
                numProb = sc.nextInt();
                System.out.print("Largest operand? ");
                numOp = sc.nextInt();
                System.out.println();
                correct = 0;
                // asks the user for the number of problems and the maximum operand
                for (int i = 0; i < numProb; i++) {
                    num1 = rnd.nextInt(numOp);
                    num2 = rnd.nextInt(numOp);
                    if (choice == 1) {
                        // Generates addition problem
                        // correct++ adds + 1 to total correct and keeps track
                        System.out.printf("%d + %d = ? ",num1,num2);
                        resp = sc.nextInt();
                        ans = num1 + num2;
                        if (ans == resp) {
                            System.out.println("Correct!");
                            correct++;
                        } else {
                            System.out.println("Incorrect. The answer is " + ans + ".");
                        }
                    } else if (choice == 2) {
                        // Generates multiplication problem
                        System.out.printf("%d * %d = ? ",num1,num2);
                        resp = sc.nextInt();
                        ans = num1 * num2;
                        if (ans == resp) {
                            System.out.println("Correct!");
                            correct++;
                        } else {
                            System.out.println("Incorrect. The answer is " + ans + ".");
                        }
                    } else if (choice == 3) {
                        // generates either an addition or multiplication problem
                        // uses rnd.nextInt(2) to decide if + or *
                        int randomChoice = rnd.nextInt(2);
                        if (randomChoice == 0) {
                            // Generates addition problem
                            System.out.printf("%d + %d = ? ",num1,num2);
                            resp = sc.nextInt();
                            ans = num1 + num2;
                            if (ans == resp) {
                                System.out.println("Correct!");
                                correct++;
                            } else {
                                System.out.println("Incorrect. The answer is " + ans + ".");
                            }
                        }
                        else {
                            // Generates multiplication problem
                            System.out.printf("%d * %d = ? ",num1,num2);
                            resp = sc.nextInt();
                            ans = num1 * num2;
                            if (ans == resp) {
                                System.out.println("Correct!");
                                correct++;
                            } else {
                                System.out.println("Incorrect. The answer is " + ans + ".");
                            }
                        }
                    }
                }
                // Displays results of amount correct / num of problems and shows percentage
                System.out.println("\nYou answered " + correct + " out of " + numProb + " correctly.");
                double percent = (double)correct / numProb * 100;
                System.out.printf("Your average was %.2f.\n\n", percent);
            }
        }
        // Message before program quits
        System.out.println("\nThanks for playing.");
        sc.close();
    }
}