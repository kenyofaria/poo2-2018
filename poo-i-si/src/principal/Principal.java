package principal;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	
	public static void main(String[] args) {
		
//		String[] vetorInteiros = new String[5];
//		
//		String outroValorInteiro = "4";
//		
//		vetorInteiros[0] = "2";
//		vetorInteiros[1] = outroValorInteiro;
//		
//		outroValorInteiro = "3";
//		
//		System.out.println(vetorInteiros[0]);
//		System.out.println(vetorInteiros[1]);
		
		
		List<Pessoa> listaDePessoas = new ArrayList<Pessoa>();
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		p1.setNome("Kenyo");
		p2.setNome("daniel");
		
		
		
		listaDePessoas.add(p1);
		listaDePessoas.add(p2);
		//p1.setNome("kenyo faria");
		
		System.out.println(listaDePessoas.get(0).getNome());
		System.out.println(listaDePessoas.get(1).getNome());
		
		
//		List<Pessoa> pessoas = new ArrayList<Pessoa>();
//		
//		Pessoa p1 = null;
//		p1 = new Pessoa();
//		
//		p1.setNome("Vitor");
//		p1.setSexo('M');
//		
//		Pessoa p2 = new Pessoa();
//		p2.setNome("Helena");
//		p2.setSexo('F');
//		
//		pessoas.add(p1);
//		pessoas.add(p2);
//		pessoas.add(p1);
//		
//		p2.setNome("Não é mais Helena");
//		
//		for(int i=0; i<pessoas.size();i++) {
//			System.out.println(pessoas.get(i).getNome() + "  " + pessoas.get(i).getSexo());
//		}
		
	}
}
