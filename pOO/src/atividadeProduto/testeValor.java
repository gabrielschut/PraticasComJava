package atividadeProduto;

public class testeValor {

	public static void main(String[] args) {
		
		double numero = 0;
		
		classValor n1 = new classValor();
		classValor n2 = new classValor();
		classValor n3 = new classValor();
		
		n1.setNumero(numero);
		n2.setNumero(numero);
		n3.setNumero(numero);
		
		System.out.println("O dobro do valor do primeiro "
				+ "numero digitado � :"+ n1.Dobra());
		System.out.println("O dobro do valor do segundo "
				+"n�mero digitado � :"+n2.Dobra());
		System.out.println("O dobro do valor do terceiro"
				+"numero digitado � :"+n3.Dobra());
	}
	
}
