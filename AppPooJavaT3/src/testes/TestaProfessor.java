package testes;

import java.util.Scanner;

public class TestaProfessor {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome;
		System.out.printf("Informe o seu nome: ");		
		nome = ler.nextLine();		/*pega s� o que est� na linha*/
		
		int matricula;
		System.out.printf("Informe a sua matr�cula: ");		
		matricula = ler.nextInt();		/*lendo n�mero inteiros*/
		
		float salario;
		System.out.printf("Informe o seu sal�rio: ");		
		salario = ler.nextFloat();		
	
		boolean temporario;
		System.out.printf("Informe se � um professor tempor�rio: ");		
		temporario = ler.nextBoolean(); /*true ou false como resposta*/
		/* Abaixo as condi��es do operador tern�rio*/
		
		int experiencia;
		System.out.printf("Quantos meses de experi�ncia? ");
		experiencia = ler.nextInt();
		
		float bonus;
		System.out.printf("Digite o valor do b�nus: ");
		bonus = ler.nextFloat();
		
		float gratificacao;
		System.out.printf("Digite o valor de gratifica��o: ");
		gratificacao = ler.nextFloat();
		
		float desconto;
		System.out.printf("Digite o valor de desconto: ");
		desconto = ler.nextFloat();
		
		int disciplinas;
		System.out.printf("Digite a quantidade de disciplinas: ");
		disciplinas = ler.nextInt();
	
		
		float salarioBruto = 0;
		final float VL_EXPERIENCIA = 50;
		final float VL_DISCIPLINA = 100;
		salarioBruto = (salario + bonus + gratificacao - desconto) + experiencia * 50 + disciplinas * 100;
		

		System.out.println("Nome: " + nome);
		System.out.println("Matr�cula: " + matricula);
		System.out.println("Sal�rio: " + salario);
		System.out.println("Tempor�rio? " + (temporario ? "Sim" : "N�o"));
		System.out.println("Experi�ncia: " + experiencia);
		System.out.println("Bonus: " + bonus);
		System.out.println("Gratifica��o: " + gratificacao);
		System.out.println("Desconto: " + desconto);
		System.out.println("Disciplinas: " + disciplinas);
		System.out.printf("Sal�rio bruto:  R$%f ", salarioBruto);
		System.out.printf("O Professor %s (%d) � %s, pois ganha R$%.2f",
				nome,
				matricula,
				(salarioBruto > 10000 ? "Rico " : "Pobre"),
				salarioBruto
				);
		
		
		
		
	}
}
