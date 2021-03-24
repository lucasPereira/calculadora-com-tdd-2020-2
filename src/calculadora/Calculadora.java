package calculadora;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {

	private Integer acumulador;
	private List<Operacao> historico;

	public Calculadora() {
		acumulador = 0;
		historico = new ArrayList<>();
	}

	public Integer somar(int adendo, int augendo) {
		Operacao operacao = new Soma(adendo, augendo);
		historico.add(0, operacao);
		acumulador = acumulador + adendo + augendo;
		return acumulador;
	}

	public Integer somar(int adendo) {
		acumulador = acumulador + adendo;
		return acumulador;
	}

	public List<Operacao> obterHistorico() {
		return historico;
	}

	public Integer subrair(int minuendo, int subtraendo) {
		Operacao operacao = new Subtracao(minuendo, subtraendo);
		historico.add(0, operacao);
		return minuendo - subtraendo;
	}

}
