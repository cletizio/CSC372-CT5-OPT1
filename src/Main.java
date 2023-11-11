

public class Main {
    public static void  main(String[] args) {
        double[] userNums = Recursion.userInput(5);

        System.out.println("The numbers entered were: ");
        for (double num: userNums){
            System.out.println(num);
        }

    }

}
