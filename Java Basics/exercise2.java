import java.util.*;
public class exercise2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        int n;
        int evenSum=0;
        int oddSum=0;
        do{
            System.out.print("Enter Number  : ");
            n=sc.nextInt();

            if(n%2==0){
                evenSum+=n;
            }
            else{
                oddSum+=n;
            }
            System.out.println("Do you want to continue? if Yes press 1 and 0 for no");
            choice=sc.nextInt();

        }while(choice==1);
        System.out.println("Sum of Even Numbers : " + evenSum);
        System.out.println("Sum of Odd Number : " + oddSum);
    }
}
