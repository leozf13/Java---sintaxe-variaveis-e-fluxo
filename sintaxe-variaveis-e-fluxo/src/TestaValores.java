
public class TestaValores {
	
	public static void main(String[] args) {
		
		int primeiroNumero = 5;
		int segundoNumero = 7;
		
		segundoNumero = primeiroNumero;
		primeiroNumero = 17;
		System.out.println("Segundo numero agora vale: "+ segundoNumero);
		System.out.println("Primeiro número agora vale: "+ primeiroNumero);
		
		
	}
}
