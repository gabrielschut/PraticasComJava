package praticaDeLab5;

public class Utilit�rios extends Ve�culo{

	private String cabine;

	public Utilit�rios(String marca, String modelo, double ptcmotor, double cpcdecarga, int ano, String cabine) {
		super(marca, modelo, ptcmotor, cpcdecarga, ano);
		setCabine(cabine);
	}

	@Override
	void imprime() {
		System.out.println("Os dados do Utilit�rio:");
		System.out.printf("Marca: " + super.getMarca());
		System.out.printf("  Modelo: "+super.getModelo());
		System.out.printf("\nAno: "+super.getAno());
		System.out.println("  Tipo de Cabine: "+ getCabine());
		System.out.println("Cavalos de pot�ncia: "+super.getPotenciaDoMotor());
		System.out.println("Capacidade de carga: "+super.getCapacidadedecarga()+"KG");
		
	}
	
	public String getCabine() {
		return cabine;
	}

	public void setCabine(String cabine) {
		this.cabine = cabine;
	}
	
}
