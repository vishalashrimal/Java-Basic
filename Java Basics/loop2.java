import java.util.*;

public class loop2 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Number: ");
        // int n=sc.nextInt();
        // int sum=0;
        // int i=1;
        // while (i<=n){
        // sum+=i;
        // i++;
        // }
        // System.out.println("Sum is : " + sum);

        int n = 12345;
        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n / 10;
        }
    }
}
