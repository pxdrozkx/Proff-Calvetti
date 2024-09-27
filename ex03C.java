import javax.swing.JOptionPane;
public class ex03C {
 public static void main(String[] args) {
 
 def aproximar_raiz_quadrada():
    n = int(input("Digite um número natural: "))

    if n < 0:
        print("Por favor, digite um número natural (não negativo).")
        return

    raiz = 0
    while (raiz + 1) * (raiz + 1) <= n:
        raiz += 1

    print(f"O número natural que mais se aproxima de √{n}, sem ultrapassar, é {raiz}.")

aproximar_raiz_quadrada()

}