//Напишите программу, в которой пользователя просят ввести имя и пароль. Пароль должен быть ограничен по размеру от 8 до 15 символов.
// В случае ввода неверного пароля программа должна запрашивать пароль снова и выводить на экран причину ошибки.
//В случае, если пароль введен верно, программа должна выводить имя пользователя и его пароль. Удачи, и да прибудет с вами сила!
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        String password;

        System.out.print("Введите ваше имя: ");
        username = scanner.nextLine();

        while (true) {
            System.out.print("Введите ваш пароль: ");
            password = scanner.nextLine();

            if (password.length() < 8) {
                System.out.println("Ошибка: Пароль слишком короткий. Должен быть не менее 8 символов.");
            } else if (password.length() > 15) {
                System.out.println("Ошибка: Пароль слишком длинный. Должен быть не более 15 символов.");
            } else {
                // Пароль корректный
                System.out.println("Имя пользователя: " + username);
                System.out.println("Пароль: " + password);
                break;
            }
        }

        scanner.close();
        System.out.println("Удачи, и да прибудет с вами сила!");
    }
}