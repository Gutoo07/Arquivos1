package view;
import controller.Controller;
import controller.IArquivos;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		IArquivos arqCont = new Controller();
		String dir = "C:\\TEMP";
		String nome = "generic_food";
		String ext = ".csv";
		try {
			arqCont.readFile(dir, nome, ext);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
