import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создайте свой пароль!");
        System.out.print("Укажите длину пароля (количество символов)? ");
        int lengthPassword = getUserNumber();
        while (true) {
            if (lengthPassword < 5) {
                lengthPassword = getUserNumber();
            } else break;
        }
        System.out.println("Your password: ");
        for (int i = 0; i < lengthPassword; i++) {
            System.out.print((char) (short) (Math.random() * 94 + 33));
        }
    }

    private static int getUserNumber() {
        System.out.print("Введите целое число не менее 5: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else System.out.print("Вы ввели не целое число. ");
        return getUserNumber();
    }
}
