import javax.swing.JOptionPane;

public class Solucao3 {
    public static void main(String[] args) {
        String sNum = JOptionPane.showInputDialog("Digite um número:");
        double num = Double.parseDouble(sNum);

        if (num >= 0) {
            System.out.println("Raiz quadrada: " + Math.sqrt(num));
        } else {
            System.out.println("Quadrado: " + (num * num));
        }
    }
}
