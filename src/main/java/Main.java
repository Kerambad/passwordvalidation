

public class Main {
    public static void main(String[] args) {

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
}
