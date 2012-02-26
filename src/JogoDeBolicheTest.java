import junit.framework.Assert;

import org.junit.Test;

public class JogoDeBolicheTest {

	@Test
	public void deveMarcarZeroPontosSeErrarTodasJogadas() {
		JogoDeBoliche j = new JogoDeBoliche();
		j.jogar(0,0)
		 .jogar(0,0)
		 .jogar(0,0)
		 .jogar(0,0)
		 .jogar(0,0)
		 .jogar(0,0)
		 .jogar(0,0)
		 .jogar(0,0)
		 .jogar(0,0)
		 .jogar(0,0);
		Assert.assertEquals(0, j.getPontos());
	}

	@Test
	public void deveRetornar60SeMarcouTudoTres() {
		JogoDeBoliche j = new JogoDeBoliche();
		j.jogar(3,3)
		 .jogar(3,3)
		 .jogar(3,3)
		 .jogar(3,3)
		 .jogar(3,3)
		 .jogar(3,3)
		 .jogar(3,3)
		 .jogar(3,3)
		 .jogar(3,3)
		 .jogar(3,3);
		Assert.assertEquals(60, j.getPontos());
	}

	@Test
	public void primeiraSpareRestoDasJogadasUm() {
		JogoDeBoliche j = new JogoDeBoliche();
		j.jogar(5,5)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1);
		Assert.assertEquals(29, j.getPontos());
	}

	public void ultimaSpareAnterioresUm() {
		JogoDeBoliche j = new JogoDeBoliche();
		j.jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(5,5,1);
		Assert.assertEquals(29, j.getPontos());
	}

	public void penultimaEUltimaJogadasSpare() {
		JogoDeBoliche j = new JogoDeBoliche();
		j.jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(5,5)
		 .jogar(5,5,1);
		Assert.assertEquals(42, j.getPontos());
	}


	@Test
	public void primeiroStrikeRestoDasJogadasUm() {
		JogoDeBoliche j = new JogoDeBoliche();
		j.jogar(10)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1);
		Assert.assertEquals(30, j.getPontos());
	}

	@Test
	public void ultimoStrikeResto1() {
		JogoDeBoliche j = new JogoDeBoliche();
		j.jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(1,1)
		 .jogar(10,1,1);
		Assert.assertEquals(30, j.getPontos());
	}
	
	@Test
	public void jogoPerfeito() {
		JogoDeBoliche j = new JogoDeBoliche();
		j.jogar(10)
		 .jogar(10)
		 .jogar(10)
		 .jogar(10)
		 .jogar(10)
		 .jogar(10)
		 .jogar(10)
		 .jogar(10)
		 .jogar(10)
		 .jogar(10,10,10);
		Assert.assertEquals(300, j.getPontos());
	}
	
	

}
