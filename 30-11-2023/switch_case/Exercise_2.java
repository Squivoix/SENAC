package switch_case;

import java.util.Scanner;

public class Exercise_2 {

	public static void main(String[] args) {
		
		String command;
		int state = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bem vindo(a) ao programa de controle de lâmpadas!\n");
		
		do {
			System.out.print("Digite 'acender' para acender a luz, 'apagar' para apagar a luz ou 'sair' para sair do programa: ");
			command = scanner.nextLine().toLowerCase();
			
			switch(command) {
				case "acender" : {
					if(state == 1 ) {
						System.out.println("A luz já está acesa!");
					} else {
						System.out.println("Luz acesa!");			
						state = 1;
					}
					
					break;
				}
				
				case "apagar" : {
					if(state == 0) {
						System.out.println("A luz já está apagada!");	
					} else {
						System.out.println("Luz apagada!");
						state = 0;
					}
					
					break;
				}
				
				case "sair": { 
					System.out.println("Saindo do programa!");
					break; 
				}
				
				default : {
					System.out.println("Comando não existe!");
					break;
				}
			}
			
		} while(!command.equals("sair"));
		
		scanner.close();
	}

}
