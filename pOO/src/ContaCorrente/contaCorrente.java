package ContaCorrente;

import java.util.Scanner;

public class contaCorrente {
	private String nome, email, telefone;
	private int cpf;
	private double saldo;
	Scanner Entrada = new Scanner(System.in);
	public contaCorrente(String nome, int cpf, String telefone, String email, double saldo) {
		this.nome = nome;    this.email = email;
		this.cpf = cpf;      this.saldo = saldo;
		this.telefone = telefone;
	}
	
	public double Debito(double debito) {
	System.out.println("Quanto sera debitado?");
	System.out.print("R$");
	debito = Entrada.nextDouble();
	return this.saldo-=debito;
	}
	
	public double Credito(double acrescimo) {
		System.out.println("Quanto sera depositado?");
		System.out.printf("R$");
		acrescimo= Entrada.nextDouble();
		return this.saldo+=acrescimo;
	}
	
	public String getNome(){
		return this.nome;
	}

	public String getEmail() {
		return this.email;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public int getCPF() {
		return this.cpf;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	
	
	
}