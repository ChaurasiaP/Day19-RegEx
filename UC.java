import java.util.Scanner;

public class UC {

    static String VALID_EMAIL = "^([a-c]{3}([.|+|-]?[a-zA-Z0-9]+)?@bl.co([.]?[a-zA-Z]{2})?)$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Email: ");
        String email = sc.nextLine();

        if (email.matches(VALID_EMAIL)) {
            System.out.println(email);
        } else {
            System.out.println("enter again");
        }
    }
}
