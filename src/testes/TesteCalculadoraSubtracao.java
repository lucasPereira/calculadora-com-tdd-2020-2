package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

public class TesteCalculadoraSubtracao {

	private Calculadora calculadora;

	@BeforeEach
	void configurar() {
		calculadora = new Calculadora();
	}

	@Test
	void subtrairUmDeElementoNeutro() throws Exception {
		Integer resultado = calculadora.subrair(1, 0);
		assertEquals(1, resultado);
	}

	@Test
	void subtrairUmDeDois() throws Exception {
		Integer resultado = calculadora.subrair(1, 2);
		assertEquals(-1, resultado);
	}

}
