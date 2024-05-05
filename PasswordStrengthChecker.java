import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (isStrongPassword(password)) {
            System.out.println("Your password strong!");
        } else {
            System.out.println("Your password  weak. Please consider stronger one.");
        }

        scanner.close();
    }

    private static boolean isStrongPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasUppercase = false, hasLowercase = false, hasDigit = false, hasSpecialChar = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                hasSpecialChar = true;
            }
        }

        return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }
}
