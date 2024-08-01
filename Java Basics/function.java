import java.util.*;
public class function {
        // public static void hello() { 
        //     System.out.println("Hello World");
        // }
        public static int Calc(int num1, int num2 ){
            int sum = num1+num2;
            return sum;
        }
        public static void main(String[] args){
            // hello();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter num1: ");
            int a=sc.nextInt();
            System.out.print("Enter num2: ");
            int b=sc.nextInt();
            int sum=Calc(a,b);
            System.out.println("Sum is " + sum);
        }
}
