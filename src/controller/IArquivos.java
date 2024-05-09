package controller;

import java.io.IOException;

public interface IArquivos {
	public void readFile(String path, String nome, String ext) throws IOException;
}