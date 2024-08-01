import java.util.*;
public class function1_3 {
    public static int product(int a, int b){
        int mul=a*b;
        return mul;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int prod = product(a, b);
        System.out.println("Product of numbers : " + prod);
        prod=product(3, 5);
        System.out.println("Product of number : " + prod);

    }
}
