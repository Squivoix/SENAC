package if_else;

import java.util.Scanner;

public class Exercise_4 {

	public static void main(String[] args) {
		int age;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a sua idade: "); age = scanner.nextInt();
		
		if(age > 18) {
			System.out.println("Voc� � maior de idade!");
		} else {
			System.out.println("Voc� � menor de idade!");
		}
		
		scanner.close();
	}

}
