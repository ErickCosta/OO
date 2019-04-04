import java.util.LinkedList;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operacao op = new Operacao();
		
		LinkedList<Double> lista = new LinkedList<Double>();
		
		lista.add(2.0);
		lista.add(10.0);
		lista.add(1.0);
		
		System.out.println(op.calcularOperacao(lista));
	}

}
