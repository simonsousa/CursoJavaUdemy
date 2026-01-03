package fundamentos;

import java.util.Locale;

public class Temperatura {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// (°F - 32) x 5/9.0 = °C  		-> para o java, 5/9 resulta em 0, pois essa linguagem considera que a divisão de 2 inteiros resulta em um inteiro. 
		final double FATOR = 5/9.0;
		final int AJUSTE = 32;
		
		double fahrenheit = 85.32;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("A temperatura de " + fahrenheit + "°F é equivalente a " + String.format("%.2f", celsius) + "°C.");
		
		fahrenheit = 0;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("A temperatura de " + fahrenheit + "°F é equivalente a " + String.format("%.2f", celsius) + "°C.");
		
	}
}
