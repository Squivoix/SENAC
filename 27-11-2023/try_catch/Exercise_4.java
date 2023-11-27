package try_catch;

import java.util.Scanner;

public class Exercise_4 {

	public static void main(String[] args) {
		long n;
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("Digite qualquer n�mero: "); n = scanner.nextLong();

			System.out.println("Aqui vai um erro pra voc�! Seu n�mero: " + n);
			throw new Exception();
			
		} catch(Exception e) {
			throw new NumberFormatException();
		}
	}

}
