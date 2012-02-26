public class JogoDeBoliche {

	private int pontos;

	private Rodadas rodadas;

	public JogoDeBoliche() {
		rodadas = new Rodadas();
	}

	public JogoDeBoliche jogar(int... i) {
		Rodada r = new Rodada();
		for (int j : i) {
			r.jogar(j);
		}
		rodadas.add(r);
		return this;
	}

	public int getPontos() {
		for (Rodada rodada : rodadas) {
			if (rodada.isStrike()) {
				pontos += rodadas.getPontosProximasDuasJogadas(rodada);
			} else if (rodada.isSpare()) {
				pontos += rodadas.getPontosProximaJogada(rodada);
			}
			pontos += rodada.getTotal();

		}
		return pontos;
	}

}
