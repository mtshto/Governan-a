package demonstrações;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class TesteCalculadora extends TestCase {

	@Test
	public void testeSomar() {
		int nro1 = 5;
		int nro2 = 5;
		Calculadora calc = new Calculadora();
		int resultadoEsperado = 10;
		int resultadoReal = calc.somar(nro1, nro2);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	public void testeSubtrair() {
		int nro1 = 5;
		int nro2 = 3;
		Calculadora calc = new Calculadora();
		int resultadoEsperado = 2;
		int resultadoReal = calc.subtrair(nro1, nro2);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	public void testeMultiplicar() {
		int nro1 = 3;
		int nro2 = 3;
		Calculadora calc = new Calculadora();
		int resultadoEsperado = 9;
		int resultadoReal = calc.multiplicar(nro1, nro2);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	public void testeDividir() {
		int nro1 = 6;
		int nro2 = 2;
		Calculadora calc = new Calculadora();
		int resultadoEsperado = 3;
		int resultadoReal = calc.dividir(nro1, nro2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	

}
