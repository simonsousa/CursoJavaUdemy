package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informações do funcionário
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 567788;
		long pontosAcumulados = 3_134_845_223L; //Quando vc atribuir um literal, e o mesmo passar a capacidade de um inteiro, colocamos a letra L, no final do número, para dizer que é um long; 
		
		// Tipos numéricos reais
		float salario = 11_445.44f; // literal float
		double vendasAcumuladas = 2_991_797_103.01; 
		
		// Tipo booleano
		boolean estaDeFerias = false; // true
		
		// Tipo caractere
		char status = 'A'; // ativo (não pode colocar mais de uma letra)
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Numeros de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Ferias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}
}
