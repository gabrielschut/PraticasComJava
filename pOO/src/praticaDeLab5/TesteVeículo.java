package praticaDeLab5;

public class TesteVeículo {

	public static void main(String[] args) {
		
		Veículo[] carrinho = new Veículo[] {
		new Utilitários("Ford", "Ranger", 160, 1298, 2021,"Dupla"),
		new Utilitários("Toyto", "Hilux", 160, 1035, 2020, "Dupla"),
		new Passageiro("wolksvagem", "kombi", 80, 1100, 2012, 10),
		new Passageiro("Fiat","Doblo", 130, 620, 2019, 7),
			
		};
		
		for(int i=0; i<4;i++) {
			carrinho[i].imprime();
			System.out.println();
		}
	}
	
}
