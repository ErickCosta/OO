import java.util.LinkedList;

public class Operacao {

	private long id = 0;

	public String somarValores(LinkedList<Double> valores) {
		double somaValores = 0;
		for (int i = 0; i < valores.size(); i++) {
			somaValores = somaValores + valores.get(i);
		}
		return String.valueOf(somaValores);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
