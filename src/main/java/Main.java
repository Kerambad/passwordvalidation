import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String password = input();
        boolean rating = check_password(password);
        print(rating);
    }

    public static boolean password_length(String pass) {
        if(pass.length() >= 8) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean password_number(String pass) {
        for (int i = 0; i <= 9; i++) {
            if (pass.contains(String.valueOf(i))) {
                return true;
            }
        }
        return false;
    }
    public static boolean password_checkdigit(String pass) {
        boolean uppercase = false;
        boolean lowercase = false;

        //declare pass.length in variable or not??
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isUpperCase(pass.charAt(i))) {
                uppercase = true;
            }
            if (Character.isUpperCase(pass.charAt(i))) {
                lowercase = true;
            }
        }
            if (uppercase && lowercase) {
                return true;
            }
            else {
                return false;
            }
    }
    public static boolean password_badword(String pass) {
        //list of bad passwords
        String[] badword = {
                "12345678",
                "Hallo123"
        };
        //code
        for (int i = 0; i < badword.length; i++) {
            if(pass.equals(badword[i])) {
                return true;
            }
        }
        return false;
    }

    public static String input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Whats your password: ");
        return scan.nextLine();
    }
    public static boolean check_password(String pass) {
        boolean error = false;
        if (!password_length(pass)){
            System.out.println("Password need's at least 8 chars.");
            error = true;
        }
        if (!password_number(pass)) {
            System.out.println("Password need's at least one number.");
            error = true;
        }
        if (!password_checkdigit(pass)) {
            System.out.println("Passwords need's at least one uppercase/lowercase char.");
            error = true;
        }
        if (password_badword(pass)) {
            System.out.println("Passwort easy to guess, please choose another.");
            error = true;
        }
        if(error){
            return false;
        }
        else {
            return true;
        }
    }
    public static void print (boolean goodpw) {
        if (goodpw) {
            System.out.println("password valid.");
        }
        else {
            System.out.println("--> Invalid password, please retry.");
        }
    }
}
