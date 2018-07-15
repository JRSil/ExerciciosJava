package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.IArquivosController;

public class Principal {
	public static void main(String[] args){
		IArquivosController ac = new ArquivosController();
		String path = "C:\\Temp";
		String arq = "novoArquivo.txt";
		try {
			//ac.leDiretorio(path);
			//ac.escreveArquivo(path, arq);
			ac.leArquivo(path, arq);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
