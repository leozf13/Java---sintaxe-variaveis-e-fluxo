
public class TestaSomatoria {
	public static void main(String[] args) {
		int contador = 0, total = 0;
		
		while(contador <= 10) {
			total += contador;//total = total + contador			
			contador ++; //contador = contador + 1
		}
		
		System.out.println(total + "\n");
	}
}
