package try_catch;

import java.util.Scanner;

public class Exercise_4 {

	public static void main(String[] args) {
		long n;
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("Digite qualquer número: "); n = scanner.nextLong();

			System.out.println("Aqui vai um erro pra você! Seu número: " + n);
			throw new Exception();
			
		} catch(Exception e) {
			throw new NumberFormatException();
		}
	}

}
