package Number3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Создаем массив из 10 элементов
        int[] array = new int[10];
        Random random = new Random();

        // Заполняем массив случайными значениями от 0 до 99
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        // Выводим исходный массив на экран
        System.out.println("Исходный массив:");
        printArray(array);

        // Находим индексы минимального и максимального элементов
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        // Меняем местами минимальный и максимальный элементы
        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;

        // Выводим измененный массив на экран
        System.out.println("\nМассив после замены минимального и максимального элементов:");
        printArray(array);
    }

    // Метод для вывода массива на экран
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}