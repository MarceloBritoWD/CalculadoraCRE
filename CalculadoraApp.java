import java.util.Scanner;

public class CalculadoraApp {

	private static final Object COMANDO_ENCERRAR = "fim";

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();
		
		//Cadastrando Disciplinas
		cadastroDisciplinas(teclado, calculadora);

		//Imprimindo CRE
		imprimindoCre(calculadora);
		
		System.out.println("\n--------------");
		System.out.println("Fim do programa.");
		
	}
	
	public static void cadastroDisciplinas(Scanner teclado, Calculadora calculadora){
		System.out.println("Iniciando cadastro disciplinas");
		System.out.println("Digite a palabra \"fim\" para encerrar.");
		System.out.print("Nome da Disciplina: ");
		String nome = teclado.nextLine();
		
		while(!nome.equals(COMANDO_ENCERRAR)){
			boolean houverErro;
			double media = 0;
			do {
				try {
					System.out.print("Média da disciplina: ");
					media = Double.parseDouble(teclado.next());
					houverErro = false;
				} catch (NumberFormatException e) {
					System.err.println("Use \".\" para separar decimais. \n");
					houverErro = true;
				}
			} while (houverErro);
			
			System.out.print("Créditos da disciplina: ");
			int creditos = teclado.nextInt();
			Disciplina disciplina = new Disciplina(nome, media, creditos);
			calculadora.AdicionarDiciplina(disciplina);		
			
			System.out.println("");
			System.out.print("Nome da Disciplina: ");
			nome = teclado.next();
		}
		
		System.out.println("Cadastro encerrado.");
		System.out.println("");
		
	}
	
	public static void imprimindoCre(Calculadora calculadora){
		System.out.println("Imprimindo CRE...");
		System.out.println(calculadora.getCre());
		
		for (int i = 0; i < calculadora.getDisciplinas().length; i++) {
			if (calculadora.getDisciplinas()[i] != null) {
				System.out.println(calculadora.getDisciplinas()[i].toString());
			}
			
		}
	}
	
	
	

}
