import java.util.Scanner;

public class UC {

    static String VALID_NUMBER = "^([0-9]{2}?[ ]{1} ?[1-9]{1}?[0-9]{9})$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Mobile number: ");
        String number = sc.nextLine();
        if (number.matches(VALID_NUMBER)) {
            System.out.println(number);
        }else {
            System.out.println("Enter Valid Number");
        }
    }
}
