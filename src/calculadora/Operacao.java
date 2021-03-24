package calculadora;

public abstract class Operacao {

	private int primeiro;
	private int segundo;

	public Operacao(int primeiro, int segundo) {
		this.primeiro = primeiro;
		this.segundo = segundo;
	}

	public final Integer obterPrimeiroOperando() {
		return primeiro;
	}

	public final Integer obterSegundoOperando() {
		return segundo;
	}

	public abstract String formatar();

}
