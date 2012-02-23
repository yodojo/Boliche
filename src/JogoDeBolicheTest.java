import junit.framework.Assert;

import org.junit.Test;

public class JogoDeBolicheTest {

	@Test
	public void deveMarcarZeroPontosSeErrarTodasJogadas() {
		JogoDeBoliche j = new JogoDeBoliche();
		for (int i = 0; i < 10; i++) {
			j.jogar(0, 0);
		}

		Assert.assertEquals(0, j.getPontos());
	}

	@Test
	public void deveRetornar63SeMarcouTudoTres() {
		JogoDeBoliche j = new JogoDeBoliche();
		for (int i = 0; i < 9; i++) {
			j.jogar(3,3);
		}
		j.jogar(3,3,3);
		Assert.assertEquals(63, j.getPontos());
	}

	@Test
	public void primeiraSpareRestoDasJogadasUm() {
		JogoDeBoliche j = new JogoDeBoliche();
		j.jogar(5,5);
		for (int i = 0; i < 8; i++) {
			j.jogar(1,1);
		}
		j.jogar(1,1,1);
		Assert.assertEquals(30, j.getPontos());
	}
	
	public void ultimaSpareAnterioresUm() {
		JogoDeBoliche j = new JogoDeBoliche();
		for (int i = 0; i < 9; i++) {
			j.jogar(1,1);
		}
		j.jogar(5,5);
		Assert.assertEquals(29, j.getPontos());
	}

}
