package submissao;

import java.util.ArrayList;

import submissao.Situacao;

public abstract class Submissao {
	protected String titulo;
	protected Situacao situacao;
	protected ArrayList<String> autores = new ArrayList<String>();
	protected static int MAX_AUTORES;

	public Submissao(String titulo, Situacao situacao, ArrayList<String> autores, int mAX_AUTORES) {
        this.titulo = titulo;
        this.situacao = situacao;
        this.autores = autores;
        MAX_AUTORES = mAX_AUTORES;

    }

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

	public ArrayList<String> getAutores() {
        return autores;
    }

    public void setAutor(ArrayList<String> autor) {
        this.autores = autor;
    }

	public int getMAX_AUTORES() {
		return MAX_AUTORES;
	}

	public void setMAX_AUTORES(int mAX_AUTORES) {
		MAX_AUTORES = mAX_AUTORES;
	}

	@Override
	public String toString() {
		return "Submissao [titulo=" + titulo + ", situacao=" + situacao
				+ ", autores=" + autores + ", MAX_AUTORES=" + MAX_AUTORES + "]";
	}

}
