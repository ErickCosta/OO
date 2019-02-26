package catalogo;

import java.util.Scanner;

public class MainFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		Scanner leitorNumero = new Scanner(System.in);

		for(int i = 0; i<2; i++) {
			System.out.println("1 - Vinho \n2 - Rum");
			String opt = leitor.next();
			if(opt.equals("1") || opt.equals("2")) {
				System.out.println("Número válido");
				String nomeBebida = leitor.next();
				String nomeEmbalagem = leitor.next();
				int ml = leitorNumero.nextInt();
				long cdBarra = i;
				long id = i;
				if(opt.equals("1")) {
					String tpu = leitor.next();
					Vinho vinho = new Vinho();
					vinho.setNome(nomeBebida);
					vinho.setEmbalagem(nomeEmbalagem);
					vinho.setMililitros(ml);
					vinho.setCodigoBarras(cdBarra);
					vinho.setId(id);
					vinho.setTipoUva(tpu);
				}else {
					String ca = leitor.next();
					Rum rum = new Rum();
					rum.setNome(nomeBebida);
					rum.setEmbalagem(nomeEmbalagem);
					rum.setMililitros(ml);
					rum.setCodigoBarras(cdBarra);
					rum.setId(id);
					rum.setCaracteristica(ca);
				}
				
			}else {
				System.out.println("Número inválido");
			}
		}

	}

}
