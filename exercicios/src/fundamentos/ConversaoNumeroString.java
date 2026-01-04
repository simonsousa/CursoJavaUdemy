package fundamentos;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		/** Convertendo classe wrapper Integer -> String; e mostrando junto com o tipo*/
		Integer num1 = 10000;
		System.out.println(num1.toString() +" "+ ((Object) num1).getClass().getName()); // --> mostrando o wrapper convertido para String, concatenado com o seu tipo
		System.out.println(num1.toString() +" "+ ((Object) num1).getClass().getSimpleName()); // --> mostrando o wrapper convertido para String, concatenado com o seu tipo

		/** Outra forma de conversão, é usando o wrapper diretamente, do tipo primitivo*/
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		/** Estas operações, também o java sabe que vai gerar um valor do tipo String */
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
		
		
		/**	Outras Conversões (Wrappers -> Strings);
			
			Byte.toString(b);
			Short.toString(s);
			Integer.toString(i);
			Long.toString(l);
			
			Float.toString(f)
			Double.toString(d);
		*/
	}
}
