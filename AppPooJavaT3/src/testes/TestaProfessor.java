package testes;

import java.util.Scanner;

public class TestaProfessor {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome;
		System.out.printf("Informe o seu nome: ");		
		nome = ler.nextLine();		/*pega só o que está na linha*/
		
		int matricula;
		System.out.printf("Informe a sua matrícula: ");		
		matricula = ler.nextInt();		/*lendo número inteiros*/
		
		float salario;
		System.out.printf("Informe o seu salário: ");		
		salario = ler.nextFloat();		
	
		boolean temporario;
		System.out.printf("Informe se é um professor temporário: ");		
		temporario = ler.nextBoolean(); /*true ou false como resposta*/
		/* Abaixo as condições do operador ternário*/
		
		int experiencia;
		System.out.printf("Quantos meses de experiência? ");
		experiencia = ler.nextInt();
		
		float bonus;
		System.out.printf("Digite o valor do bônus: ");
		bonus = ler.nextFloat();
		
		float gratificacao;
		System.out.printf("Digite o valor de gratificação: ");
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
		
//materia
		System.out.println("Nome: " + nome);
		System.out.println("Matrícula: " + matricula);
		System.out.println("Salário: " + salario);
		System.out.println("Temporário? " + (temporario ? "Sim" : "Não"));
		System.out.println("Experiência: " + experiencia);
		System.out.println("Bonus: " + bonus);
		System.out.println("Gratificação: " + gratificacao);
		System.out.println("Desconto: " + desconto);
		System.out.println("Disciplinas: " + disciplinas);
		System.out.printf("Salário bruto:  R$%f ", salarioBruto);
		System.out.printf("O Professor %s (%d) é %s, pois ganha R$%.2f",
				nome,
				matricula,
				(salarioBruto > 10000 ? "Rico " : "Pobre"),
				salarioBruto
				);
		
		
		
		
	}
}
