package calculadora;

public class Subtracao extends Operacao {

	public Subtracao(int minuendo, int subtraendo) {
		super(minuendo, subtraendo);
	}

	@Override
	public String formatar() {
		return String.format("%d - %d", obterPrimeiroOperando(), obterSegundoOperando());
	}

}
