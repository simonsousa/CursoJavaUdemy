package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.14159;
	
		//pi = 1; -> esta sentença de código vai dar erro, pois variáveis constantes não podem ter seus valores atribuidos novamente
		double area = PI * raio * raio;
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área = " + area + "m2.");
	}
}
