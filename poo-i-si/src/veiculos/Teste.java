package veiculos;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
		List<Veiculo> listaGeralDeVeiculos = new ArrayList<Veiculo>();
		
		Carro mercedes = new Carro("Mercedes", 2013, "C-180");
		Carro bmw = new Carro("BMW", 2013, "320i");
		listaGeralDeVeiculos.add(bmw);
		listaGeralDeVeiculos.add(mercedes);

		Moto gsx = new Moto("Honda", 2019, "GSX-700");
		Moto ktm = new Moto("KTM", 2019, "KTM-400");
		listaGeralDeVeiculos.add(gsx);
		listaGeralDeVeiculos.add(ktm);

		Bicicleta monarkao = new Bicicleta("Monark", 1971, "Monark 71");
		listaGeralDeVeiculos.add(monarkao);

		for (int i = 0; i < listaGeralDeVeiculos.size(); i++) {
			if (listaGeralDeVeiculos.get(i) instanceof Carro) {
				System.out.println("carro: " + listaGeralDeVeiculos.get(i).getMarca() + " " + listaGeralDeVeiculos.get(i).getAno()
						+ " " + listaGeralDeVeiculos.get(i).getModelo());
			}
			if (listaGeralDeVeiculos.get(i) instanceof Moto) {
				System.out.println("moto: " + listaGeralDeVeiculos.get(i).getMarca() + " " + listaGeralDeVeiculos.get(i).getAno()
						+ " " + listaGeralDeVeiculos.get(i).getModelo());
			}
			if (listaGeralDeVeiculos.get(i) instanceof Bicicleta) {
				System.out.println("bicicleta: " + listaGeralDeVeiculos.get(i).getMarca() + " " + listaGeralDeVeiculos.get(i).getAno()
						+ " " + listaGeralDeVeiculos.get(i).getModelo());
			}
		}

		

	}
}
