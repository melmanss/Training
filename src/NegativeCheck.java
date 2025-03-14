import java.util.Scanner;

public class NegativeCheck {

    public static void main(String[] args) {
        // Створюємо об'єкт Scanner для зчитування введення користувача
        Scanner scanner = new Scanner(System.in);

        // Запитуємо у користувача число
        System.out.print("Введіть число: ");
        int number = scanner.nextInt();

        // Перевіряємо, чи є число від'ємним
        if (number < 0) {
            System.out.println("Число є від'ємним.");
        } else {
            System.out.println("Число не є від'ємним.");
        }

        // Закриваємо сканер
        scanner.close();
    }
}
