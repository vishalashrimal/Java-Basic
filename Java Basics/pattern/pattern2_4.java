// import java.util.*;
// public class pattern2_4 {
//     public static void main(String[] args) {
//         int n=4;
        
//         //Outer loop 
//         for(int i=1;i<=n;i++){
//             //Inner loop to print Space
//             for (int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }

//             // 2nd Inner l<oop to Print Star "*"
//             for (int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println( );
//         }
//     }
// }



import java.util.*;
public class pattern2_4{
    public static void main(String[] args){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
                System.out.print("*");
            
            System.out.println();
        }
    }
}