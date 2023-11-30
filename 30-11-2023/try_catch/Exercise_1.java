package try_catch;

import java.util.Scanner;

public class Exercise_1 {

	public static void main(String[] args) {
		float peso = 0;

		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("Digite o seu peso: "); peso = scanner.nextFloat();
			
			
			System.out.println("Sua massa é: " + (peso / 9.81f));
		} catch (Exception e) {
			System.out.println("Você não digitou um número!");
		}
	}

}
