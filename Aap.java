import java.util.Scanner;

public class Aap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.print("Enter the first value >> ");
        a = sc.nextDouble();
        System.out.print("Enter the second value >> ");
        b = sc.nextDouble();
        c = Math.sqrt((a*a)+(b*b));
        System.out.println("The hypotenuse of the triangle is "+c);
        sc.close();
    }
    
}
