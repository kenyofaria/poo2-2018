package exemplo.casting;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
        DecimalFormat df = new DecimalFormat("0.###");

        double[] values = { 1.0, 3.5, 123.4567, 10.0 };

        for (double value : values)
        {
        
            System.out.println(df.format(value).replace(".", ","));
        }
		
		
//		List<Pessoa> pessoas = new ArrayList<Pessoa>();
//
//		PessoaFisica vitor = new PessoaFisica("837.123.211-70", "Vítor", "Goiânia", 'M', "2010");
//		PessoaFisica helena = new PessoaFisica("830.123.289-71", "Helena", "Goiânia", 'F', "2018");
//
//		PessoaJuridica ifg = new PessoaJuridica("02.987.233/0001-87", "Instituto Federal de Ciência e Tecnologia",
//				"Inhumas", "IFG", "Setor Púlico - Educação");
//		PessoaJuridica ufg = new PessoaJuridica("01.000.453/0051-57", "Universidade Federal de Goiás", "Catalão", "UFG",
//				"Setor Púlico - Educação");
//
//		pessoas.add(vitor);
//		pessoas.add(helena);
//		pessoas.add(ifg);
//		pessoas.add(ufg);
//
//		for (int i = 0; i < pessoas.size(); i++) {
//			if (pessoas.get(i) instanceof PessoaFisica) {
//				PessoaFisica p = (PessoaFisica) pessoas.get(i);
//				System.out.println(p.getNome() + " --- " + p.getSexo() + " --- " + p.getDataNascimento());
//			}
//			if (pessoas.get(i) instanceof PessoaJuridica) {
//				PessoaJuridica p = (PessoaJuridica) pessoas.get(i);
//				System.out.println(p.getNomeFantasia() + " --- " + p.getRamo());
//			}
//
//		}

	}
}
