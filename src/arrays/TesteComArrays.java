package arrays;

public class TesteComArrays {

	public static void main(String[] args) {
		
		// Array unidimensional ou vetor.
		int [] pets; // nota��o mais usada
		int[] cidades; // outro tipo de nota��o
		
		int[] idades = {1,5,7,80,45}; 
		// Inicializado, pq j� tem valores. Outra forma de declarar os mesmo dados �:
		int[] idades2 = new int[5]; 
		// N�o inicializado explicitamente, n�o possui dados escritos pelo usu�rio. O "5" representa o n�mero de elementos.
		// N�o � poss�vel mudar o 5, isto �, a quantidade de elementos. 
		// A boa pr�tica � sempre inicializar com valor zero, conforme abaixo:
		int valor2 = 0;
		String[] nomes = {"Julia", "Marcia", "Ana"}; // Quando sabe os nomes.
		String[] nomes2 = new String[3]; // Quando n�o sabe os nomes, mas sabe a quantidade.
		
		// C�pia de classes (formul�rios) para cria��o de inst�ncias.
		// new -> � uma palavra reservada para criar novas inst�ncias.
		// A contagem de elementos do array inicia com zero.
		//syso - Atalho do "system.out.println();" ---> syso + Ctrl + Space
		
		System.out.println(idades[3]); // Para imprimir elemento no indice n� 3 do  (casa 3) 
		// Bolinha verde do play � o "Run" ===> Run as ===> java.aplication
		System.out.println(idades[2]); // Ao tentar imprimir uma posi��o que n�o existe no array --> Exce��o: 
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5 at arrays.TesteComArrays.main(TesteComArrays.java:28)
		// Essas exce��es fazem com que o programa pare e n�o execute mais nada. 
		
		System.out.println("Idade:" +idades[2] + " - Nome: "+nomes[2]);
		
		// Para imprimir v�rios elementos do array � necess�rio usar uma estrutura de repeti��o. A mais usada � o for. 
	
		// Outra nota��o do FOR : "for(int i=0;i<5;i++) {... }"
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
		// ARRAY MULTIDIMENSIONAL - matriz - forma de leitura - Na leitura de arrays todos os indices come�am com zero. 
		// in [linha] [coluna] - o primeiro � a linha, e o segundo � a acoluna.
		
        // Para identar o c�digo = ctrl + shift + f 
	 	//multidimensionais => matriz
		
	 			int[][] numeros = new int[3][3];
	 			int valor = 1;

	 			for (int linha = 0; linha < 3; linha++) {
	 				for (int coluna = 0; coluna < 3; coluna++) {
	 					numeros[linha][coluna] = valor++;
	 				}
	 			}
	 			
	 			
	 			for (int linha = 0; linha < 3; linha++) {
	 				for (int coluna = 0; coluna < 3; coluna++) {
	 				System.out.print(numeros[linha][coluna] + "\t");
	 				}
	 				System.out.println();
	 			}

	 			
	 			System.out.println(numeros[0][2]);


		
		
		
		
		
	}
}
