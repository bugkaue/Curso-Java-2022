package fundamentos.exercicios;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		
		double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da base: ", "Mensagem", JOptionPane.INFORMATION_MESSAGE));
		double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da altura: ", "Mensagem", JOptionPane.INFORMATION_MESSAGE));
		
		double area = base * altura;
		JOptionPane.showMessageDialog(null, "O valor da area é: " + area , "Mensagem", JOptionPane.INFORMATION_MESSAGE);

	}

}
