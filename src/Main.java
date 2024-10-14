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
        System.out.println("5. Square");

        System.out.println("6. Exit");

        System.out.println("Enter your choice: ");

        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
        int a, b;
        switch (choice) {
            case 1:
                System.out.println("Enter first number: ");
                a = scanner.nextInt();
                System.out.println("Enter second number: ");
                b = scanner.nextInt();
                System.out.println(operators.add(a, b));
                menu();
                break;
            case 2:
                System.out.println("Enter first number: ");
                a = scanner.nextInt();
                System.out.println("Enter second number: ");
                b = scanner.nextInt();
                System.out.println("El resultado de la resta es: " + operators.subtract(a, b));
                menu();
                break;
            case 3:
                System.out.println("Enter first number: ");
                a = scanner.nextInt();
                System.out.println("Enter second number: ");
                b = scanner.nextInt();
                System.out.println("El resultado de la multiplicación es: " + operators.multiply(a, b));
                menu();
                break;
            case 4:
                System.out.println("Enter first number: ");
                a = scanner.nextInt();
                System.out.println("Enter second number: ");
                b = scanner.nextInt();
                System.out.println("El resultado de la división es: " + operators.divide(a, b));
                menu();
                break;
            case 5:
                System.out.println("Enter a number: ");
                a = scanner.nextInt();
                System.out.println("El resultado de elevar al cuadrado es: " + operators.square(a));
                menu();
                break;
            case 6:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid choice");
                menu();
        }
    }
}