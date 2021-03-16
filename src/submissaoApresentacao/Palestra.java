package submissaoApresentacao;

import java.util.ArrayList;

import submissao.Situacao;

public class Palestra extends SubmissaoApresentacao {

	private String curriculo;

	public Palestra(String titulo, Situacao situacao, ArrayList<String> autor, String resumo,
			String abstract1, int duracao, String curriculo) {
		super(titulo, situacao, autor, 1, resumo, abstract1, duracao);
		this.curriculo = curriculo;
	}

	public String getCurriculo() {
		return curriculo;
	}

	public void setCurriculo(String curriculo) {
		this.curriculo = curriculo;
	}

}
