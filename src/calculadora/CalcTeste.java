import java.util.LinkedList;

public class CalcTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora c =  new Calculadora();
		
		LinkedList<Double> l = new LinkedList<Double>();
		for (double i = 0; i< 50; i++) {
			l.add(i);
		}
		
		System.out.println(c.calcularSoma(l));
		
	}

}
