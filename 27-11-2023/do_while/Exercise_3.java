package do_while;

import java.util.Scanner;

public class Exercise_3 {

	public static void main(String[] args) {
		String phrase;
		String[] breakdown;
		int ite = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite uma frase: "); phrase = scanner.nextLine();
		
		breakdown = phrase.split(" ");
		
		System.out.println("Aqui está a frase quebrada em palavras: ");
		
		while(ite < breakdown.length) {
			
			System.out.println(breakdown[ite]);
			
			ite++;
		}
		
		scanner.close();
	}

}
