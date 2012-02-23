import java.util.ArrayList;
import java.util.List;

public class JogoDeBoliche {

	private int pontos;

	
	private Rodadas rodadas;

	public JogoDeBoliche() {
		rodadas = new ArrayList<Rodada>();
	}

	public void jogar(int... i){
		Rodada r = new Rodada();
		for (int j : i) {
			r.jogar(j);
		}
		rodadas.add(r);
	}

	public int getPontos() {
		int jogada = 0;
		for (Rodada rodada : rodadas) {
			if(rodada.isSpare())
			{
			 
			  pontos +=	rodadas.getProximaRodada(rodada).getPrimeiraJogada();
				
			}
			pontos += rodada.getTotal();
		}
		return pontos;
	}

}
