import java.util.Scanner;

public class UC {

    static String VALID_PASSWORD = "^([a-zA-Z0-9]{8,})$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Password: ");
        String password = sc.nextLine();
        if (password.matches(VALID_PASSWORD)) {
            System.out.println(password);
        }else {
            System.out.println("Enter Valid password");
        }
    }
}
