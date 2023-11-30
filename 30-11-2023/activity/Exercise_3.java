package activity;

import java.util.Scanner;

public class Exercise_3 {

	public static void main(String[] args) {
		String[] frutas = { "Maçã", "Laranja", "Banana", "Limão", "Goiaba" };
		
		System.out.println("Códigos das frutas: ");
		for(int i = 0; i < frutas.length; i++) {			
			System.out.println(String.format("%d - %s", i + 1, frutas[i]));
		}

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o código da fruta: "); int cod = scanner.nextInt();

		switch(cod) {
		    case 1: {
		        System.out.println("A fruta selecionada foi Maçã");
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
		        System.out.println("A fruta selecionada foi Limão");
		        break;
		    }
		    case 5: {
		        System.out.println("A fruta selecionada foi Goiaba");
		        break;
		    }
		    default: {
		        System.out.println("O código digitado não existe!");
		    }
		}


		scanner.close();
	}

}
