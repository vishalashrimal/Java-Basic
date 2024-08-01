import java.util.*;
public class loop3 {
    public static void main(String[] args){
        // int i=1;
        // do{
        //     System.out.println("Hello World");
        //     i++;
        // }while(i<10); 


        for(int i=1;i<=5;i++)
        {
            if (i==3){
                break;
            }
            System.out.println(i);
        }System.out.println("I am out of the loop");
    }
}
