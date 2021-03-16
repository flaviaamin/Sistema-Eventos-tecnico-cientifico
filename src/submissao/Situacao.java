package submissao;

public enum Situacao {
	APROVADO("Aprovado"), REPROVADO("Reprovado"), SOBAVALIACAO("Sob Avaliação");

	private String situacao;

	Situacao(String sit) {
		this.situacao = sit;

	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
}
