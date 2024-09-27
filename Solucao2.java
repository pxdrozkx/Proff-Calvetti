import javax.swing.JOptionPane;

public class Solucao2 {
    public static void main(String[] args) {
        String sNum1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String sNum2 = JOptionPane.showInputDialog("Digite o segundo número:");

        double num1 = Double.parseDouble(sNum1);
        double num2 = Double.parseDouble(sNum2);
        double resultado = num1 + num2;

        if (resultado <= 20) {
            resultado -= 5;
        }
        System.out.println("Resultado: " + resultado);
    }
}
