package calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
//            int num1 = Integer.parseInt(scanner.nextLine());
//            int num2 = Integer.parseInt(scanner.nextLine());
            String numbers = scanner.nextLine();
            if (numbers.equals("/exit")) {
                System.out.println("Bye!");
                break;
            }

            String[] numbersArray = numbers.split(" ");
            if (numbers.equals("")) {
                continue;
            } else if (numbersArray.length == 1) {
                System.out.println(numbers);
            } else {
                int num1 = Integer.parseInt(numbersArray[0]);
                int num2 = Integer.parseInt(numbersArray[1]);
                System.out.println(num1 + num2);
            }

        }


    }
}
