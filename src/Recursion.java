import java.util.Scanner;

public class Recursion {
    public static double[] UserInput(int count){
        if (count == 0){
            return new double[0];
        }
        else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            double userNum = scanner.nextDouble();
            UserInput(count - 1);
            return new double[]{userNum};
        }

    }

}
