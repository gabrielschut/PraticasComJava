package exerciciosEmAula;

public class testeFaculdade {

	
	public static void main(String[] args) {	
		String nome ="aaa", curso="aaa";
		double mensalidade = 0, nota = 0;
		int ra = 0;
		
		faculdade a1 =new faculdade();
		
		a1.setNome(nome);
		a1.setCurso(curso);
		a1.setRA(ra);
		a1.setMensalidade(mensalidade);
		a1.setNota(nota);		
		a1.descontomensa();
		
		a1.imprimeDados();
		
	}
	
}
