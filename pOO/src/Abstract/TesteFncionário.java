package Abstract;

public class TesteFncionário {

	public static void main(String[] args) {
		
		Vendedor v1 = new Vendedor();
		Secretaria s1 = new Secretaria();
		
		v1.setNome("Gabriel");
		v1.setSalario(2000.0);
		v1.setRegiao("Sudeste");
		v1.setComissao(200.0);
		
		s1.setNome("Sandra");
		s1.setSalario(5000.00);
		s1.setIdioma("Pt-br");
		s1.setDepartamento("TI");
		
		System.out.println(v1.getNome());
		System.out.println(v1.getRegiao());
		System.out.println(v1.getSalario());
		System.out.println(v1.getComissao());
		v1.Reajuste(v1.getSalario());
		System.out.println(v1.getSalario());
		
		System.out.println("\n"+"\n");
		
		
		System.out.println(s1.getNome());
		System.out.println(s1.getIdioma());
		System.out.println(s1.getDepartamento());
		System.out.println(s1.getSalario());
		s1.Reajuste(s1.getSalario());
		System.out.println(s1.getSalario());
	}
	
}
