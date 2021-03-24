package calculadora;

public class Soma extends Operacao {

	public Soma(int adendo, int augendo) {
		super(adendo, augendo);
	}

	@Override
	public String formatar() {
		return String.format("%d + %d", obterPrimeiroOperando(), obterSegundoOperando());
	}

}
