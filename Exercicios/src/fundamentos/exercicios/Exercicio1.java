package fundamentos.exercicios;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		
		double F = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de fahrenheit", "Mensagem",JOptionPane.INFORMATION_MESSAGE));
			
		double calculo = (F - 32) * 5/9;
		JOptionPane.showMessageDialog(null, "O valor de Fahrenheit para Celcius é: " + calculo , "Mensagem", JOptionPane.INFORMATION_MESSAGE);
	}

}
