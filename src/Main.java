import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to our calculator");

        Operators operators = new Operators();

        menu();

    }

    public static void menu() {

        Operators operators = new Operators();
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");

        System.out.println("Enter your choice: ");

        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter first number: ");
                int a = scanner.nextInt();
                System.out.println("Enter second number: ");
                int b = scanner.nextInt();
                System.out.println(operators.add(a, b));
                menu();
                break;
            case 0:
                System.out.println("Exiting...");
                break;
        }

    }
}