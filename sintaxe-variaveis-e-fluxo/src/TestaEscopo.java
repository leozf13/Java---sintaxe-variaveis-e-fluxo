
public class TestaEscopo {
	
	public static void main(String[] args) {
		System.out.println("Testando condicionais 2!!! \n");
		
		int idade = 16;
		int quantidadePessoas = 8;
		boolean acompanhado = quantidadePessoas >=2 ? true : false; //Uma variável existe apenas 
		//dentro do bloco que foi declarada
		
		if (idade >= 18 || acompanhado) { 
			System.out.println("Parabéns, você pode entrar!!!");
		} else {
			System.out.println("Você não pode entrar");
		  }	
	}
}
