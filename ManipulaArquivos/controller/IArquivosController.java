package controller;

import java.io.IOException;

public interface IArquivosController {
	//O throws ioexception diz que outra classe trata a exceção
	public void leDiretorio(String path) throws IOException;
	
	public void leArquivo(String path, String arq) throws IOException;
	
	public void escreveArquivo(String path, String arq) throws IOException;
}
