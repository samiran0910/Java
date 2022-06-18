import java.util.Scanner;
public class Array2 {
    // taking input in an array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many cars you want to park? ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] cars = new String[n];
        System.out.print("Enter the names of your car(s) >> ");
        for (int i = 0; i < cars.length; i++) {
            cars[i] = sc.nextLine();
        }
        for (int j = 0; j < cars.length; j++) {
            System.out.println(cars[j].toUpperCase() + " is in slot number "+(j+1));
        }
        sc.close();
    }

}
