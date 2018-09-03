package testes;

public class Mensalidade {
public static void main(String[] args) {

	/*
	 * Crie um algoritmo para saber o tipo de mensalidade: 
“Muito caro”: acima de 1000 (inclusive)
“Barato”: entre 500 (inclusive) e 999 
“Muito barato”: abaixo de 500

	 */
	if(mensalidade >= 500 & mensalidade < 1000) {
		System.out.println("Muito caro!!");
	} else if (mensalidade >= 500 & mensalidade < 1000) {
		System.out.println("Barato!!!");
	} else {
		System.out.println("Muito barato!!!");
	}
}
}
