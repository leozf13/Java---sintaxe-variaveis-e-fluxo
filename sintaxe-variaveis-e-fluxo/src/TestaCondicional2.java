
public class TestaCondicional2 {
		
	public static void main(String[] args) {
		System.out.println("Testando condicionais 2!!! \n");
		
		int idade = 16;
		int quantidadePessoas = 1;
		boolean acompanhado = quantidadePessoas >=2 ? true : false; //usando ternário para dar resultado ao boolean
		
		if (idade >= 18 || acompanhado) { // não precisa comparar booleano
			System.out.println("Parabéns, você pode entrar!!!");
		} else {
			System.out.println("Você não pode entrar");
		  }	
	}

}