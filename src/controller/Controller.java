package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller implements IArquivos {
	
	public Controller() {
		super();
	}	
	@Override
	public void readFile(String path, String nome, String ext) throws IOException {
		File arq = new File(path, nome + ext);
			if (arq.exists() && arq.isFile()) {
				FileInputStream fluxo = new FileInputStream(arq);
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				while (linha != null) {
					String[] palavras = linha.split(",");
					if (palavras[2].contains("Fruit")) {
						System.out.println(palavras[0] + "\t" + palavras[1] + "\t" + palavras[3]);
					}
					linha = buffer.readLine();
				}
		} else {
			throw new IOException("Arquivo Inválido.");
		}
	}
	
}
