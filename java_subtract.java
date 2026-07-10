import java.util.Scanner;

public class java_subtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        int difference = a - b;
        System.out.println("The difference is: " + difference);
    }
}
