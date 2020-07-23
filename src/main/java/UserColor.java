import java.util.Scanner;

public class UserColor {
    public static String getUserColor() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first letter (B-blue, G-grey, Y-yellow, P-pink, O-orange");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "B":
                    return "Blue";
                case "Y":
                    return "Yellow";
                case "W":
                    return "White";
                case "P":
                    return "Pink";
                case "O":
                    return "Orange";
                case "G":
                    return "Grey";
                default:
                    System.out.println("Wrong letter. Try again.");
            }
        }
    }
}
