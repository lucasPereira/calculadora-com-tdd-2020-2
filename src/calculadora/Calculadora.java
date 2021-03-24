package calculadora;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {

	private Integer acumulador;
	private List<String> historico;

	public Calculadora() {
		acumulador = 0;
		historico = new ArrayList<>();
	}

	public Integer somar(int adendo, int augendo) {
		String operacao = String.format("%d + %d", adendo, augendo);
		historico.add(0, operacao);
		acumulador = acumulador + adendo + augendo;
		return acumulador;
	}

	public Integer somar(int adendo) {
		acumulador = acumulador + adendo;
		return acumulador;
	}

	public List<String> obterHistorico() {
		return historico;
	}

}
