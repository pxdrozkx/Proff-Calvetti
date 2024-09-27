import javax.swing.JOptionPane;

public class Solucao11 {
    public static void main(String[] args) {
        String sNum = JOptionPane.showInputDialog("Digite um número:");
        int num = Integer.parseInt(sNum);

        if (num % 3 == 0 && num % 7 == 0) {
            System.out.println("É divisível por 3 e 7.");
        } else {
            System.out.println("Não é divisível por 3 e 7.");
        }
    }
}
