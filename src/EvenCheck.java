import java.util.Scanner;

public class EvenCheck {

    public static void main(String[] args) {
        // Створюємо об'єкт Scanner для зчитування введення користувача
        Scanner scanner = new Scanner(System.in);

        // Запитуємо у користувача число
        System.out.print("Введіть число: ");
        int number = scanner.nextInt();

        // Перевіряємо, чи є число парним
        if (number % 2 == 0) {
            System.out.println("Число є парним.");
        } else {
            System.out.println("Число є непарним.");
        }

        // Закриваємо сканер
        scanner.close();
    }
}
