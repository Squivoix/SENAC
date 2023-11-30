package switch_case;

import java.util.Scanner;

public class Exercise_1 {

	public static void main(String[] args) {
		int colorCode = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Códigos das cores: \n"
				+ "1 - Vermelho.\n"
				+ "2 - Verde.\n"
				+ "3 - Azul.\n"
				+ "4 - Amarelo.\n"
				+ "5 - Roxo.\n"
				+ "6 - Ciano.\n"
				+ "7 - Laranja.\n"
				+ "8 - Branco\n"
				+ "9 - Preto.\n"
				+ "Digite o código da cor: ");
		colorCode = scanner.nextInt();
		
		switch(colorCode) {
			case 1 : {
				System.out.println("A cor selecionada foi a Vermelha");
				break;
			}
			
			case 2 : {
				System.out.println("A cor selecionada foi a Verde");
				break;
			}
			
			case 3 : {
				System.out.println("A cor selecionada foi a Azul");
				break;
			}
			
			case 4 : {
				System.out.println("A cor selecionada foi a Amarela");
				break;
			}
			
			case 5 : {
				System.out.println("A cor selecionada foi a Roxa");
				break;
			}
			
			case 6 : {
				System.out.println("A cor selecionada foi a Ciano");
				break;
			}
			
			case 7 : {
				System.out.println("A cor selecionada foi a Laranja");
				break;
			}
			
			case 8 : {
				System.out.println("A cor selecionada foi a Branca");
				break;
			}
			
			case 9 : {
				System.out.println("A cor selecionada foi a Preta");
				break;
			}
			
			default : {
				System.out.println("Esse código não existe!");
				break;
			}
		}
		
		scanner.close();
	}

}
