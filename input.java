import java.util.Scanner;
public class input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        String age = sc.nextLine();
        System.out.println("Enter your college name: ");
        String college = sc.nextLine();
        System.out.println("My name is: " + name);
        System.out.println("My age is: " + age);
        System.out.println("My college name is: " + college);
        sc.close();
        
    }
}
