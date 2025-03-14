import java.util.Scanner;

public class LastCharacter {

    public static void main(String[] args) {
        // Створюємо об'єкт Scanner для зчитування введення користувача
        Scanner scanner = new Scanner(System.in);

        // Запитуємо у користувача рядок
        System.out.print("Введіть рядок: ");
        String inputString = scanner.nextLine();

        // Перевіряємо, чи рядок не порожній
        if (!inputString.isEmpty()) {
            // Отримуємо останній символ рядка
            char lastChar = inputString.charAt(inputString.length() - 1);

            // Виводимо останній символ в консоль
            System.out.println("Останній символ рядка: " + lastChar);
        } else {
            System.out.println("Рядок є порожнім.");
        }

        // Закриваємо сканер
        scanner.close();
    }
}