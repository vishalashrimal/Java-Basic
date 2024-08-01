import java.util.*;
public class palindronePattern {
    public static void Palindrome(int n){
        for(int i=1;i<=n;i++){
            //Spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //Descending Numbers print
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            // ascending numbers
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Palindrome(4);
    }
}
