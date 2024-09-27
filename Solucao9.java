import javax.swing.JOptionPane;

public class Solucao9 {
    public static void main(String[] args) {
        String sNum = JOptionPane.showInputDialog("Digite um número:");
        int num = Integer.parseInt(sNum);

        if (num % 3 == 0) {
            System.out.println("É múltiplo de 3.");
        } else {
            System.out.println("Não é múltiplo de 3.");
        }
    }
}
