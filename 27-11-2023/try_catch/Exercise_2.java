package try_catch;

import java.util.Scanner;

public class Exercise_2 {

	public static void main(String[] args) {
		float n;

		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("Digite o comprimento do terreno em metros: "); n = scanner.nextFloat();
			
			System.out.println(String.format("O terreno é de %.2f metros quadrados", n * n));
			
		} catch(Exception e) {
			throw new NumberFormatException();
		}
	}

}
