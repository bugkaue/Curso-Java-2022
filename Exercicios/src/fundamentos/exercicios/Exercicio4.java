package fundamentos.exercicios;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número: ", "Mensagem", JOptionPane.INFORMATION_MESSAGE));
		double cubo = Math.pow(valor, 3);
		double quadrado = Math.pow(valor, 2);
		JOptionPane.showMessageDialog(null, "O número ao cubo é: " + cubo + "\nO número ao quadrado é: " + quadrado);

	}

}
