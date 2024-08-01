import java.util.*;
public class RhombusPattern {

    public static void Rhombus(int n){
        for(int i=1;i<=n;i++){

            //Spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowRhombus(int n){
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            // hollowRhombus - stars
            for(int j=1;j<=n;j++){
                if(i==1 || n==i || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
     
    public static void main(String[] args) {
        // Rhombus(5);
        hollowRhombus(4);
    }
}