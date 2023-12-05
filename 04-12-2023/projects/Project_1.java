package projects;

import java.util.*;

public class Project_1 {

	private static Scanner scanner = new Scanner(System.in);
	private static ArrayList<SeedData> data = new ArrayList<SeedData>();

	public static void main(String[] args) {
		// Programa para o usu�rio alimentar a entrada de dados, para descobrir quantos gr�os ele ir� usar, para uma determinada �rea.
		// Recebendo entradas da �rea total, e qual a dist�ncia que as sementes precisam ser plantadas entre elas.
		// Salvando tudo isso em uma lista, que possa ser consultada depois.
		
		int cod = -1;
		
		do {
			
			System.out.println("Códigos:\n"
					+ "1 - Verificar quantia de sementes necessárias.\n"
					+ "2 - Modificar semente salva.\n"
					+ "3 - Deletar uma semente salva.\n"
					+ "4 - Verificar lista salva.\n"
					+ "9 - Sair do programa.\n");
			System.out.print("Digite o código: "); cod = Integer.parseInt(scanner.nextLine());
			
			switch(cod) {
				case 1: {
					AddNewSeed();
					
					break;
				}
				
				case 2: {
					ModifySeed();
					
					break;
				}
				
				case 3 : {
					RemoveSeed();
					
					break;
				}
				
				case 4: {
					VerifySeedList();
					
					break;
				}
				
				case 9: {
					System.out.println("\n### Saindo do Programa ###");
					
					scanner.close();
					
					break;
				}
				
				default: {
					System.out.println("\nEsse código não existe!");
					
					break;
				}
				
			}
			
			
		} while(cod != 9);
		
		
		scanner.close();
	}
	
	public static void AddNewSeed() {
		System.out.println("\n### Verificação ###");
		// Verificar nome da semente.
		// Verificar dist�ncia de plantio.
		// Verificar �rea total.
		// Calcular total de sementes para ser plantada na �rea.

		String name;
		float distance;
		float area;
		int total;
		
		System.out.print("Digite o nome da semente que quer plantar: "); name = scanner.nextLine();
		
		for(SeedData seed: data) {
			if(seed.getName().equals(name)) {
				System.out.println("\nA semente " + name + " já está cadastrada!\n");
				return;
			}
		}
		
		System.out.print("Digite a distância entre o plantio das sementes (Em cm): "); distance = Float.parseFloat(scanner.nextLine());
		System.out.print("Digite a área total de plantio (em m²): "); area = Float.parseFloat(scanner.nextLine());
		
		total = (int)((area * 1000) / (distance));
		
		System.out.println(String.format("A quantia total de sementes de %s que podem ser plantadas é de %d, com um espaçamento de %scm entre elas!\n", name, total, distance));
		
		data.add(new SeedData(name, distance, area, total));
	}

	public static void ModifySeed() {
		System.out.println("\n### Modificar Semente Salva ###");
		
		String name;
		boolean modified = false;
		
		System.out.print("Digite o nome da semente a ser modificada: "); name = scanner.nextLine();
		
		for(SeedData seed: data) {
			if(seed.getName().equals(name)) {
				modified = true;
				
				String modName;
				float modDistance;
				float modArea;
				int modTotal;

				System.out.print("Digite o novo nome da semente: "); modName = scanner.nextLine();
				System.out.print("Digite a nova distância entre o plantio das sementes (Em cm): "); modDistance = Float.parseFloat(scanner.nextLine());
				System.out.print("Digite a nova área total de plantio (em m²): "); modArea = Float.parseFloat(scanner.nextLine());
				
				modTotal = (int)((modArea * 1000) / (modDistance));

				seed.setName(modName);
				seed.setDistance(modDistance);
				seed.setArea(modArea);
				seed.setAmount(modTotal);

				System.out.println(String.format("A quantia total de sementes de %s que podem ser plantadas é de %d, com um espaçamento de %scm entre elas!\n", modName, modTotal, modDistance));
				
				return;
			}
		}
		
		if(!modified) {
			System.out.println("Semente " + name + " não foi encontrada\n");
		}
	}

	public static void RemoveSeed() {
		System.out.println("\n### Remover Semente Salva ###");

		String name;
		boolean removed = false;
		
		System.out.print("Digite o nome da semente a ser remover: "); name = scanner.nextLine();

		for(SeedData seed: data) {
			if(seed.getName().equals(name)) {
				data.remove(seed);
				removed = true;
				
				System.out.println("A semente " + name + " foi removida com sucesso!\n");
				return;
			}
		}
		
		if(!removed ) {
			System.out.println("Semente " + name + " não foi encontrada\n");
		}
		
	}
	
	public static void VerifySeedList() {
		System.out.println("\n### Verificar Lista Salva ###");
		
		if(data.size() == 0) {
			System.out.println("A lista está vazia!\n");
			return;
		}
		
		for(SeedData seed: data) {
			System.out.println(String.format("- %s:\n"
					+ "Distância de plantio: %.2fcm\n"
					+ "Área total de plantio: %.2fm²\n"
					+ "Total de sementes utilizadas: %d\n", seed.getName(), seed.getDistance(), seed.getArea(), seed.getAmount()));
		}
	}

}
