package demonstrações;

public class BoasVindas {
	private String menssagem;

//Construtor de Objeto na Classe
	public BoasVindas(String mens) {
		this.menssagem = mens;
	}

// Exibição da mensagem
	public String exibirMenssagem() {
		System.out.println(this.menssagem);
		return this.menssagem;
	}

// Exibição da parte fixa da mensagem public String completarMenssagem(){
	public String completarMenssagem() {
		String compmens;
		compmens = "Ola! Seja bem vindo a sua calculadora pessoal";
		System.out.println(compmens);
		return compmens;
	}
}