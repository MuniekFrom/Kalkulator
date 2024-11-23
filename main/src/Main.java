import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj 1 liczbe: ");
        int number1 = scanner.nextInt();
        System.out.print("Podaj 2 liczbe: ");
        int number2 = scanner.nextInt();
        System.out.print("Podaj operator: ");
        char operator = scanner.next().charAt(0);

        int result = 0;
        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                System.out.println("Nieprawidłowy operator!");
                return;
        }
        System.out.println("Wynik to " + result);
    }
}