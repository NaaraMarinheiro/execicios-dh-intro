package entradadedados;

import java.util.Scanner;

public class TesteEntradaDeDados {

	public static void main(String[] args) {
		Scanner entradaDeDados = new Scanner(System.in);
			
			System.out.println("Informe um nome completo");
			String nome = entradaDeDados.nextLine();
			
			System.out.println("Nome informado é: "+nome);
			
			System.out.println("Informe sua idade: ");
			int idade = entradaDeDados.nextInt();
			System.out.println("Idade informada: "+idade);
			
			System.out.println("Informe o sexo");
			String sexo = entradaDeDados.next();
			System.out.println("Sexo informado: "+sexo);

	}
}

/*public class Constantes {
	
	public static void main(String[] args) {
		final double PI ; // não pode ser alterado em tempo de execução
		
		PI = 7.888899;

	}

}
*/

// Sobre o buffer do NextLine -> https://www.clubedohardware.com.br/forums/topic/1417385-limpar-o-buffer-de-teclado-na-ling-java/
// https://www.delftstack.com/pt/howto/java/java-clear-scanner/#:~:text=explicam%20estes%20m%C3%A9todos.-,Java%20Clear%20Scanner%20utilizando%20o%20nextLine(),outras%20opera%C3%A7%C3%B5es%20na%20nova%20linha.
// Esse erro dá quando você tem uma leitura de valor  numérico e depois passa a ler uma String
// https://www.devmedia.com.br/como-funciona-a-classe-scanner-do-java/28448





