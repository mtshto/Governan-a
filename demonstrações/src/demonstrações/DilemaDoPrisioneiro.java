package demonstrações;

public class DilemaDoPrisioneiro {
	private int PENA_INOCENCIA = 0;
	private int PENA_CONDENACAO_MUTUA = 5;
	private int PENA_CONDENACAO_INDIVIDUAL = 10;
	private int PENA_CONDENACAO_CUMPLICES = 1;

	public enum Resposta {
		NEGACAO, DELACAO
	}

	public int calculaPena(Resposta respostaPrisioneiroA, Resposta respostaPrisioneiroB) {
		if (respostaPrisioneiroA == Resposta.DELACAO) {
			if (respostaPrisioneiroB == Resposta.DELACAO) {
				System.out.println("PENA_CONDENACAO_MUTUA");
				return PENA_CONDENACAO_MUTUA;
			} else {
				System.out.println("PENA_INOCENCIA");
				return PENA_INOCENCIA;
			}
		} else {
			if (respostaPrisioneiroB == Resposta.DELACAO) {
				System.out.println("PENA_CONDENACAO_INDIVIDUAL");
				return PENA_CONDENACAO_INDIVIDUAL;
			} else {
				System.out.println("PENA_CONDENACAO_CUMPLICES");
				return PENA_CONDENACAO_CUMPLICES;
			}
		}
	}
}
