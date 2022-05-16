
public class TestaCondicional {
		
	public static void main(String[] args) {
		System.out.println("Oi Porra");
		
		int idade = 16;
		int quantidadePessoas = 1;
		
		if (idade >= 18) {
			System.out.println("Parabéns, você é maior de idade!!!");
		}else {
			if(quantidadePessoas >= 2) {
				System.out.println("Você pode entrar, pois está acompanhado");
			} else {
			System.out.println("Você é de menor");
			}
		}
	}

}
