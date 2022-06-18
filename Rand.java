import java.util.Random;

public class Rand {
    public static void main(String[] args) {
        Random random = new Random();
        for(int i =1;i<=4;i++){
        int a = random.nextInt(10);
        System.out.print(a);//}
        char x =(char) random.nextInt(26+'a');
        System.out.print(x);}
    }
    
}
