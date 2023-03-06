package demonstrações;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class testeProduto {

	@Test
	public void testeSomar() {
		double height = 10;
		Produto prod = new Produto();
		double resultadoEsperado = 20;
		double resultadoReal = prod.dobraPeso(height);
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
