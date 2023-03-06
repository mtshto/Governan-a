package demonstrações;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import demonstrações.DilemaDoPrisioneiro.Resposta;

class TestePrisioneiro {

	@Test
	public void testCenario1() {
		Resposta respostaSuspeitoA = Resposta.DELACAO;
		Resposta respostaSuspeitoB = Resposta.DELACAO;
		DilemaDoPrisioneiro dp = new DilemaDoPrisioneiro();
		Assert.assertNotNull(dp);
		int penaSuspeitoA = dp.calculaPena(respostaSuspeitoA, respostaSuspeitoB);
		int penaSuspeitoB = dp.calculaPena(respostaSuspeitoB, respostaSuspeitoA);
		Assert.assertEquals(5, penaSuspeitoA);
		Assert.assertEquals(5, penaSuspeitoB);

	}
}
