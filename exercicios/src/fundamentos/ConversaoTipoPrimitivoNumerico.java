package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; // implícita
		System.out.println(a);
		
		float b = (float) 1.1234578888888; // explícita (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; // explicita (CAST)
		System.out.println(d);	
		
		/** Java não analisa valores, só analisa tipos */
		
		double e = 1.999999;
		int f = (int) e; // explicita (CAST) -> houve perda de dados
		System.out.println(f);
		
	}
}
