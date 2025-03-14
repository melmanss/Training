import java.util.Scanner;

public class LastDigit {

    public static void main(String[] args) {
        // Створюємо об'єкт Scanner для зчитування введення користувача
        Scanner scanner = new Scanner(System.in);

        // Запитуємо у користувача ціле число
        System.out.print("Введіть ціле число: ");
        int number = scanner.nextInt();

        // Отримуємо останню цифру числа
        int lastDigit = Math.abs(number % 10);

        // Виводимо останню цифру
        System.out.println("Остання цифра числа: " + lastDigit);

        // Закриваємо сканер
        scanner.close();
    }
}
