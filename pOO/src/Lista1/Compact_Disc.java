package Lista1;

public class Compact_Disc extends Produto{

	
	private String nomeArtista;
	private String nomeAlbum;
	private String gravadora;
	
	public Compact_Disc(String codigo, double preco, String descricao,String nomeAlbum, String nomeArtista, String gravadora) {
		super(codigo, preco, descricao);
		this.nomeAlbum = nomeAlbum;
		this.nomeArtista = nomeArtista;
		this.gravadora= gravadora;
	}

	public String getNomeArtista() {
		return nomeArtista;
	}

	public String getNomeAlbum() {
		return nomeAlbum;
	}

	public String getGravadora() {
		return gravadora;
	}
	
	@Override
	public void imprime() {
		super.imprime();
		System.out.println("Album: "+getNomeAlbum());
		System.out.println("Artista: "+getNomeArtista());
		System.out.println("Gravadora: "+getGravadora());
	}
}
