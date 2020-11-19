package praticaDeLab5;

public class Passageiro extends Veículo{

	private int quantidadepassageiros;
	
	public Passageiro(String marca, String modelo, double ptcmotor, double cpcdecarga, int ano, int qtdpassageiros) {
		super(marca, modelo, ptcmotor, cpcdecarga, ano);
		setQuantidadepassageiros(qtdpassageiros);
	}

	@Override
	void imprime() {
		System.out.println("Os dados do modelo:");
		System.out.printf("Marca: " + super.getMarca());
		System.out.printf("  Modelo: "+super.getModelo());
		System.out.printf("\nAno: "+super.getAno());
		System.out.println("  Número de passageiros: "+ getQuantidadepassageiros());
		System.out.println("Cavalos de potência: "+super.getPotenciaDoMotor());
		System.out.println("Capacidade de carga: "+super.getCapacidadedecarga());
		
	}

	public int getQuantidadepassageiros() {
		return quantidadepassageiros;
	}

	public void setQuantidadepassageiros(int quantidadepassageiros) {
		this.quantidadepassageiros = quantidadepassageiros;
	}

	
}
