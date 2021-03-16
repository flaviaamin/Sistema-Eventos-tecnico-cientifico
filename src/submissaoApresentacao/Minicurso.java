package submissaoApresentacao;

import java.util.ArrayList;

import submissao.Situacao;

public class Minicurso extends SubmissaoApresentacao {

	private int recursos;
	private String metodologia;

	public Minicurso(String titulo, Situacao situacao, ArrayList<String> autor, String resumo,
			String abstract1, int duracao, int recursos, String metodologia) {
		super(titulo, situacao, autor, 3, resumo, abstract1, duracao);
		this.recursos = recursos;
		this.metodologia = metodologia;
	}

	public int getRecursos() {
		return recursos;
	}

	public void setRecursos(int recursos) {
		this.recursos = recursos;
	}

	public String getMetodologia() {
		return metodologia;
	}

	public void setMetodologia(String metodologia) {
		this.metodologia = metodologia;
	}

}
