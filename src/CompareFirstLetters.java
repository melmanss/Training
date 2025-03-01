import java.util.Scanner;

public class CompareFirstLetters {

    public static void main(String[] args) {
        // Створюємо об'єкт Scanner для зчитування введення користувача
        Scanner scanner = new Scanner(System.in);

        // Запитуємо у користувача два слова
        System.out.print("Введіть перше слово: ");
        String firstWord = scanner.nextLine();

        System.out.print("Введіть друге слово: ");
        String secondWord = scanner.nextLine();

        // Перевіряємо, чи перші літери слів збігаються
        if (!firstWord.isEmpty() && !secondWord.isEmpty()) {
            char firstLetter = firstWord.charAt(0);
            char secondLetter = secondWord.charAt(0);

            if (Character.toLowerCase(firstLetter) == Character.toLowerCase(secondLetter)) {
                System.out.println("Перші літери слів збігаються.");
            } else {
                System.out.println("Перші літери слів не збігаються.");
            }
        } else {
            System.out.println("Одне або обидва слова є порожніми.");
        }

        // Закриваємо сканер
        scanner.close();
    }
}
