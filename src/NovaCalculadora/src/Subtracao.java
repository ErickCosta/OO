import java.util.LinkedList;

public class Subtracao extends Operacao {

	public String calcularOperacao(LinkedList<Double> valores) {
		
		double sub = 0;
		for (int i = 0; i < valores.size(); i++) {
			sub = sub - valores.get(i);
		}
		
		return String.valueOf(sub);
	}
}
