import javax.swing.JOptionPane;

public class Solucao4 {
    public static void main(String[] args) {
        String sNum1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String sNum2 = JOptionPane.showInputDialog("Digite o segundo número:");
        String sNum3 = JOptionPane.showInputDialog("Digite o terceiro número:");

        int num1 = Integer.parseInt(sNum1);
        int num2 = Integer.parseInt(sNum2);
        int num3 = Integer.parseInt(sNum3);

        if (num1 < num2 && num1 < num3) {
            System.out.print(num1 + " ");
            if (num2 < num3) {
                System.out.print(num2 + " " + num3);
            } else {
                System.out.print(num3 + " " + num2);
            }
        } else if (num2 < num1 && num2 < num3) {
            System.out.print(num2 + " ");
            if (num1 < num3) {
                System.out.print(num1 + " " + num3);
            } else {
                System.out.print(num3 + " " + num1);
            }
        } else {
            System.out.print(num3 + " ");
            if (num1 < num2) {
                System.out.print(num1 + " " + num2);
            } else {
                System.out.print(num2 + " " + num1);
            }
        }
    }
}
