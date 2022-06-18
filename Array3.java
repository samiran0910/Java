import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many items you want to buy: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] cars = new String[n];
        System.out.print("Enter the items you want to buy: ");
        for (int i = 0; i < cars.length; i++) {
            cars[i] = sc.nextLine();
        }
        System.out.println("The items you entered are: ");
        for (int j = 0; j < cars.length; j++) {
            System.out.println((j+1) + ". " + cars[j].toUpperCase() + "\t");
        }
        System.out.println("For conformation Press 1 \nOr 2 to exit ");

        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Thanks for your order!!!");
                break;
            case 2:

        }
        sc.close();
    }

}
