// import java.util.*;
// public class diamondPattern {
//     public static void Diamond(int n){
        
//         // 1st HALF
//         for(int i=1;i<=n;i++){
//             // SPACES
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             // Stars
//             for(int j=1; j<=(2*i)-1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         // 2nd Half

//         for(int i=n;i>=1;i--){
//             // SPACES
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             // Stars
//             for(int j=1; j<=(2*i)-1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args){
//             Diamond(5);
        
//     }
// }
import java.util.*;
public class diamondPattern {

    public static void Diamond(int n){
        for(int i=1;i<=n;i++){
            //SPaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //STARS
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        //2nd HALF
        for(int i=n;i>=1;i--){
            //SPaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //STARS
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Diamond(4);
    }
}