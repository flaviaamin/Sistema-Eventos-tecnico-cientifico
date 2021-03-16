package submissaoCientifica;

import java.util.ArrayList;

import submissao.Situacao;;

public class Artigo extends SubmissaoCientifica {

	private String resumo;
	private String abstract1;

	public Artigo(String titulo, Situacao situacao, ArrayList<String> autores, int mAX_AUTORES, ArrayList<String> instituicoes, ArrayList<String> palavrasChaves, String resumo,
			String abstract1) {
		super(titulo, situacao, autores, 8, 8, instituicoes, 4, palavrasChaves);
		this.resumo = resumo;
		this.abstract1 = abstract1;
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
