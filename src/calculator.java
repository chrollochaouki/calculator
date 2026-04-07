import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\n--- Calculator ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:{
                    System.out.println("Enter first number: ");
                    double a = scanner.nextDouble();
                    System.out.println("Enter second number: ");
                    double b = scanner.nextDouble();
                    System.out.println("Result: " + add(a, b));
                    break;}
                case 2:{
                    System.out.println("Enter first number: ");
                    double a = scanner.nextDouble();
                    System.out.println("Enter second number: ");
                    double b = scanner.nextDouble();
                    System.out.println("Result: " + subtract(a, b));
                    break;}
                case 3:{
                    System.out.println("Enter first number: ");
                    double a = scanner.nextDouble();
                    System.out.println("Enter second number: ");
                    double b = scanner.nextDouble();
                    System.out.println("Result: " + multiply(a, b));
                    break;}
                case 4:{
                    System.out.println("Enter first number: ");
                    double a = scanner.nextDouble();
                    System.out.println("Enter second number: ");
                    double b = scanner.nextDouble();
                    System.out.println("Result: " + divide(a, b));
                    break;}

                default:
                    System.out.println("Invalid option");
            }

        }   while (choice != 0);
    }
    public static double add(double a, double b){
        return a + b;
    }
    public static double subtract(double a, double b){
        return a - b;
    }
    public static double multiply(double a, double b){
        return a * b;
    }
    public static double divide(double a, double b){
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }
}
