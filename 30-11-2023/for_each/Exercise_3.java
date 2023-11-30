package for_each;

import java.util.Scanner;

public class Exercise_3 {

	public static void main(String[] args) {
		String[] frutas = { "Ma��", "Laranja", "Banana", "Lim�o", "Goiaba" };
		String selecao;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite uma fruta: ");  selecao = scanner.nextLine();
		
		int index = -1;
		int code = -1;
		
		for(int i = 0; i < frutas.length; i++) {
			if(frutas[i].equals(selecao)) {
				System.out.println("Fruta " + frutas[i] + " selecionada!");
				index = i;
				break;
			}
		}
		
		if(index == -1) {
			scanner.close();
			System.out.println("Fruta n�o encontrada!");
			return;
		}

		System.out.println("C�digos:\n"
				+ "0 - Cancelar.\n"
				+ "1 - Apagar.\n"
				+ "2 - Editar.");
		System.out.print("Digite o c�digo da opera��o: "); code = scanner.nextInt();
		
		Scanner scan = new Scanner(System.in);
		switch(code) {
			case 0 : {
				System.out.println("Opera��o cancelada!");
				break;
			}
			
			case 1 : {
				System.out.println("** Apagar **");

				System.out.println("Fruta " + frutas[index] + " apagada!");

				frutas[index] = "";
				break;
			}
			
			case 2 : {
				System.out.println("** Editar **");
				
				String temp = frutas[index];
				System.out.print("Digite o novo nome da fruta: "); String novaFruta = scan.nextLine();
				
				frutas[index] = novaFruta;
				
				System.out.println("Fruta " + temp + " editada!");
				
				break;
			}
			
			default : {
				System.out.println("C�digo n�o existe!");
				break;
			}
		}

		System.out.println("\nNova lista: ");
		for(String fruta : frutas) {
			System.out.print(" " + fruta);
		}
		
		scan.close();
		scanner.close();
	}

}
