package activity;

import java.util.Scanner;

public class Exercise_1 {

	public static void main(String[] args) {
		String[] cores = { "Vermelho", "Verde", "Azul", "Amarelo", "Laranja", "Ciano", "Branco", "Preto", "Roxo", "Rosa" };
		
		System.out.println("Códigos das cores: ");
		for(int i = 0; i < cores.length; i++) {			
			System.out.println(String.format("%d - %s", i + 1, cores[i]));
		}

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o código da cor: "); int cod = scanner.nextInt();

		switch(cod) {
		    case 1: {
		        System.out.println("A cor selecionada foi Vermelho");
		        break;
		    }
		    case 2: {
		        System.out.println("A cor selecionada foi Verde");
		        break;
		    }
		    case 3: {
		        System.out.println("A cor selecionada foi Azul");
		        break;
		    }
		    case 4: {
		        System.out.println("A cor selecionada foi Amarelo");
		        break;
		    }
		    case 5: {
		        System.out.println("A cor selecionada foi Laranja");
		        break;
		    }
		    case 6: {
		        System.out.println("A cor selecionada foi Ciano");
		        break;
		    }
		    case 7: {
		        System.out.println("A cor selecionada foi Branco");
		        break;
		    }
		    case 8: {
		        System.out.println("A cor selecionada foi Preto");
		        break;
		    }
		    case 9: {
		        System.out.println("A cor selecionada foi Roxo");
		        break;
		    }
		    case 10: {
		        System.out.println("A cor selecionada foi Rosa");
		        break;
		    }
		    default: {
		        System.out.println("Você digitou um código que não existe!");
		    }
		}

		scanner.close();
	}

}
