import javax.swing.JOptionPane;

public class Solucao13 {
    public static void main(String[] args) {
        String sNum = JOptionPane.showInputDialog("Digite um número inteiro de 3 casas:");
        int num = Integer.parseInt(sNum);

        int dezenas = (num / 10) % 10;

        if (dezenas % 2 == 0) {
            System.out.println("O algarismo da casa das dezenas é par.");
        } else {
            System.out.println("O algarismo da casa das dezenas é ímpar.");
        }
    }
}
