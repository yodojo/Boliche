import java.util.List;


public class Rodadas {

	private List<Rodada> rodadas;
	
	
	public Rodada getProximaRodada(Rodada rodada) {
		return rodadas.get(rodadas.indexOf(rodada)+1);
	}
}
