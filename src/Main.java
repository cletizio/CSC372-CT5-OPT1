public class Main {
    public static void  main(String[] args) {
        double[] userNums = Recursion.userInput(5);

        double result = Recursion.calculateProduct(userNums);
        System.out.println(result);
    }
}
