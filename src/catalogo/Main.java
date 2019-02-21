package catalogo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bebida bebida1 = new Bebida();
		
		bebida1.setNome("Bebida Um");
		bebida1.setEmbalagem("Vidro");
		bebida1.setId(0);
		bebida1.setMililitros(1000);
		bebida1.setCodigoBarras(127532121);
		
		System.out.println(bebida1.getCodigoBarras());
		
		Rum rum1 = new Rum();
		
		rum1.setNome("Rum Montilla");
		rum1.setEmbalagem("Vidro");
		rum1.setId(1);
		rum1.setMililitros(500);
		rum1.setCodigoBarras(728346827);
		rum1.setCaracteristica("Cristal");
		
		Vinho vinho1 = new Vinho();
	}

}
