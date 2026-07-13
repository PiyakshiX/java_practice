import java.util.Scanner;

public class menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do{
            System.out.println("1. Start");
            System.out.println("2. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

        }while(choice != 2);

        System.out.println("Program Closed");

        sc.close();
    }
}