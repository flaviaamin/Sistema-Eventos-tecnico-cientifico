package submissaoApresentacao;

import java.util.ArrayList;

import submissao.Situacao;
import submissao.Submissao;

public abstract class SubmissaoApresentacao extends Submissao {
	protected String resumo;
	protected String Abstract;
	protected int duracao;

	public SubmissaoApresentacao(String titulo, Situacao situacao, ArrayList<String> autor, int mAX_AUTORES,
			String resumo, String abstract1, int duracao) {
		super(titulo, situacao, autor, mAX_AUTORES);
		this.resumo = resumo;
		Abstract = abstract1;
		this.duracao = duracao;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String getAbstract() {
		return Abstract;
	}

	public void setAbstract(String abstract1) {
		Abstract = abstract1;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return "SubmissaoApresentacao [resumo=" + resumo + ", Abstract=" + Abstract + ", duracao=" + duracao + "]";
	}

}
