package praticaDeLab5;

public class TesteVe�culo {

	public static void main(String[] args) {
		
		Ve�culo[] carrinho = new Ve�culo[] {
		new Utilit�rios("Ford", "Ranger", 160, 1298, 2021,"Dupla"),
		new Utilit�rios("Toyto", "Hilux", 160, 1035, 2020, "Dupla"),
		new Passageiro("wolksvagem", "kombi", 80, 1100, 2012, 10),
		new Passageiro("Fiat","Doblo", 130, 620, 2019, 7),
			
		};
		
		for(int i=0; i<4;i++) {
			carrinho[i].imprime();
			System.out.println();
		}
	}
	
}
