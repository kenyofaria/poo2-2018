package exemplo.casting;

public class PessoaJuridica extends Pessoa{

	private String nomeFantasia;
	private String ramo;

	public PessoaJuridica(String inscricaoReceita, String nome, String cidade, String nomeFantasia, String ramo) {
		super(inscricaoReceita, nome, cidade);
		this.nomeFantasia = nomeFantasia;
		this.ramo = ramo;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public String getRamo() {
		return ramo;
	}
}
