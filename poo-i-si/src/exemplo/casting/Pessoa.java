package exemplo.casting;

public abstract class Pessoa {

	private String inscricaoReceita;
	private String nome;
	private String cidade;

	public Pessoa(String inscricaoReceita, String nome, String cidade) {
		this.inscricaoReceita = inscricaoReceita;
		this.nome = nome;
		this.cidade = cidade;
	}
	
	public String getNome() {
		return nome;
	}
	public String getInscricaoReceita() {
		return inscricaoReceita;
	}
	public String getCidade() {
		return cidade;
	}
}
