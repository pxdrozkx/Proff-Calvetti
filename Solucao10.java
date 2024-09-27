import javax.swing.JOptionPane;

public class Solucao10 {
    public static void main(String[] args) {
        String sNum = JOptionPane.showInputDialog("Digite um número:");
        int num = Integer.parseInt(sNum);

        if (num % 5 == 0) {
            System.out.println("É divisível por 5.");
        } else {
            System.out.println("Não é divisível por 5.");
        }
    }
}
