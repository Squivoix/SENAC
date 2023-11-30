package switch_case;

import java.util.Scanner;

public class Exercise_3 {

	public static void main(String[] args) {
		
		String command;
		int state = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bem vindo(a) ao programa de controle de ventiladores!\n");
		
		do {
			System.out.print("Digite 'ligar' para ligar o ventilador, 'desligar' para desligar o ventilador ou 'sair' para sair do programa: ");
			command = scanner.nextLine().toLowerCase();
			
			switch(command) {
				case "ligar" : {
					if(state == 1 ) {
						System.out.println("O ventilador já está ligado!");
					} else {
						System.out.println("Ligando o ventilador!");			
						state = 1;
					}
					
					break;
				}
				
				case "desligar" : {
					if(state == 0) {
						System.out.println("O ventilador já está desligado!");	
					} else {
						System.out.println("Desligando ventilador!");
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
