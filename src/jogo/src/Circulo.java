
public class Circulo extends Forma{

	private double raio = 0.0;
	private double PI = 3.14;
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double calcularArea() {
		return PI * (raio * raio);
	}
	
}
