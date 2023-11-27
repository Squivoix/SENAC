package if_else;

import java.util.*;

public class Exercise_3 {

	public static void main(String[] args) {
		String[] numeros = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		Scanner scanTxt1 = new Scanner(System.in);
		
		System.out.println("Digite uma palavra ou texto que contenha números: ");
		
		String txt1 = scanTxt1.nextLine();
		String caracterAtual;
		
		List<String> numerosEncontrados = new ArrayList<String>();
		
		boolean achouNumero = false;
		
		for(int i = 0; i < txt1.length(); i++) {
			System.out.println("i: " + i);
			System.out.println("txt1.substring(i, i): " + txt1.substring(i, i+1));
			for(int n = 0; n < numeros.length; n++) {
				System.out.println("n: " + n);
				System.out.println("numeros[n]: " + numeros[n]);
				caracterAtual = txt1.substring(i, i+1);
				if (caracterAtual.equals(numeros[n])) {
                    numerosEncontrados.add(numeros[n]);
                    achouNumero = true;
                }
            }
			
	        if (achouNumero == true) {
	            System.out.println("Foram encontrados os números digitados a seguir: " + numerosEncontrados);
	        }
	        scanTxt1.close();
		}
	}

}
