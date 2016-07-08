
public class Disciplina {
	private String nome;
	private double media;
	private int creditos;
	
	public Disciplina(String nome, double media, int peso){
		this.nome = nome;
		this.media = media;
		this.creditos = peso;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
		
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	
	public double getMediaPesada(){
		return this.media * this.creditos;
	}

	@Override
	public String toString() {
		return "[Disciplina = " + nome + ", Média = " + media + ", Créditos = " + creditos + "]";
	}
	
}
