package Number4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int rows = 3, cols = 4;
        int[][] matrix = new int[rows][cols];
        Random random = new Random();

        // Заполняем матрицу случайными значениями от -50 до 50
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = random.nextInt(101) - 50;

        // Выводим матрицу
        System.out.println("Матрица:");
        for (int[] row : matrix) {
            for (int value : row)
                System.out.printf("%5d", value);
            System.out.println();
        }

        // Вычисляем вектор B
        double[] vectorB = new double[cols];
        for (int j = 0; j < cols; j++) {
            double sum = 0;
            int count = 0;
            for (int i = 0; i < rows; i++)
                if (matrix[i][j] > 0) {
                    sum += matrix[i][j];
                    count++;
                }
            vectorB[j] = count > 0 ? sum / count : 0;
        }

        // Выводим вектор B
        System.out.println("\nВектор B:");
        for (double value : vectorB)
            System.out.printf("%8.2f", value);
        System.out.println();
    }
}
