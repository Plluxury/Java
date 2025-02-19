package Number2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода с консоли
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя ввод числа a
        System.out.print("Введите число a: ");
        double a = scanner.nextDouble();

        // Запрашиваем у пользователя ввод числа b
        System.out.print("Введите число b: ");
        double b = scanner.nextDouble();

        // Находим наибольшее и наименьшее из чисел a и b
        double max = Math.max(a, b);
        double min = Math.min(a, b);

        // Вычисляем значение d по заданной формуле
        double d = (Math.pow(max, 5) - 3.2 * min) / (1 + min);

        // Выводим результаты на экран
        System.out.println("Наибольшее число: " + max);
        System.out.println("Наименьшее число: " + min);
        System.out.println("Результат вычисления d: " + d);

        // Закрываем Scanner
        scanner.close();
    }
}
