public class method_overloading {
    static int add(int a,int b){
        return a+b;
    }
    static double add(double a,double b){
        return a+b;
    }
    public static void main(String[] args){
        int result1 = add(20,30);
        double result2 = add(10.5,20.5);
        System.out.println("The sum of two integers is: " + result1);
        System.out.println("The sum of two doubles is: " + result2);
    }
}
