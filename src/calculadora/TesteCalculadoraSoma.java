package calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TesteCalculadoraSoma {

	private Calculadora calculadora;

	@BeforeEach
	void configurar() {
		calculadora = new Calculadora();
	}

	@Test
	void somarElmentoNeutroComUm() throws Exception {
		Integer resultado = calculadora.somar(0, 1);
		assertEquals(1, resultado);
	}

	@Test
	void somarElementoNeutroComDois() throws Exception {
		Integer resultado = calculadora.somar(0, 2);
		assertEquals(2, resultado);
	}

	@Test
	void somarElementoUmComElementoNeutro() throws Exception {
		Integer resultado = calculadora.somar(1, 0);
		assertEquals(1, resultado);
	}

	@Test
	void somarTresAposSomaUmaMaisDois() throws Exception {
		calculadora.somar(1, 2);
		Integer resultado = calculadora.somar(3);
		assertEquals(6, resultado);
	}

	@Test
	void somarQuatroAposSomaUmaMaisDois() throws Exception {
		calculadora.somar(1, 2);
		Integer resultado = calculadora.somar(4);
		assertEquals(7, resultado);
	}

	@Test
	void somarUmMaisDoisDepoisSomarTresMaisQuatro() throws Exception {
		calculadora.somar(1, 2);
		Integer resultado = calculadora.somar(3, 4);
		assertEquals(10, resultado);
	}

	@Test
	void somarUmDepoisSomarDois() throws Exception {
		calculadora.somar(1);
		Integer resultado = calculadora.somar(2);
		assertEquals(3, resultado);
	}

}
