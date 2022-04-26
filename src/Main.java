import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Вас приветствует генератор паролей!");
        System.out.print("Укажите длину пароля (количество символов)?  ");
        Scanner scanner = new Scanner(System.in);
        int lengthPassword = scanner.nextInt();
        System.out.println("Ваш пароль: ");
        for (int i = 0; i < lengthPassword; i++) {
            System.out.print((char) (short) (Math.random() * 94 + 33));
        }
    }
}
