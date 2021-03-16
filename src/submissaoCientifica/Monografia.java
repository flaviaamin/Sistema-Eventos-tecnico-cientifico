package submissaoCientifica;

import java.util.ArrayList;

import submissao.Situacao;
import submissao.Submissao;

public class Monografia extends SubmissaoCientifica {

	private Submissao submissao;
	private String resumo;
	private String abstract1;
	private String tipo;
	private String orientador;
	private String curso;
	private int ano;
	private int nPaginas;

	public Monografia(String titulo, Situacao situacao, ArrayList<String> autores, ArrayList<String> instituicoes, ArrayList<String> palavrasChaves, Submissao submissao,
			String resumo, String abstract1, String tipo, String orientador, String curso, int ano, int nPaginas) {
		super(titulo, situacao, autores, 1, 1, instituicoes, 4, palavrasChaves);
		this.submissao = submissao;
		this.resumo = resumo;
		this.abstract1 = abstract1;
		this.tipo = tipo;
		this.orientador = orientador;
		this.curso = curso;
		this.ano = ano;
		this.nPaginas = nPaginas;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String getAbstract1() {
		return abstract1;
	}

	public void setAbstract1(String abstract1) {
		this.abstract1 = abstract1;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getOrientador() {
		return orientador;
	}

	public void setOrientador(String orientador) {
		this.orientador = orientador;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getnPaginas() {
		return nPaginas;
	}

	public void setnPaginas(int nPaginas) {
		this.nPaginas = nPaginas;
	}

	public Submissao getSubmissao() {
		return submissao;
	}

	public void setSubmissao(Submissao submissao) {
		this.submissao = submissao;
	}

}
