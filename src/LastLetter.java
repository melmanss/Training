import java.util.Scanner;

public class LastLetter {

    public static void main(String[] args) {
        // Створюємо об'єкт Scanner для зчитування введення користувача
        Scanner scanner = new Scanner(System.in);

        // Запитуємо у користувача слово
        System.out.print("Введіть слово: ");
        String word = scanner.nextLine();

        // Перевіряємо, чи слово не порожнє
        if (!word.isEmpty()) {
            // Отримуємо останню букву
            char lastChar = word.charAt(word.length() - 1);

            // Перевіряємо, чи остання буква є м'яким знаком
            if (lastChar == 'ь') {
                // Отримуємо передостанню букву
                if (word.length() > 1) {
                    char secondLastChar = word.charAt(word.length() - 2);
                    System.out.println("Передостання буква: " + secondLastChar);
                } else {
                    System.out.println("Слово містить лише м'який знак.");
                }
            } else {
                System.out.println("Остання буква: " + lastChar);
            }
        } else {
            System.out.println("Слово є порожнім.");
        }

        // Закриваємо сканер
        scanner.close();
    }
}
