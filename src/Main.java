import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создайте свой пароль!");
        System.out.print("Укажите длину пароля (количество символов)? ");
        int lengthPassword = UserNumber();// вызываем метод, который возвратит нам длину пароля
        while (true) {
            if (lengthPassword < 10) { // здесь изменена длина пароля на 10
                lengthPassword = UserNumber();
            } else break;
        }
        System.out.println("Your password: ");
        for (int i = 0; i < lengthPassword; i++) {
            System.out.print((char) (short) (Math.random() * 94 + 33));
        }
    }

    private static int UserNumber() {
        System.out.print("Введите целое число не менее 10: ");//длина пароля сейчас не меньше 10
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else System.out.print("Вы ввели не целое число. ");
        return UserNumber();
    }
}
