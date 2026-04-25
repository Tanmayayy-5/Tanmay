import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } 
            else if (Character.isLowerCase(ch)) {
                hasLower = true;
            } 
            else if (!Character.isLetterOrDigit(ch)) {
                hasSpecial = true;
            }
        }

        if (password.length() >= 8 && hasUpper && hasLower && hasSpecial) {
            System.out.println("Your password is strong");
        } else {
            System.out.println("Your password is weak");
        }

        sc.close();
    }
}