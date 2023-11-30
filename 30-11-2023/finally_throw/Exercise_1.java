package finally_throw;

import java.util.Scanner;

public class Exercise_1 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			
			String username, password, confirmPassword;
			
			System.out.print("Digite o seu nome de usuário: "); username = scanner.nextLine();
			
			if(username.contains((CharSequence)" ")) {
				throw new Exception("The username cannot contain a space or spaces!");
			}
			
			System.out.print("Digite a sua senha: "); password = scanner.nextLine();
			System.out.print("Confirme a sua senha: "); confirmPassword = scanner.nextLine();
			
			if(!confirmPassword.equals(password)) {
				throw new Exception("The password does not match!");
			}
			
			System.out.println("Cadastro realizado com sucesso!");
			
		} catch (Exception e) {

			System.out.println(e);
			
		}
	}

}
