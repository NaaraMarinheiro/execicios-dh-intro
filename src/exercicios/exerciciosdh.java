package exercicios;

public class exerciciosdh {

	public static void main(String[] args) {
		
		//exercicio1();
		//exercicio2();
		//exercicio3();
		//exercicio4();
		//exercicio5();
		//exercicio6();
		//exercicio7();
		//exercicio8();
		exercicio9();

	}

	/** 
	 * 1.Fa�a um programa que, dado o valor da conta de uma refei��o realizada em um restaurante,
	 *  acrescente os 10% do gar�om e exiba o valor total da conta.
	 */
	public static void exercicio1() {
		float valorConta = 50.0f;
		float dezPorCento = valorConta * 0.1f;
		float valorTotalConta = valorConta + dezPorCento;
		System.out.println("O valor total da conta �: R$ " + valorTotalConta);
	}
	/**
	 * 2. Fa�a um programa que calcule o resto da divis�o inteira entre dois n�meros dados. Exemplo: se dividirmos 25 por 4, temos resto=1
	 */
	public static void exercicio2() {
		int dividendo = 25;
		int divisor = 4;
		int restoDaDivisao = dividendo % divisor;
		System.out.println("O resto da divis�o �: " + restoDaDivisao);
		
	}
	/**
	 * 3. Construa um programa que, dado o valor de uma mercadoria, sejam aplicados 15% de desconto em uma venda � vista e exiba o valor a ser pago.
	 */	
	public static void exercicio3() {
		float valorDaMercadoria = 50f;
		float descontoaVista = valorDaMercadoria * 0.15f;
		float valorTotalConta = valorDaMercadoria - descontoaVista;
		System.out.println("O valor da mercadoria com desconto �: " + valorTotalConta);
	
	}
	/**
	 * 4. Escreva um programa que, dados o valor da mercadoria e o valor pago, calcule e exiba o troco a ser devolvido.
	 */
	public static void exercicio4() {
		float valorProduto = 50f;
		float valorPago = 70f;
		System.out.println("O troco �: R$" + (valorPago - valorProduto));
		
	}
	/**
	 * 5. Escreva um programa que, dados tr�s n�meros, informe o maior e o menor.
	 */
	public static void exercicio5() {
		int numeroA = 10;
		int numeroB = 8;
		int numeroC = 12;
		if (numeroA > numeroB && numeroA > numeroC) {
			System.out.println("O maior n�mero �: " + numeroA);
		} else if ( numeroB > numeroA && numeroB > numeroC) {
			System.out.println("O maior n�mero �: " + numeroB);
		} else { 
			System.out.println("O maior n�mero �: " + numeroC);
		}
		
		if (numeroA < numeroB && numeroA < numeroC) {
			System.out.println("O menor n�mero �: " + numeroA);
		} else if ( numeroB < numeroA && numeroB < numeroC) {
			System.out.println("O menor n�mero �: " + numeroB);
		} else { 
			System.out.println("O menor n�mero �: " + numeroC);
		}
	}
	/**
	 * 6. Fa�a um Programa que leia as seguintes informa��es de um funcion�rio: matricula, nome, idade, sexo, endere�o, bairro e estado civil. 
	 * Escreva o nome do funcion�rio.
	 */
	public static void exercicio6() {
		int matricula = 20220323;
		String funcionario = "Jos�";
		int idade = 30;
		char sexo = 'M';
		String endereco = "Rua da Gl�ria, 66";
		String bairro = "Centro";
		String estadoCivil = "casado";
		System.out.println(funcionario);
		System.out.printf("Funcion�rio com matr�cula %d , chamado %s, possui %d anos de idade, sexo %c, mora na %s, %s, estado civil %s.",
				matricula, funcionario, idade, sexo, endereco, bairro, estadoCivil);
	}
	/**
	 * 7. Fa�a um programa que leia dois n�meros inteiros e escreva a soma entre eles.
	 */	
	public static void exercicio7() {
		int numeroA = 10;
		int numeroB = 20;
		System.out.println("A soma dos n�meros �: " + (numeroA + numeroB));
		
	}
	/**
	 * 8. Fa�a um programa para ler o nome e as tr�s notas de um aluno. Calcular a m�dia e escrever o nome e a m�dia. Vari�veis utilizadas:
	 *  NOME, N1, N2, N3, MEDI A.
	 */
	public static void exercicio8() {
		String nome = "Marcia";
		float n1 = 7.0f;
		float n2 = 6.5f;
		float n3 = 9.0f;
		float media = (n1 + n2+ n3) / 3f;
		System.out.println(nome + " " + media);
	}
	/**
	 * 9. Fa�a um programa para ler o nome , departamento e o sal�rio de um funcion�rio.
	 * Calcular e informar um abono de 10% ( dez por cento) sobre o sal�rio e, ainda, o novo sal�rio acrescido do abono.
	 */
	public static void exercicio9() {
		//String nomeFuncionario = "Jos�";
		//String departamento = "Contabilidade";
		double salario = 1.000;
		double abonoSalario = salario * 0.1;
		System.out.println("Funcion�rio tem direito a um abono de R$ " + abonoSalario);
		System.out.printf("O novo sal�rio � R$" + (salario + abonoSalario));
		
				// VERIFICAR CORRE��O DESSE
				
	
	}
}









