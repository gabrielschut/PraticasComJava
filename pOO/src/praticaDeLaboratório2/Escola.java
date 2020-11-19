package praticaDeLaboratório2;

import java.util.Scanner;

public class Escola {

	private String nome, cidade;
	private double ra;
	private int numDeCreditos;
	
	Scanner Entrada = new Scanner(System.in);
	
	
	
	public Escola(String nome, String cidade, double ra, int numDeCreditos) {
		this.nome = nome;
		this.cidade = cidade;
		this.ra = ra;
		this.numDeCreditos = numDeCreditos;
	}
	
	public double adicionaCredito(int a, int b) {
		System.out.println("Quantas matérias o aluno concluiu?");
		System.out.printf(": ");
		b = Entrada.nextInt();
		System.out.println("\n Quantos créditos valia cada matéria?");
		System.out.printf(": ");
		a = Entrada.nextInt();
		return this.numDeCreditos += a*b;
		
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCidade() {
		return this.cidade;
	}
	
	public double getRA() {
		return this.ra;
	}
	
	public int getCreditos() {
		return this.numDeCreditos;
	}
	
	
	public void imprime() {
		System.out.println("Nome "+getNome());
		System.out.println("Cidade: "+getCidade());
		System.out.println("RA:" + getRA());
		System.out.println("Creditos: "+getCreditos());
	}
}
