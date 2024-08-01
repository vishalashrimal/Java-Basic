import java.util.*;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of line : ");
        int n = sc.nextInt();
        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println(" ");
        // }

        for (int k = 1; k <= n; k++) {
            for (int l = 1; l <= n - k + 1; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
