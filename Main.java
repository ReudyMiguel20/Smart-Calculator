package calculator;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        UserInterface UI = new UserInterface(calculator);

        UI.start();
    }
}
