import java.util.Scanner;

public class CompareFirstDigits {

    public static void main(String[] args) {
        // Створюємо об'єкт Scanner для зчитування введення користувача
        Scanner scanner = new Scanner(System.in);

        // Запитуємо у користувача два цілі числа
        System.out.print("Введіть перше ціле число: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Введіть друге ціле число: ");
        int secondNumber = scanner.nextInt();

        // Перетворюємо числа на абсолютні значення
        firstNumber = Math.abs(firstNumber);
        secondNumber = Math.abs(secondNumber);

        // Отримуємо перші цифри
        int firstDigitFirstNumber = Integer.parseInt(Integer.toString(firstNumber).substring(0, 1));
        int firstDigitSecondNumber = Integer.parseInt(Integer.toString(secondNumber).substring(0, 1));

        // Перевіряємо, чи збігаються перші цифри
        if (firstDigitFirstNumber == firstDigitSecondNumber) {
            System.out.println("Перші цифри чисел збігаються.");
        } else {
            System.out.println("Перші цифри чисел не збігаються.");
        }

        // Закриваємо сканер
        scanner.close();
    }
}
