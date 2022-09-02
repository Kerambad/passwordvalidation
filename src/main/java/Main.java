

public class Main {
    public static void main(String[] args) {
 //TODO

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
}
