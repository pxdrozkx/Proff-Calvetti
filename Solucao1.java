import javax.swing.JOptionPane;

public class Solucao1 {
    public static void main(String[] args) {
        String sNum1 = JOptionPane.showInputDialog("Digite o primeiro número inteiro:");
        String sNum2 = JOptionPane.showInputDialog("Digite o segundo número inteiro:");

        int num1 = Integer.parseInt(sNum1);
        int num2 = Integer.parseInt(sNum2);
        int resultado = num1 + num2;

        if (resultado > 10) {
            System.out.println("O resultado da adição é: " + resultado);
        }
    }
}
