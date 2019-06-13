package arquivo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExemploArquivo {

	public static void escreNoArquivo() {
		try {
			FileWriter fw = new FileWriter("pooi-2019.txt");
			fw.write("Primeiro exemplo com arquivos.");
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void leDoArquivo() {
		try {
			File arquivoParaLeitura = new File("pooi-2019.txt");
			FileInputStream inputStream = new FileInputStream(arquivoParaLeitura);
			Scanner s = new Scanner(inputStream);
			while(s.hasNext()) {
				System.out.println(s.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void enviaArquivoPorEmail(String email) throws IOException {
		//..
		
	}
	
	public static void main(String[] args) throws IOException {
		escreNoArquivo();
		leDoArquivo();
		
		enviaArquivoPorEmail("kenyofaria@gmail.com");

	}
}
