import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создайте свой пароль!");
        System.out.print("Укажите длину пароля (количество символов)? ");
        int lengthPassword = getUserNumber();// вызываем метод, который возвратит нам длину пароля
        while (true) {
            if (lengthPassword < 8) { //проверка пороля на нужную нам длину. Изменена длина пароля
                lengthPassword = getUserNumber();
            } else break;
        }
        System.out.println("Your password: ");
        for (int i = 0; i < lengthPassword; i++) {
            System.out.print((char) (short) (Math.random() * 94 + 33));
        }
    }

    private static int getUserNumber() {
        System.out.print("Введите целое число не менее 8: ");//длина пароля сейчас не меньше 8
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else System.out.print("Вы ввели не целое число. ");
        return getUserNumber();
    }
}
