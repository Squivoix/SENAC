package switch_case;

import java.util.Scanner;

public class Exercise_4 {

	public static void main(String[] args) {
		int idade = -1;
		int sala = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: "); idade = scanner.nextInt();
		
		if(idade <= 0) {
			sala = -1;
		} else if(idade < 10) {
			sala = 1;
		} else if(idade < 12) {
			sala = 2;
		} else if(idade < 14) {
			sala = 3;
		} else if(idade < 16) {
			sala = 4;
		} else if(idade < 18) {
			sala = 5;
		} else {
			sala = 6;
		}

		switch(sala) {
			case 1 : {
				System.out.println("Direcione-se para a sala: 1");
				break;
			}
			
			case 2 : {
				System.out.println("Direcione-se para a sala: 2");
				break;
			}
			
			case 3 : {
				System.out.println("Direcione-se para a sala: 3");
				break;
			}
			
			case 4 : {
				System.out.println("Direcione-se para a sala: 4");
				break;
			}
			
			case 5 : {
				System.out.println("Direcione-se para a sala: 5");
				break;
			}
			
			case 6 : {
				System.out.println("Direcione-se para a sala: 6");
				break;
			}
			
			default : {
				System.out.println("Você digitou uma idade inválida!");
				break;
			}
		}
		
		scanner.close();
	}

}
