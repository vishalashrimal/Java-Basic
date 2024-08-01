import java.util.*;
public class palidrome {
    public static void Palindrome(int n) {
        int c=n;
        int s=0;
        while (n>0){
            int rem = n%10;
            s=(s*10)+rem;
            n=n/10;
        }
        if (s==c) {
            System.out.println(c + " Number is Palindrome");
        }else{
            System.out.println(c + " Number is not Palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        Palindrome(n);
    }
}
