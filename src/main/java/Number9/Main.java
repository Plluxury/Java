package Number9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода с консоли
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя ввод первого числа
        System.out.print("Введите число x: ");
        int x = scanner.nextInt();

        // Запрашиваем у пользователя ввод второго числа
        System.out.print("Введите число y: ");
        int y = scanner.nextInt();

        // Находим большее число
        int max = Math.max(x, y);

        // Возводим большее число в квадрат
        int result = max * max;

        // Выводим результат на экран
        System.out.println("Большее число: " + max);
        System.out.println("Результат (квадрат большего числа): " + result);

        // Закрываем Scanner
        scanner.close();
    }
}