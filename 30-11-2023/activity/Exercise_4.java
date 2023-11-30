package activity;

public class Exercise_4 {
	public static void main(String[] args) throws InterruptedException {
		
		int contador = 0;
		int time = 5;
		
		while(time != 0) {
			System.out.println("Iniciando contagem em " + time);
			Thread.sleep(1000);
			time--;
		}

		
		for(int i = 0; i < 1000; i++) {
			System.out.println(String.format("Somando %d com %d", contador, i));
			contador += i;
		}
		
		System.out.println("O valor final é " + contador);
		
	}
}
