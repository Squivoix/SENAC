package activity;

import java.util.Scanner;

public class Exercise_3 {

	public static void main(String[] args) {
		String[] frutas = { "Ma��", "Laranja", "Banana", "Lim�o", "Goiaba" };
		
		System.out.println("C�digos das frutas: ");
		for(int i = 0; i < frutas.length; i++) {			
			System.out.println(String.format("%d - %s", i + 1, frutas[i]));
		}

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o c�digo da fruta: "); int cod = scanner.nextInt();

		switch(cod) {
		    case 1: {
		        System.out.println("A fruta selecionada foi Ma��");
		        break;
		    }
		    case 2: {
		        System.out.println("A fruta selecionada foi Laranja");
		        break;
		    }
		    case 3: {
		        System.out.println("A fruta selecionada foi Banana");
		        break;
		    }
		    case 4: {
		        System.out.println("A fruta selecionada foi Lim�o");
		        break;
		    }
		    case 5: {
		        System.out.println("A fruta selecionada foi Goiaba");
		        break;
		    }
		    default: {
		        System.out.println("O c�digo digitado n�o existe!");
		    }
		}


		scanner.close();
	}

}
