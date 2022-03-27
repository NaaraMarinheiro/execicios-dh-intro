package entradadedados;

public class Casting {

	public static void main(String[] args) {
		double valor = 7.78965; //64 bits
		float maisOutroValor = (float) valor; // 32 bits - Casting - transforma de flutuante para inteiro também.
		int outroValor = (int) valor; // casting - transforma o tipo numérico para um tamanho diferente. 

		float valorX = 4.7895f;
		double valorY = valorX; // São npuemro do mesmo tipo, no caso transforma um menor em um maior. 
		
		System.out.println(valor + maisOutroValor + outroValor + valorX + valorY);
	}
	

}
