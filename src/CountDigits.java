import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        // Створюємо об'єкт Scanner для зчитування введення користувача
        Scanner scanner = new Scanner(System.in);

        // Запитуємо у користувача ціле число
        System.out.print("Введіть ціле число: ");
        int number = scanner.nextInt();

        // Перетворюємо число на абсолютне значення
        number = Math.abs(number);

        // Обчислюємо кількість цифр
        int count = String.valueOf(number).length();

        // Виводимо результат
        System.out.println("Кількість цифр у числі: " + count);

        // Закриваємо сканер
        scanner.close();
    }
}
