import javax.swing.JOptionPane;
public class ex03B {
 public static void main(String[] args) {
 
 def calcular_media; {
    soma = 0
    contador = 0

    while True:
        valor = int(input("Digite um valor natural (ou 0 para sair): "))
        
        if valor == 0:
            break
        
        soma += valor
        contador += 1

    if contador > 0:
        media = soma / contador
        print(f"A média aritmética dos valores digitados é: {media:.2f}")
    else:
        print("Nenhum valor natural foi digitado.")

calcular_media()


