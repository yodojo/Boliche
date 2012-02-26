import java.util.ArrayList;


public class Rodadas extends ArrayList<Rodada> {

	private static final long serialVersionUID = -8787327259741748884L;


	private Rodada getProximaRodada(Rodada rodada) {
		return this.get(this.indexOf(rodada)+1);
	}


	public int getPontosProximaJogada(Rodada rodada) {
		return getProximaRodada(rodada).getPrimeiraJogada();
	}
	
	public int getPontosProximasDuasJogadas(Rodada rodada) {
		Rodada proximaRodada = getProximaRodada(rodada);
		if (proximaRodada.isStrike()){
			return proximaRodada.getPrimeiraJogada() + getProximaRodada(proximaRodada).getPrimeiraJogada();
		} else {
			return proximaRodada.getPrimeiraJogada() + proximaRodada.getSegundaJogada();
		}
	}
}
