package testes;

import java.util.Scanner;

public class TesteAluno {
	
	public static void main(String[] args) {
		Scanner cadastro = new Scanner(System.in);
				
//		int ANO_ATUAL = 2018;// Constante sempre em maiúscula
		
		String nome;
		System.out.printf("Informe o seu nome: ");		
		nome = cadastro.nextLine();		/*pega só o que está na linha*/
		
		int matricula;
		System.out.printf("Informe a sua matrícula: ");		
		matricula = cadastro.nextInt();		/*lendo número inteiros*/
		
		float salario;
		System.out.printf("Informe o seu salário: ");		
		salario = cadastro.nextFloat();		
	
		boolean temporario;
		System.out.printf("Informe se é um professor temporário: ");		
		temporario = cadastro.nextBoolean();
		
		System.out.println("Nome: " + nome);
		System.out.println("Matrícula: " + matricula);
		System.out.println("Salário: " + salario);
		System.out.println("Temporário? " + (temporario ? "sim" : "ão"));
/*	
 Na Segunda23 o código abaixo foi o exercicio... na aula seguinte foi pedido que tornasse o código abaixo em scanner
 * 	String nomeJ = "Joao";
		int idadeJ = 39;
		float mensalidadeJ = 500;
		boolean masculinoJ = false;
		
		String nomeM = "Maria";
		int idadeM = 35;
		float mensalidadeM = 500;
		boolean masculinoM = false;
*/		
		
/*		if (masculinoJ) {
/* ! antes da variável significa que a variável está invertida... not
 Toda varável precisa de um valor a ser atribuído no IF. Se condicional, FALSE/ TRUE no boolean. Se Idade seria um valor
 == significa recebe algum valor ou informação*/
			
/*			System.out.println("O aluno "+nome+" tem "+idade+" anos e paga R$"+mensalidade);
		}
			else
		System.out.println("O aluna "+nome+" tem "+idade+" anos e paga R$"+mensalidade);
 ++ é usado para concatenar, juntar e fazer com que sejam impressas as informações
 */
// OUTRA FORMA DE USAR O IF EM JAVA-  somente para pequenas informações
			
/*System.out.printf("A aluna %s tem %d anos e paga R$%f",
					nome,
					idade,
					mensalidade
					);
*/
/* OUTRA FORMA DE USAR OURA ALTERNATIVA AO IF- somente em pequenas informações*/
			
/*		System.out.printf("%s %s tem %d anos e paga R$%f",
					(masculinoJ ? "O aluno " : "A aluna"),
/* Essa frase acima se lê: Se masculino for verdadeiro (?) escreva "O aluno" senão (:) escreva "A aluna"
		é uma forma reduzida de usar condicionais em JAVA */
				/*	nomeJ,
					idadeJ,
					mensalidadeJ
					);*/
/* inserindo nascimento */
/*		System.out.printf("Ano de nascimento: " + (ANO_ATUAL - idadeJ));*/
		
//    /n pula linha
				
/*				
		%s vem do C significa string
		%d significa variáveis inteiras
		%f significa float
	A montagem é igual ao exemplo acima - System out.printf
*/
		/*
		 * Crie um algoritmo para saber o tipo de mensalidade: 
	“Muito caro”: acima de 1000 (inclusive)
	“Barato”: entre 500 (inclusive) e 999 
	“Muito barato”: abaixo de 500

		 */
/*		if(mensalidadeJ >= 500 & mensalidadeJ < 1000) {
			System.out.println("Muito caro!!");
		} else if (mensalidadeJ >= 500 & mensalidadeJ < 1000) {
			System.out.println("Barato!!!");
		} else {
			System.out.println("Muito barato!!!");
		}*/
/*
Exiba na tela o nome do aluno mais velho*/
/*		System.out.printf("%s é o aluno mais velho",
				(idadeM >= idadeJ ? nomeM : nomeJ)
				);*/

/*Exiba na tela o nome do aluno que paga a maior mensalidade*/
/*		System.out.printf("%s é o aluno com maior mensalidade",
				(mensalidadeM >= mensalidadeJ ? mensalidadeM : mensalidadeJ)
				);*/
/*

Exiba na tela a quantidade de alunos agrupados por sexo
*/
/*		System.out.printf("%s ",
				(masculinoJ ? "O aluno " : "A aluna"),*/		
	//}
	}
					
}