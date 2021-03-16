package submissaoCientifica;

import java.util.ArrayList;

import submissao.Situacao;

public class RelatorioTecnico  extends SubmissaoCientifica{
	
	private int ano;
	private int nPaginas;
	private String resumo;
	private String abstract1;

	public RelatorioTecnico(String titulo, Situacao situacao, ArrayList<String> autores, ArrayList<String> instituicoes, ArrayList<String> palavrasChaves,
			int ano, int nPaginas, String resumo, String abstract1) {
		super(titulo, situacao, autores, 4, 1, instituicoes, 4, palavrasChaves);
		this.ano = ano;
		this.nPaginas = nPaginas;
		this.resumo = resumo;
		this.abstract1 = abstract1;
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
		
	
}
