import java.util.*;
public class pattern2_2 {
        public static void main(String[] args){
        int n=4;
        int m=3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int p=1;p<=m;p++){
            for(int q=1;q<=m-p+1;q++){
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
    

