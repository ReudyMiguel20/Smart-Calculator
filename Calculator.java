package calculator;

import java.util.Scanner;

public class Calculator {
    private Scanner scanner;

    public Calculator() {
        this.scanner = new Scanner(System.in);
    }

    public void assignNumbers(String nums) {
        if (nums.equals("")) {
            return;
        }

        String[] numbersSplit = nums.split(" ");
        int[] numbers = new int[numbersSplit.length];

        if (numbers.length == 1) {
            System.out.println(nums);
            return;
        }

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersSplit[i]);
        }

        int totalSum = 0;
        for (int x : numbers) {
            totalSum += x;
        }

        System.out.println(totalSum);

    }

    public boolean userWantToExit() {
        System.out.println("Bye!");
        return true;
    }

}
