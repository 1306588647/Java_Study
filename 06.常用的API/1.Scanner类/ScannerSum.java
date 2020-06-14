import java.util.Scanner;

public class ScannerSum {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Please input the first number：");
        int a = scanf.nextInt();
        System.out.println("Please input the second number：");
        int b =scanf.nextInt();
        System.out.println("sum="+(a+b));
    }
}
