import java.util.LinkedList;

public class Divisao extends Operacao {

	public String calcularOperacao(LinkedList<Double> valores) {
		
		double div = valores.get(0);
		for (int i = 1; i < valores.size(); i++) {
			
			if (valores.get(i) != 0) {
				div = div / valores.get(i);
			}	
		}
		
		return String.valueOf(div);
	}
}
