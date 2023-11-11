import java.util.Scanner;

public class Recursion {
    public static double[] userInput(int count){
        if (count == 0){
            return new double[0];
        }
        else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            double userNum = scanner.nextDouble();
            double[] numsLeft = userInput(count - 1);
            double[] result = new double[numsLeft.length +1];
            result[0] = userNum;
            System.arraycopy(numsLeft,0,result,1,numsLeft.length);
            return result;
        }
    }
}
