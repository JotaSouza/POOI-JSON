package ExJSON;


import java.util.ArrayList;
import java.util.List;

public class Vetor {

	public List<Vetor> getVetor() {
		return vetor;
	}

	public void setVetor(List<Vetor> vetor) {
		this.vetor = vetor;
	}

	private List<Vetor> vetor;
	
	public Vetor() {
		vetor = new ArrayList<Vetor>();
	}
}
