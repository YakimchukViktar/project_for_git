import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Create your password.");
        System.out.print("Set your password size (more than 8 characters)? ");
        int lengthPassword = getUserNumber();
        while (true) {
            if (lengthPassword < 8) {
                lengthPassword = getUserNumber();
            } else break;
        }
        System.out.println("Your password: ");
        for (int i = 0; i < lengthPassword; i++) {
            System.out.print((char) (short) (Math.random() * 94 + 33));
        }
    }

    private static int getUserNumber() {
        System.out.print("Please enter an integer greater than 8: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else System.out.print("You did not enter an integer greater than 8. Please trt again.");
        return getUserNumber();
    }
}
