import java.util.Scanner;

public class Rit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int space = n-1; 
        // for (int i=1;i<=n;i++){
        //     for(int j=1;j<=space;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=i;k++){
        //       System.out.print("* ");   
        //     }
        //     System.out.println();
        // }

        for (int i=1;i<=n;i++){
            for(int k=n-1;k>=n;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }

}
