import java.util.*;

public class register {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> logins = new ArrayList<>();
        List<String> passwords = new ArrayList<>();
        int option;

        do {
            System.out.println("\n1. Sign up  2. Log in  3. Exit");
            option = in.nextInt();
            in.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter new login: ");
                    String newLogin = in.nextLine();

                    if (logins.contains(newLogin)) {
                        System.out.println("This login is already taken!");
                    } else {
                        logins.add(newLogin);
                        System.out.print("Enter new password: ");
                        passwords.add(in.nextLine());
                        System.out.println("Account created!");
                    }
                    break;

                case 2:
                    System.out.print("Enter login: ");
                    String inputLogin = in.nextLine();
                    System.out.print("Enter password: ");
                    String inputPassword = in.nextLine();

                    int index = logins.indexOf(inputLogin);
                    if (index != -1 && passwords.get(index).equals(inputPassword)) {
                        System.out.println("You are logged in! Welcome, " + inputLogin);
                    } else {
                        System.out.println("Login or password incorrect.");
                    }
                    break;

                case 3:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Please enter 1-3");
            }
        } while (option != 3);
    }
}