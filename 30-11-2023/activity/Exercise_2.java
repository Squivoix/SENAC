package activity;

public class Exercise_2 {

	public static void main(String[] args) {
		String[] nomes = {"Victor", "Henrique", "Júlio", "Luiz", "Rodrigo"};
		String[] amigosSecretos = {"", "", "", "", ""};

		for(String nome : nomes) {

			do {
				
				int index = (int)Math.round(Math.random() * 4);
				
				if(amigosSecretos[index].equals("") && !nomes[index].equals(nome)) {
					amigosSecretos[index] = nome;
					break;
				}
				
			} while(true);
			
		}

		for(int i = 0; i < nomes.length; i++) {
			System.out.println(String.format("'%s' foi sorteado como amigo secreto para '%s'", amigosSecretos[i], nomes[i]));
		}
	}

}
