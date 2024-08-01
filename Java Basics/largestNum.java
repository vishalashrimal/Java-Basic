import java.util.*;
public class largestNum {
    public static void main(String args[]){
        int a= 20, b=25, c=12;
        if ((a>=b) && (a>=c)){
            System.out.println("A is greater");   
        }
        else if ((b>=a) && (b>=c))
            System.out.println("B is greater");
        else{
            System.out.println("C is Greater");
        }
    }
}
