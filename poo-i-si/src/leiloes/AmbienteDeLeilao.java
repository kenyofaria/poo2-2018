package leiloes;

import java.util.ArrayList;
import java.util.List;

public class AmbienteDeLeilao {

	public static void main(String[] args) {
		Leilao leilao = new Leilao("ps4");
		
		List<Lance> lances = new ArrayList<Lance>();
		
		Pessoa kenyo = new Pessoa();
		kenyo.setNome("Kenyo Faria");
		
		Lance lanceKenyo = new Lance();
		lanceKenyo.setValor(500);
		lanceKenyo.setPessoa(kenyo);
		
		lances.add(lanceKenyo);
		
		leilao.setLances(lances);
		
		
		lanceKenyo.setValor(100);
		
		System.out.println("Leilão: " + leilao.getNome());
		System.out.println("--------------- Lances para o leilão -------------------");
		for(int i=0; i<lances.size(); i++) {
			System.out.println("lance: " + lances.get(i).getValor() + " Pessoa: " + lances.get(i).getPessoa().getNome());
		}
		
		
		
		
	}
}
