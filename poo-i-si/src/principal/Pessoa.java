package principal;

public class Pessoa {

	private String nome;
	private char sexo;
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSexo() {
		if(this.sexo == 'M')
			return "masculino";
		else return "feminino";
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
}
