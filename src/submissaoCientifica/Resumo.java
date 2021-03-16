package submissaoCientifica;

import java.util.ArrayList;

import submissao.Situacao;

public class Resumo extends SubmissaoCientifica {

	public Resumo(String titulo, Situacao situacao, ArrayList<String> autores, ArrayList<String> instituicoes, ArrayList<String> palavrasChaves) {
		super(titulo, situacao, autores, 8, 8, instituicoes, 4, palavrasChaves);
	}
}
