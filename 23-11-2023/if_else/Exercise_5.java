package if_else;

import java.util.Scanner;

public class Exercise_5 {

	public static void main(String[] args) {
		int width, height, length, area, max = 50;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a largura do pacote: "); width = scanner.nextInt();
		System.out.print("Digite a altura do pacote: "); height = scanner.nextInt();
		System.out.print("Digite o comprimento do pacote: "); length = scanner.nextInt();
		
		area = width * height * length;
		
		if(area > max) {
			System.out.println(String.format("A �rea do pacote � maior que o m�ximo! %s maior que %s", area, max));
		} else {
			System.out.println(String.format("A �rea do pacote � menor que o m�ximo! %s menor que %s", area, max));
		}
		
		scanner.close();
	}

}
