// Function Overloading Using Data Types

import java.util.*;
public class funcOverloading2 {
    public static int sum(int a, int b){
        return a + b;
    }

    public static float sum(float a, float b){
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Sum of Integers : " + sum(4, 5));
        System.out.println("Sum of float Number : " + sum(3.5f, 4.5f));
    }
}

