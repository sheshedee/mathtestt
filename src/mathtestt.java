import java.util.Scanner;

public class mathtestt {
    public void takeAway(int a, int b) {
        int result = a - b;
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        mathtestt mathtestt = new mathtestt();

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        mathtestt.takeAway(num1, num2);
    }
}
