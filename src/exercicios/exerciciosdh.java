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
	 * 1.Faça um programa que, dado o valor da conta de uma refeição realizada em um restaurante,
	 *  acrescente os 10% do garçom e exiba o valor total da conta.
	 */
	public static void exercicio1() {
		float valorConta = 50.0f;
		float dezPorCento = valorConta * 0.1f;
		float valorTotalConta = valorConta + dezPorCento;
		System.out.println("O valor total da conta é: R$ " + valorTotalConta);
	}
	/**
	 * 2. Faça um programa que calcule o resto da divisão inteira entre dois números dados. Exemplo: se dividirmos 25 por 4, temos resto=1
	 */
	public static void exercicio2() {
		int dividendo = 25;
		int divisor = 4;
		int restoDaDivisao = dividendo % divisor;
		System.out.println("O resto da divisão é: " + restoDaDivisao);
		
	}
	/**
	 * 3. Construa um programa que, dado o valor de uma mercadoria, sejam aplicados 15% de desconto em uma venda à vista e exiba o valor a ser pago.
	 */	
	public static void exercicio3() {
		float valorDaMercadoria = 50f;
		float descontoaVista = valorDaMercadoria * 0.15f;
		float valorTotalConta = valorDaMercadoria - descontoaVista;
		System.out.println("O valor da mercadoria com desconto é: " + valorTotalConta);
	
	}
	/**
	 * 4. Escreva um programa que, dados o valor da mercadoria e o valor pago, calcule e exiba o troco a ser devolvido.
	 */
	public static void exercicio4() {
		float valorProduto = 50f;
		float valorPago = 70f;
		System.out.println("O troco é: R$" + (valorPago - valorProduto));
		
	}
	/**
	 * 5. Escreva um programa que, dados três números, informe o maior e o menor.
	 */
	public static void exercicio5() {
		int numeroA = 10;
		int numeroB = 8;
		int numeroC = 12;
		if (numeroA > numeroB && numeroA > numeroC) {
			System.out.println("O maior número é: " + numeroA);
		} else if ( numeroB > numeroA && numeroB > numeroC) {
			System.out.println("O maior número é: " + numeroB);
		} else { 
			System.out.println("O maior número é: " + numeroC);
		}
		
		if (numeroA < numeroB && numeroA < numeroC) {
			System.out.println("O menor número é: " + numeroA);
		} else if ( numeroB < numeroA && numeroB < numeroC) {
			System.out.println("O menor número é: " + numeroB);
		} else { 
			System.out.println("O menor número é: " + numeroC);
		}
	}
	/**
	 * 6. Faça um Programa que leia as seguintes informações de um funcionário: matricula, nome, idade, sexo, endereço, bairro e estado civil. 
	 * Escreva o nome do funcionário.
	 */
	public static void exercicio6() {
		int matricula = 20220323;
		String funcionario = "José";
		int idade = 30;
		char sexo = 'M';
		String endereco = "Rua da Glória, 66";
		String bairro = "Centro";
		String estadoCivil = "casado";
		System.out.println(funcionario);
		System.out.printf("Funcionário com matrícula %d , chamado %s, possui %d anos de idade, sexo %c, mora na %s, %s, estado civil %s.",
				matricula, funcionario, idade, sexo, endereco, bairro, estadoCivil);
	}
	/**
	 * 7. Faça um programa que leia dois números inteiros e escreva a soma entre eles.
	 */	
	public static void exercicio7() {
		int numeroA = 10;
		int numeroB = 20;
		System.out.println("A soma dos números é: " + (numeroA + numeroB));
		
	}
	/**
	 * 8. Faça um programa para ler o nome e as três notas de um aluno. Calcular a média e escrever o nome e a média. Variáveis utilizadas:
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
	 * 9. Faça um programa para ler o nome , departamento e o salário de um funcionário.
	 * Calcular e informar um abono de 10% ( dez por cento) sobre o salário e, ainda, o novo salário acrescido do abono.
	 */
	public static void exercicio9() {
		//String nomeFuncionario = "José";
		//String departamento = "Contabilidade";
		double salario = 1.000;
		double abonoSalario = salario * 0.1;
		System.out.println("Funcionário tem direito a um abono de R$ " + abonoSalario);
		System.out.printf("O novo salário é R$" + (salario + abonoSalario));
		
				// VERIFICAR CORREÇÃO DESSE
				
	
	}
}









