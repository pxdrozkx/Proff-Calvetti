import javax.swing.JOptionPane;

public class Solucao8 {
    public static void main(String[] args) {
        String sNum1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String sNum2 = JOptionPane.showInputDialog("Digite o segundo número:");

        int num1 = Integer.parseInt(sNum1);
        int num2 = Integer.parseInt(sNum2);

        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else {
            System.out.println("O maior número é: " + num2);
        }
    }
}
