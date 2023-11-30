package for_each;

public class Exercise_4 {

	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(5000);
		
		int contador = 0;
		
		for(int i = 0; i < 1000; i++) {
			System.out.println(String.format("Somando %d com %d", contador, i));
			contador += i;
		}
		
		System.out.println("O valor final é " + contador);
		
	}

}
