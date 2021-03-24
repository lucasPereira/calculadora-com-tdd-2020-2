package calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TesteCalculadoraHistorico {

	private Calculadora calculadora;

	@BeforeEach
	void configurar() {
		calculadora = new Calculadora();
	}

	@Test
	void obterHistoricoDeCalculadoraComUmaSomaDeDoisOperandos() throws Exception {
		calculadora.somar(0, 1);
		List<Operacao> historico = calculadora.obterHistorico();

		assertEquals(1, historico.size());
		assertEquals("0 + 1", historico.get(0).formatar());
	}

	@Test
	void obterHistoricoDeCalculadoraComDuasSomasDeDoisOperandos() throws Exception {
		calculadora.somar(0, 1);
		calculadora.somar(1, 2);
		List<Operacao> historico = calculadora.obterHistorico();

		assertEquals(2, historico.size());
		assertEquals("1 + 2", historico.get(0).formatar());
		assertEquals("0 + 1", historico.get(1).formatar());
	}

	@Test
	void obterHistoricoDeCalculadoraComUmaSubtracaoDeDoisOperandos() throws Exception {
		calculadora.subrair(0, 1);
		List<Operacao> historico = calculadora.obterHistorico();

		assertEquals(1, historico.size());
		assertEquals("0 - 1", historico.get(0).formatar());
	}

}
