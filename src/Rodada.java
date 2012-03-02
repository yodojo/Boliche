import java.util.ArrayList;
import java.util.List;

public class Rodada {

	private List<Integer> jogadas = new ArrayList<Integer>();

	public Rodada() {

	}

	public void jogar(int i) {
		jogadas.add(i);
	}

	public int getPrimeiraJogada() {
		return jogadas.get(0);
	}
	
	public int getSegundaJogada() {
		return jogadas.get(1);
	}

	public boolean isSpare() {
		return !isUltimaRodada() && (jogadas.get(0) + jogadas.get(1) == 10);
	}

	public boolean isStrike() {
		return !isUltimaRodada() && jogadas.get(0) == 10;
	}
	
	public boolean isUltimaRodada(){
		return jogadas.size() == 3;
	}

	public List<Integer> getJogadas() {
		return jogadas;
	}

	public int getTotal() {
		int pontos = 0;
		for (Integer jogada : jogadas) {
			pontos += jogada;
		}
		return pontos;
	}

}
