import javax.swing.JOptionPane;

public class App{
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "What is your name?");
        JOptionPane.showMessageDialog(null, "Hii " +name);
        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "What is your age?"));
        JOptionPane.showMessageDialog(null, "Your age is " +age);
        double height = Double.parseDouble(JOptionPane.showInputDialog(null, "What is your height?"));
        JOptionPane.showMessageDialog(null, "Your height is " +height+" cm");
    }
}