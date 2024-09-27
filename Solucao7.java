import javax.swing.JOptionPane;

public class Solucao7 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        String sexo = JOptionPane.showInputDialog("Digite seu sexo (f/m):");
        String sIdade = JOptionPane.showInputDialog("Digite sua idade:");
        int idade = Integer.parseInt(sIdade);

        if (sexo.equalsIgnoreCase("f") && idade < 25) {
            System.out.println(nome + ", ACEITA.");
        } else {
            System.out.println(nome + ", NÃO ACEITA.");
        }
    }
}
