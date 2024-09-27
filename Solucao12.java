import javax.swing.JOptionPane;

public class Solucao12 {
    public static void main(String[] args) {
        String sNum = JOptionPane.showInputDialog("Digite um número:");
        int num = Integer.parseInt(sNum);

        if (num % 10 == 0) {
            System.out.println("É divisível por 10.");
        } else if (num % 5 == 0) {
            System.out.println("É divisível por 5.");
        } else if (num % 2 == 0) {
            System.out.println("É divisível por 2.");
        } else {
            System.out.println("Não é divisível por nenhum desses.");
        }
    }
}
