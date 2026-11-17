import java.util.Scanner;


public class Calculator {
    public static double Add(double a, double b) {
        return a + b;
    }

    public static double Minus(double a, double b) {
        return a - b;

    }

    public static double Multi(double a, double b) {
        return a * b;
    }

    public static double Over(double a, double b) {
        return a / b;
    }

    public static double Power2(double a, double b) {
        return Math.pow(a, b);

    }

    public static double Power1_2(double a) {
        return Math.sqrt(a);
    }

    static void main() {
        Scanner in = new Scanner(System.in);
        int option = 0;
        double first = 0;
        double second = 0;
        do {
            System.out.printf("1.Plus 2.Minus 3.Multip 4.Over 5.Power 6.Sqrt 7.Exit" +" "+ "Enter (1-7): ");
            option = in.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter two numbers: ");
                    first = in.nextDouble();
                    second = in.nextDouble();
                    System.out.println("Answer: " + Add( first , second ));
                    break;
                case 2:
                    System.out.println("Enter two numbers: ");
                    first= in.nextDouble();
                    second = in.nextDouble();
                    System.out.println("Andswer: " + Minus(first , second));
                    break;
                case 3:
                    System.out.println("Enter two numbers: ");
                    first = in.nextDouble();
                    second = in.nextDouble();
                    System.out.println("Answer: " + Multi(first , second));
                    break;
                case 4:
                    System.out.println("Enter two numbers: ");
                    first = in.nextDouble();
                    second = in.nextDouble();
                    System.out.println("Answer: " + Over(first , second));
                    break;
                case 5:
                    System.out.println("Enter number and power of this number: ");
                    first = in.nextDouble();
                    second = in.nextDouble();
                    System.out.println("Answer: " + Power2(first , second));
                    break;
                case 6:
                    System.out.println("Enter number: ");
                    first = in.nextDouble();
                    System.out.println("Answer: " + Power1_2(first));
                    break;
                case 7:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Pls enter 1-7");
            }

        } while (option != 7);

    }


}

