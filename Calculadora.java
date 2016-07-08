
public class Calculadora {
	private static final int TAMANHO_INICIAL = 6;
	private static final int DOBRO = 2;
	private Disciplina[] disciplinas = new Disciplina[TAMANHO_INICIAL];
	private int posicao = 0;
	
	public void AdicionarDiciplina(Disciplina disciplina){
		if (disciplinas.length == posicao) {
			Disciplina[] novoArray = new Disciplina[posicao * DOBRO];
			for (int i = 0; i < posicao; i++) {
				novoArray[i] = disciplinas[i];
			}
			disciplinas = novoArray;	
		}
		
		this.disciplinas[posicao] = disciplina;
		posicao++;
	}
	
	
	public double getCre(){
		double soma = 0;
		for (int i = 0; i < posicao; i++) {
			soma += disciplinas[i].getMediaPesada();
		}
		return soma/calculaSomaCreditos();
	}
	
	
	public double calculaSomaCreditos(){
		double somaCreditos = 0;
		for (int i = 0; i < posicao; i++) {
			somaCreditos += disciplinas[i].getCreditos();
		}
		return somaCreditos;

	}
	

	public Disciplina[] getDisciplinas(){
		return this.disciplinas;
	}
}
