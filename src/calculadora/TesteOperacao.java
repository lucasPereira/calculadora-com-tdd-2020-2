package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TesteOperacao {

	@Test
	void umaOperacaoDeSomaDeUmaMaisDois() throws Exception {
		Soma operacao = new Soma(1, 2);
		assertEquals(1, operacao.obterPrimeiroOperando());
		assertEquals(2, operacao.obterSegundoOperando());
		assertEquals("1 + 2", operacao.formatar());
	}

	@Test
	void umaOperacaoDeSubtracaoDeUmaMaisDois() throws Exception {
		Subtracao operacao = new Subtracao(1, 2);
		assertEquals(1, operacao.obterPrimeiroOperando());
		assertEquals(2, operacao.obterSegundoOperando());
		assertEquals("1 - 2", operacao.formatar());
	}

}
