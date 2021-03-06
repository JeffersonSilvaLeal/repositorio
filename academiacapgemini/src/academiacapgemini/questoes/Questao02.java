package academiacapgemini.questoes;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {

		System.out.println("Digite sua senha: ");
		System.out.println("DICA");
		System.out.println("Deve Possui no mínimo 6 caracteres.\r\n" + "Deve Conter no mínimo 1 digito.\r\n"
				+ "Deve Conter no mínimo 1 letra em minúsculo.\r\n" + "Deve Conter no mínimo 1 letra em maiúsculo.\r\n"
				+ "Deve Conter no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+\r\n" + "");
		// Entrada de dados
		Scanner sc = new Scanner(System.in);
		String password = sc.next();

		// Senha teste 'ab-cA@6'
		Questao02.validaSenha(password);
	}


	// Validação de Senha
	public static void validaSenha(String senha) {

		if (senha != null) {

			if (senha.length() < 6) {
				System.out.println("A SENHA DEVE CONTER NO MINIMO 6 CARACTERS.");

			} else if (!Questao02.validaCaractersSenha(senha, 1)) {
				System.out.println("A SENHA DEVE CONTER NO MINIMO 1 CARACTER MAIUSCULO.");

			} else if (!Questao02.validaCaractersSenha(senha, 2)) {
				System.out.println("A SENHA DEVE CONTER NO MINIMO 1 CARACTER MINUSCULO.");

			} else if (!Questao02.validaCaractersSenha(senha, 3)) {
				System.out.println("A SENHA DEVE CONTER NO MINIMO 1 DIGITO.");

			} else if (!Questao02.validaCaractersSenha(senha, 4)) {
				System.out.println("A SENHA DEVE CONTER NO MINIMO 1 CARACTER ESPECIAL EX. '!@#$%^&*()-+'.");


			} else
				System.out.println("A SENHA ATENDEU AOS REQUISITOS.");
			}
		}
	
	// validar Caracteres
	public static boolean validaCaractersSenha(String senha, int opcao) {
		int qtdCaracterEncontrado = 0;

		// para todos os caracteres da string
		for (int i = 0; i < senha.length(); i++) {
			// pegar o caractere
			char c = senha.charAt(i);

			if (opcao == 1) {
				if (Character.isUpperCase(c)) {
					qtdCaracterEncontrado++;
				}

			} else if (opcao == 2) {
				if (Character.isLowerCase(c)) {
					qtdCaracterEncontrado++;
				}

			} else if (opcao == 3) {
				if ("-".contains(Character.toString(c))) {
					qtdCaracterEncontrado++;
				}

			} else if (opcao == 4) {
				if ("!@#$%^&*()-+".contains(Character.toString(c))) {
					qtdCaracterEncontrado++;
				}
				
			} 

		}
		
		if (qtdCaracterEncontrado > 0) {
			return true;
		} else {
			return false;
		}
	}

}
