package praticaDeLab5;

public abstract class Veículo {

	protected String marca, modelo;
	protected double potenciaDoMotor, capacidadedecarga;
	protected int ano;
	
	abstract void imprime();
	
	public Veículo(String marca, String modelo, double ptcmotor, double cpcdecarga, int ano) {
		setMarca(marca);
		setModelo(modelo);
		setAno(ano);
		setPotenciaDoMotor(ptcmotor);
		setCapacidadedecarga(cpcdecarga);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPotenciaDoMotor() {
		return potenciaDoMotor;
	}

	public void setPotenciaDoMotor(double potenciaDoMotor) {
		this.potenciaDoMotor = potenciaDoMotor;
	}

	public double getCapacidadedecarga() {
		return capacidadedecarga;
	}

	public void setCapacidadedecarga(double capacidadedecarga) {
		this.capacidadedecarga = capacidadedecarga;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
