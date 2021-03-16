package submissao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Arquivo {
	public void salvarSubmissao(Submissao submissao) {

		try {
			FileOutputStream fos = new FileOutputStream("submissao.bin");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(submissao);

//		for(int i = 0; i < submissoes.size(); i++){
//			sub = null;
//			sub = new Submissao(p.get(i));
//			oos.writeObject(sub;
//		}

			oos.close();
			fos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void salvarSubmissoes(ArrayList<Submissao> submissoes) {

		try {
			FileOutputStream fos = new FileOutputStream("submissoes.bin");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			Submissao sub;
			for (int i = 0; i < submissoes.size(); i++) {

				sub = submissoes.get(i);
				oos.writeObject(sub);
			}

			oos.close();
			fos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void escreverSubmissoes(ArrayList<Submissao> submissoes) {

		try {

			FileInputStream ios = new FileInputStream("submissoes.bin");
			ObjectInputStream ois = new ObjectInputStream(ios);

			Submissao sub;
			for (int i = 0; i < submissoes.size(); i++) {

				sub = submissoes.get(i);
				ois.readObject();

			}

			ios.close();
			ois.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
