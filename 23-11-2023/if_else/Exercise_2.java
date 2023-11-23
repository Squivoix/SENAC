package if_else;

import java.util.Scanner;

public class Exercise_2 {

	public static void main(String[] args) {
		int n1, n2, sum, max = 15;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		
		n1 = scanner.nextInt();
		
		System.out.print("Digite o segundo número: ");
		
		n2 = scanner.nextInt();

		sum = n1 + n2;
		
		if(sum >= max) {
			System.out.println("A soma utrapassou o máximo!");			
		} else {
			System.out.println("A soma está de acordo com o máximo!");
		}
		
		scanner.close();
	}

}
