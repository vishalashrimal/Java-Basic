// Overloading using Parameters

import java.util.*;
public class funcOverloading {
    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, int b,int c){
        return a+ b + c;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 2 numbers : " + sum(3, 5));
        System.out.println("Sum of 3 numbers :" + sum(3, 4, 1));
    }
    
}
