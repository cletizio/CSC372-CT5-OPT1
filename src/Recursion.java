import java.util.Scanner;

public class Recursion {
    public static double[] userInput(int count) {
        if (count == 0) {
            return new double[0];
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            double userNum = scanner.nextDouble();
            double[] numsLeft = userInput(count - 1);
            double[] result = new double[numsLeft.length + 1];
            result[0] = userNum;
            System.arraycopy(numsLeft, 0, result, 1, numsLeft.length);
            return result;
        }
    }

    public static double calculateProduct(double[] numbers) {
        if (numbers.length == 0) {
            return 1;
        } else {
            return numbers[0] * calculateProduct(subArray(numbers, 1));
        }
    }

    public static double[] subArray(double[] array, int startIndex) {
        double[] result = new double[array.length - startIndex];
        System.arraycopy(array, startIndex, result, 0, result.length);
        return result;
    }
}
