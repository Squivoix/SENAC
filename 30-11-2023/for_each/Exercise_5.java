package for_each;

import java.util.*;

public class Exercise_5 {

	public static void main(String[] args) {
		
		int cod = -1;
		
		Scanner scannerCod = new Scanner(System.in);
		Scanner scannerData = new Scanner(System.in);
		
		ArrayList<String> inventory = new ArrayList<String>();
		
		while(cod != 9) {
			
			System.out.println("C�digos:\n"
					+ "1 - Adicionar item ao invent�rio.\n"
					+ "2 - Remover item do invent�rio.\n"
					+ "3 - Visualizar itens do invent�rio.\n"
					+ "9 - Sair do programa.");
			
			System.out.print("Digite o c�digo: "); cod = scannerCod.nextInt();
			
			switch(cod) {
				
				case 1 : {
					System.out.println("\n### CADASTRO DE NOVO ITEM ###\n");
					System.out.print("Digite o nome do item que voc� quer cadastrar: ");
					
					String item = scannerData.nextLine();
					
					inventory.add(item);
					
					System.out.println(String.format("\nItem %s adicionado com sucesso!\n", item));

					break;
				}
				
				case 2 : {
					System.out.println("\n### REMOVER ITEM DO INVENT�RIO ###\n");
					
					System.out.print("Digite o nome do item � ser removido: "); String item = scannerData.nextLine();
					
					boolean removed = inventory.remove(item);
					
					if(removed)
						System.out.println(String.format("\nItem %s removido com sucesso!\n", item));
					else
						System.out.println(String.format("\nItem %s n�o encontrado!\n", item));
					
					break;
				}
				
				case 3 : {
					System.out.println("\n### VISUALIZAR TODO O INVENT�RIO ###\n");
					
					if(inventory.size() > 0) {						
						for(String item : inventory) {
							System.out.println("- " + item);
						}
					} else {
						System.out.println("O invent�rio est� vazio!");
					}
					
					System.out.print("\n");
					
					break;
				}
				
				case 9 : {
					System.out.println("\nSaindo do programa!\n");
					break;
				}
				
				default : {
					System.out.println("\nC�digo n�o existe!\n");
					break;
				}
			}
			
		}
		
		scannerCod.close();
		scannerData.close();
		
	}

}
