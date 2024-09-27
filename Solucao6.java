import javax.swing.JOptionPane;

public class Solucao6 {
    public static void main(String[] args) {
        String sNum = JOptionPane.showInputDialog("Digite um número:");
        int num = Integer.parseInt(sNum);

        if (num > 20) {
            System.out.println("Maior do que 20.");
        } else if (num == 20) {
            System.out.println("Igual a 20.");
        } else {
            System.out.println("Menor do que 20.");
        }
    }
}
