
public class TestaPontoFlutuante {
	
	public static void main(String[] args ) {
		
		double[] notas = {7.5, 8,5, 9, 6,5};
		
		for(int i = 0; i < 4; i++) {
			System.out.println("As Notas de Leonardo são: "+ notas[i]);
		}
		
		double divisao = 3.14 / 2;
		
		System.out.println("A divisão é: "+ divisao);
		
		double novaDivisao = 5.0 / 2; // utiliza-se o '.0' depois do 5 para forçar o resultado com ponto flutuante
		
		System.out.println("Resultado da nova divisão é: "+ novaDivisao);
	}
}
