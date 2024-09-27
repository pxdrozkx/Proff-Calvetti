import javax.swing.JOptionPane;

public class Solucao5 {
    public static void main(String[] args) {
        String sNum = JOptionPane.showInputDialog("Digite um número:");
        int num = Integer.parseInt(sNum);

        if (num >= 20 && num <= 90) {
            System.out.println("O número está entre 20 e 90.");
        } else {
            System.out.println("O número não está entre 20 e 90.");
        }
    }
}
