package calculator;

import java.util.Scanner;

public class UserInterface {
    private Calculator calculator;
    private Scanner scanner;

    public UserInterface(Calculator calculator) {
        this.calculator = calculator;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean userWantToExit = false;

        while (!userWantToExit) {
            String nums = scanner.nextLine();
            switch (nums) {
                case "/help" -> helpCommand();
                case "/exit" -> userWantToExit = this.calculator.userWantToExit();
                default -> {
                    this.calculator.assignNumbers(nums);
                }
            }
        }
    }

    public static void helpCommand() {
        System.out.println("The program calculates the sum of numbers");
    }
}
