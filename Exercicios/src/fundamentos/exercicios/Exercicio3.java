package fundamentos.exercicios;

import javax.swing.JOptionPane;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o seu peso: ", "Mensagem", JOptionPane.INFORMATION_MESSAGE));
		double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o sua altura: ", "Mensagem", JOptionPane.INFORMATION_MESSAGE));
		
		double IMC = peso / Math.pow(altura, 2);
		JOptionPane.showMessageDialog(null, "O IMC é: " + IMC, "Mensagem", JOptionPane.INFORMATION_MESSAGE);
	}
}
