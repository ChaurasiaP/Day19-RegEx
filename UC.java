import java.util.Scanner;

public class UC {

    String first;
    static String VALID_NAME_PATTERN = "^([A-Z]{1}[a-z]{2,})?$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UC name = new UC();

        System.out.println("Enter first name: ");
        name.first = sc.nextLine();

        if (name.first.matches(VALID_NAME_PATTERN)) {
            System.out.println("First Name: " + name.first);
        } else {
            System.out.println("Enter Valid Format");
        }
    }
}