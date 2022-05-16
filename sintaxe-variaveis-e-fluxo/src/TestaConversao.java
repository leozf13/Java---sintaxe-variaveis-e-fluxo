
public class TestaConversao {
	
	public static void main(String[] args) {
		
		double salarioLiquido = 1497.53;
		int recebeSalario = (int) salarioLiquido; // '(int)' força salarioLiquido a se converter para o tipo int // casting
		
		System.out.println("Seu salário arredondado é: "+ recebeSalario);
	}
}


