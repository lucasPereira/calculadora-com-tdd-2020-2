package calculadora;

public class Calculadora {

	private Integer acumulador;

	public Calculadora() {
		acumulador = 0;
	}

	public Integer somar(int adendo, int augendo) {
		acumulador = acumulador + adendo + augendo;
		return acumulador;
	}

	public Integer somar(int adendo) {
		acumulador = acumulador + adendo;
		return acumulador;
	}

}
