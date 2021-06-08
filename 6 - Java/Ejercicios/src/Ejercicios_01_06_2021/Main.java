package Ejercicios_01_06_2021;

public class Main {

	public static void main(String[] args) {

		int numero = 5;
		Contador test = new Contador(numero);
		int numeroIncrementado = test.incrementar();
		System.out.println("Valor :  " + numeroIncrementado);
	}
}
