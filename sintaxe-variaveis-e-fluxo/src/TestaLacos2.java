
public class TestaLacos2 {
	
public static void main(String[] args) {
		
		for(int linhas = 0; linhas < 10; linhas++) {
			for(int colunas = 0; colunas <= linhas; colunas++) {
				System.out.print("*"); // imprime '*' 
			}
			System.out.println(); // pula linha depois do for interno
		}
	}
}
