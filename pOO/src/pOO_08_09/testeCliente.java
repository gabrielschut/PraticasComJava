package pOO_08_09;

import java.util.Scanner;

public class testeCliente {
	public static void main(String[] args) {
		double s;
		Scanner leia = new Scanner(System.in);
		
		
		Cliente c = new Cliente();
		System.out.print("Insira seu nome:" );
		c.nome = leia.nextLine();
		
		System.out.println("Insira seu e-mail ");
		c.email = leia.nextLine();
		
		System.out.println("Insira sua conta");
		c.numconta = (int)leia.nextInt();
		
		System.out.print("Quanto deseja depoistar? ");
		s=(double)leia.nextDouble();
		c.adicionasaldo(s);
		
		System.out.println("Confirmando operação");
		System.out.println(c.nome+" usuário da conta "+c.numconta);
		Cliente.exibesaldo();
		
		leia.close();
	}
}
