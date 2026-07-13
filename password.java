import java.util.Scanner;

public class password {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int password = 1234;
        int input = 0;

        while(input != password){
            System.out.print("Enter Password: ");
            input = sc.nextInt();
        }

        System.out.println("Access Granted");

        sc.close();
    }
}
