package sobrecarga;

public class testePraticaSobrecarga {

	public static void main(String[] args) {
		PraticaSobrecarga p1 = new PraticaSobrecarga();
		PraticaSobrecarga p2 = new PraticaSobrecarga();
		
		p1.adiciona(5, 25);
		p1.adiciona(5, 25, 125);
		p1.adiciona(33.33, 33.76);
		p1.adiciona("Gabriel", "Schütt");
		
		System.out.println("");
		
		p2.adiciona(3, 9);
		p2.adiciona(3, 9, 27);
		p2.adiciona(0.75, 12.25);
		p2.adiciona("Pessoa", "Aleatória");
	}
	
}
