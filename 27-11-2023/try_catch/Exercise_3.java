package try_catch;

import java.util.Scanner;

public class Exercise_3 {

	public static void main(String[] args) {
		short n;
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("Digite um número entre -32.768 e 32.767: "); n = scanner.nextShort();
			
			if(n < 0)
				System.out.println("O número é negativo!");
			else
				System.out.println("O número é positivo!");
			
		} catch(Exception e) {
			System.out.println("Ocorreu algum erro!");
		}
	}

}
