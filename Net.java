import java.util.Scanner;

public class Net {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n - 1;
        for (int i = 1; i <= n; i++) {
            
            for (int j = space; j >= i; j--) {
                System.out.print(" ");
            }
           // space-=1;
            for(int k=1;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
        sc.close();
    }
}
