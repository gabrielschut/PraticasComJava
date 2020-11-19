package task11_09;

public class testeFuncionario {
	
	public static void main(String[] args) {
		
		funcionario f1 = new funcionario("Claudio", 1250.50, 19);
		
		System.out.println("Nome: "+f1.getNome());
		System.out.println("Idade: "+f1.getIdade()+" anos.");
		System.out.println("Remuneração R$"+f1.getSalario());
		
		System.out.println("");
		funcionario f2 = new funcionario("Maria", 2100.99, 21);
		
		System.out.println("Nome: "+f2.getNome());
		System.out.println("Idade: "+f2.getIdade()+" anos.");
		System.out.println("Remuneração R$"+f2.getSalario());
		
		
	}
	
	
	
	
	
}
