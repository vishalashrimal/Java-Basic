import java.util.*;
public class calc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter B :");
        int b = sc.nextInt();
        System.out.print("Enter Operator : ");
        char Operator=sc.next().charAt(0);

        switch (Operator){
            case '+' : System.out.println(a+b);
                            break;
            case '-' : System.out.println(a-b);
                            break;
            case '*' : System.out.println(a*b);
                            break;
            case '/' : System.out.println(a/b);
                            break;
            case '%' : System.out.println(a%b);
                            break;
            default : System.out.println("Wrong Operator");
        }
    }
}
