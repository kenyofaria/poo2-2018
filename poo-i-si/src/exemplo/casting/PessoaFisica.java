package exemplo.casting;

public class PessoaFisica extends Pessoa {

	private char sexo;
	private String dataNascimento;

	public PessoaFisica(String inscricaoReceita, String nome, String cidade, char sexo, String dataNascimento) {
		super(inscricaoReceita, nome, cidade);
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
	}

	public char getSexo() {
		return sexo;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
}
