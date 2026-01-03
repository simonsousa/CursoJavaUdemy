package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
		double a = 4.5; // variavel declarada, e inicializada com um valor
		System.out.println(a); // usada!
		
		a = 12.57;
		System.out.println(a);
		
		// a = "..."; -> o java inferiu que a variavel a é do tipo double, e eu não posso atribuir outro valor que não seja real;
		
		var b = 4.5; //O java vai inferir o tipo dessa variável como double, pelo valor que você atribuiu a ela
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		// c = 4.5;   -> o java inferiu que a variavel c é do tipo String, e eu não posso atribuir outro valor que não seja texto;
		
		double d; // variável foi declarada
		d = 123.65; // variável foi inicializada
		System.out.println(d); // usada!
		
		var f = 12;
		//f = 12.01; -> tbm não vai funcionar, pois o valor inteiro dentro do java não consegue armazenar casas decimais
		System.out.println(f);
	}
}
