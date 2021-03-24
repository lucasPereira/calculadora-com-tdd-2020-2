package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TesteCalculadora {

	@Test
	void somarElmentoNeutroComUm() throws Exception {
		Integer resultado = new Calculadora().somar(0, 1);
		assertEquals(1, resultado);
	}

}
