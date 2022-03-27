package arrays;

public class TesteComArrays {

	public static void main(String[] args) {
		
		// Array unidimensional ou vetor.
		int [] pets; // notação mais usada
		int[] cidades; // outro tipo de notação
		
		int[] idades = {1,5,7,80,45}; 
		// Inicializado, pq já tem valores. Outra forma de declarar os mesmo dados é:
		int[] idades2 = new int[5]; 
		// Não inicializado explicitamente, não possui dados escritos pelo usuário. O "5" representa o número de elementos.
		// Não é possível mudar o 5, isto é, a quantidade de elementos. 
		// A boa prática é sempre inicializar com valor zero, conforme abaixo:
		int valor2 = 0;
		String[] nomes = {"Julia", "Marcia", "Ana"}; // Quando sabe os nomes.
		String[] nomes2 = new String[3]; // Quando não sabe os nomes, mas sabe a quantidade.
		
		// Cópia de classes (formulários) para criação de instâncias.
		// new -> é uma palavra reservada para criar novas instâncias.
		// A contagem de elementos do array inicia com zero.
		//syso - Atalho do "system.out.println();" ---> syso + Ctrl + Space
		
		System.out.println(idades[3]); // Para imprimir elemento no indice nº 3 do  (casa 3) 
		// Bolinha verde do play é o "Run" ===> Run as ===> java.aplication
		System.out.println(idades[2]); // Ao tentar imprimir uma posição que não existe no array --> Exceção: 
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5 at arrays.TesteComArrays.main(TesteComArrays.java:28)
		// Essas exceções fazem com que o programa pare e não execute mais nada. 
		
		System.out.println("Idade:" +idades[2] + " - Nome: "+nomes[2]);
		
		// Para imprimir vários elementos do array é necessário usar uma estrutura de repetição. A mais usada é o for. 
	
		// Outra notação do FOR : "for(int i=0;i<5;i++) {... }"
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
		// ARRAY MULTIDIMENSIONAL - matriz - forma de leitura - Na leitura de arrays todos os indices começam com zero. 
		// in [linha] [coluna] - o primeiro é a linha, e o segundo é a acoluna.
		
        // Para identar o código = ctrl + shift + f 
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
