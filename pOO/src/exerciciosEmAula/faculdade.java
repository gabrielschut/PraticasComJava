package exerciciosEmAula;

import java.util.Scanner;

public class faculdade {
	Scanner leia = new Scanner(System.in);
	private String nome, curso;
	private double nota, mensalida;
	private int ra;
	
	public void setNome(String nome) {
		System.out.print("Insira o nome do aluno(a):");
		nome = leia.nextLine();
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setCurso(String curso) {
		System.out.print("Insira o curso: ");
		curso = leia.nextLine();
		this.curso = curso;
	}
	public String getCurso() {
		return this.curso;
	}
	
	public void setNota(double nota) {
		System.out.print("Qual foi a nota: ");
		nota = leia.nextDouble();
		this.nota = nota;
	}
	public double getNota() {
		return this.nota;
	}
	
	public void setMensalidade(double mensalidade) {
		System.out.print("Insira o valor da mensalidade: ");
		mensalidade = leia.nextDouble();
		this.mensalida = mensalidade;
	}
	public double getMensalidade() {
		return this.mensalida;
	}
	
	public void setRA(int ra) {
		System.out.print("Digite o RA do(a) discente: ");
		ra = leia.nextInt();
		this.ra=ra;
	}
	public int getRA() {
		return this.ra;
	}
	
	public double descontomensa() {
		if(nota >= 9) 
		{
		this.mensalida/=2;
		}
		return mensalida;
	}
	
	
	public void imprimeDados() {
		System.out.println("Aluno: "+ getNome());
		System.out.println("RA: "+ getRA());
		System.out.println("Curso: "+ getCurso());
		System.out.println("Nota do vestibular: "+getNota());
		System.out.println("Valor da mensalidade "+ getMensalidade());
		
	}
	
}
