
public class Testacaracteres {
	
	public static void main(String[] args) {
		
		char letra = 'a';
		
		System.out.println("Letra: " + letra);
		
		
		char novaLetra = 65; //char armazena inteiro, um inteiro representa um numeto da tabela unicode
		System.out.println("A primeira letra é: "+ novaLetra);
		
		novaLetra = (char) (letra + 2);
		
		System.out.println("A Nova Letra é: "+ novaLetra); //incrementa a letra a ser exibida com +
		
		String palavra = "Leonardo Zequim  Facini";
		System.out.println(palavra);
		
		palavra = palavra + " " + 1993; // converte '1993' para String
		System.out.println(palavra);
	}

}
