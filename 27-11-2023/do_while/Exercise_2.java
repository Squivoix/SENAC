package do_while;

import java.util.Scanner;

public class Exercise_2 {

	public static void main(String[] args) throws InterruptedException {
		
		String phrase;
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		
		do {
			Thread.sleep(1000);

			System.out.print("Digite uma frase: "); phrase = scanner.nextLine();
			System.out.println("A frase que você digitou é: " + phrase);
			
			i++;
		} while(i < 10);
		
		scanner.close();
	}

}
