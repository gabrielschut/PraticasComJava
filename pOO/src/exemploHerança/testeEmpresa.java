package exemploHerança;

public class testeEmpresa {
	public static void main(String[] args) {
		Motorista m1 = new Motorista("Gabriel", "Av. tico tico",123456);
		
	System.out.println("Nome: "+ m1.getNome());
	System.out.println("Endereço: "+ m1.getEndereco());
	System.out.println("Matricula: "+m1.getMatricula());
	}
	
		
	
}
