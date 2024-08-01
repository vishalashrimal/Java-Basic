import java.util.*;
public class function1_1 {   //parameter or formal parameter
    public static  swap(int num1, int num2){
        int temp = num1;
        num1=num2;
        num2=temp;
        System.out.println("a = " + num1);
        System.out.println("b = " + num2);   
    }
    public static void main(String[] args) {  
        int a=10;
        int b=20;
        swap(a, b); // argument or actual parameters
    }
}
