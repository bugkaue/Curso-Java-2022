package fundamentos.exercicios;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		// 5 °C × 9/5 + 32
		double C = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite qual o valor em Celcius", "Mensagem", JOptionPane.INFORMATION_MESSAGE ));
				
		double calculo = C * 9/5 + 32;
				
		JOptionPane.showMessageDialog(null, "O valor de Celcius para Fahrenheit é: " + calculo , "Mensagem", JOptionPane.INFORMATION_MESSAGE);

	}

}
