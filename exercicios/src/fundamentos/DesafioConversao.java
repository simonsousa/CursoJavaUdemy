package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o antepenúltimo salário do funcionario zezim: R$");
		String antePenultSalario = input.next().trim().replace(",", ".");
		
		System.out.print("Digite o penúltimo salário do funcionario zezim: R$");
		String penultSalario = input.next().trim().replace(",", ".");
		
		System.out.print("Digite o último salário do funcionario zezim: R$");
		String ultimoSalario = input.next().trim().replace(",", ".");
				
		Double antePenSalario = Double.parseDouble(antePenultSalario);
		Double penSalario = Double.parseDouble(penultSalario);
		Double ultSalario = Double.parseDouble(ultimoSalario);
		
		double mediaUltimosTresSalarios = ((antePenSalario + penSalario + ultSalario)/3);
		
		System.out.printf("A média total dos últimos 3 salários"
				+ " do funcionário zezim é R$%.2f", mediaUltimosTresSalarios);
		
		input.close();
	}
}
