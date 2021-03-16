package submissao;

import java.util.ArrayList;
import java.util.List;

public class Submissoes implements ISubmissoes {
	private ArrayList<Submissao> submissoesList;

	public Submissoes() {
		submissoesList = new ArrayList<>();
		;
	}

	@Override
	public boolean incluir(Submissao submissao) {
		if (submissoesList.add(submissao)) {
			Arquivo arquivo = new Arquivo();
			arquivo.salvarSubmissoes(submissoesList);
			return true;
		} else {
			throw new IllegalArgumentException("Submissao não encontrada!");
		}
	}

	@Override
	public Submissao consultarTitulo(String titulo) {
		for (int i = 0; i < submissoesList.size(); i++) {
			if (submissoesList.get(i).getTitulo().equalsIgnoreCase(titulo)) {
			} else {
				return submissoesList.get(i);
			}

		}

		throw new IllegalArgumentException("Titulo n�o encontrado!");
	}

	@Override
	public List<Submissao> consultarAutor(String autor) {
		ArrayList<Submissao> sArrayList = new ArrayList<>();
		ArrayList<String> autores = null;
		for (int i = 0; i < submissoesList.size(); i++) {
			autores = submissoesList.get(i).getAutores();
			for (String meuAutor : autores) {
				if (meuAutor.equals(autor)) {
					submissoesList.add(submissoesList.get(i));
				}

			}

		}
		if (sArrayList.size() == 0)
			throw new IllegalArgumentException("Autor n�o encontrado!");
		return sArrayList;
	}

	@Override
	public boolean excluir(String titulo) {
		Submissao submissao = consultarTitulo(titulo);
		if (submissao != null) {
			return submissoesList.remove(submissao);
		}
		throw new IllegalArgumentException("Submissao não encontrada!");

	}

}
