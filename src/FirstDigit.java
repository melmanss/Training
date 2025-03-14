import java.util.Scanner;

public class FirstDigit {

    public static void main(String[] args) {
        // Створюємо об'єкт Scanner для зчитування введення користувача
        Scanner scanner = new Scanner(System.in);

        // Запитуємо у користувача ціле число
        System.out.print("Введіть ціле число: ");
        int number = scanner.nextInt();

        // Перетворюємо число на абсолютне значення, щоб уникнути проблем з від'ємними числами
        number = Math.abs(number);

        // Знаходимо першу цифру
        int firstDigit = Integer.parseInt(Integer.toString(number).substring(0, 1));

        // Виводимо першу цифру
        System.out.println("Перша цифра числа: " + firstDigit);

        // Закриваємо сканер
        scanner.close();
    }
}
