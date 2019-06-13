package model;

public class Pessoa {

	private String nome;
	private String sobreNome;
	
	public Pessoa(String nome, String sobreNome) {
		this.nome = nome;
		this.sobreNome = sobreNome;
	}
	
	public String getNome() {
		return nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
}
