package app.main.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WeeklyPlanner {
    private static final String[] DAYS_OF_WEEK = {
            "Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця", "Субота", "Неділя"
    };

    private static final Map<String, String> tasks = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Планувальник робочого тижня ---");
            System.out.println("1. Додати завдання");
            System.out.println("2. Переглянути завдання");
            System.out.println("3. Вийти");
            System.out.print("Виберіть опцію: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // очищення буфера

            switch (option) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    running = false;
                    System.out.println("Вихід з програми...");
                    break;
                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
            }
        }

        scanner.close();
    }

    private static void addTask(Scanner scanner) {
        System.out.println("Виберіть день тижня:");
        for (int i = 0; i < DAYS_OF_WEEK.length; i++) {
            System.out.printf("%d. %s%n", i + 1, DAYS_OF_WEEK[i]);
        }
        System.out.print("Ваш вибір (1-7): ");
        int day = scanner.nextInt();
        scanner.nextLine(); // очищення буфера

        if (day < 1 || day > 7) {
            System.out.println("Невірний день. Спробуйте ще раз.");
            return;
        }

        System.out.print("Введіть завдання: ");
        String task = scanner.nextLine();
        tasks.put(DAYS_OF_WEEK[day - 1], task);
        System.out.println("Завдання додано на " + DAYS_OF_WEEK[day - 1]);
    }

    private static void viewTasks() {
        System.out.println("\n--- Завдання на тиждень ---");
        for (String day : DAYS_OF_WEEK) {
            String task = tasks.get(day);
            if (task != null) {
                System.out.printf("%s: %s%n", day, task);
            } else {
                System.out.printf("%s: Немає завдань.%n", day);
            }
        }
    }
}
