import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void firstTask() {
        System.out.print("Input first array size: ");
        int size = scanner.nextInt();
        double[] array = new double[size];

        double max = -0.1;
        double min = 1.1;
        for (int i = 0; i < size; ++i) {
            array[i] = Math.random();
            max = Math.max(array[i], max);
            min = Math.min(array[i], min);
        }
        Arrays.sort(array);
        System.out.println("Average element: " + array[size / 2]);
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }

    public static void secondTask() {
        System.out.print("Input second array size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        Random random = new Random();
        System.out.print("Prime numbers: ");

        for (int i = 0; i < size; ++i) {
            array[i] = random.nextInt(99) + 2;
            boolean isPrime = true;
            for (int j = 2; j < array[i]; ++j) {
                if (array[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        firstTask();
        System.out.print("\n----\n\n");
        secondTask();
        System.out.println("Program finished working!");
    }
}
