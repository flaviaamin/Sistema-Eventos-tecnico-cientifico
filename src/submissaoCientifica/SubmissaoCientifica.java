package submissaoCientifica;

import java.util.ArrayList;

import submissao.Situacao;
import submissao.Submissao;

public class SubmissaoCientifica extends Submissao {
	protected int instituicao;
	protected ArrayList<String> instituicoes = new ArrayList<String>();
	private int palavraChave;
	protected ArrayList<String> palavrasChaves = new ArrayList<String>();

	public SubmissaoCientifica(String titulo, Situacao situacao, ArrayList<String> autores, int mAX_AUTORES,
			int instituicao, ArrayList<String> instituicoes, int palavraChave, ArrayList<String> palavrasChaves) {
		super(titulo, situacao, autores, mAX_AUTORES);
		this.instituicao = instituicao;
		this.instituicoes = instituicoes;
		this.palavraChave = palavraChave;
		this.palavrasChaves = palavrasChaves;
	}

	public int getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(int instituicao) {
		this.instituicao = instituicao;
	}

	public ArrayList<String> getInstituicoes() {
		return instituicoes;
	}

	public void setInstituicoes(ArrayList<String> instituicoes) {
		this.instituicoes = instituicoes;
	}

	public int getPalavraChave() {
		return palavraChave;
	}

	public void setPalavraChave(int palavraChave) {
		this.palavraChave = palavraChave;
	}

	public ArrayList<String> getPalavrasChaves() {
		return palavrasChaves;
	}

	public void setPalavrasChaves(ArrayList<String> palavrasChaves) {
		this.palavrasChaves = palavrasChaves;
	}

	@Override
	public String toString() {
		return "SubmissaoCientifica [instituicao=" + instituicao + ", instituicoes=" + instituicoes + ", palavraChave="
				+ palavraChave + ", palavrasChaves=" + palavrasChaves + "]";
	}

}
