package if_else;

import java.util.Scanner;

public class Exercise_5 {

	public static void main(String[] args) {
		int height, max = 50;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a altura do pacote: "); height = scanner.nextInt();
		
		if(height > max) {
			System.out.println(String.format("A altura do pacote é maior que o máximo! %s maior que %s", height, max));
		} else {
			System.out.println(String.format("A altura do pacote é menor que o máximo! %s menor que %s", height, max));
		}
		
		scanner.close();
	}

}
