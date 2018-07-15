package controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class ArquivosController implements IArquivosController {

	@Override
	public void leDiretorio(String path) throws IOException {
		File dir = new File(path);
		if(dir.exists() && dir.isDirectory()){
			File[] lista = dir.listFiles();
			for(File f: lista){
				if(f.isDirectory()){
					System.out.println("["+f.getName()+"]");
				}
			}
			for(File f: lista){
				if(f.isFile()){
					System.out.println(f.getName() + "\t" + f.length());
				}
			}
		}else{
			throw new IOException("Dir. Inválido");
		}
	}

	@Override
	public void leArquivo(String path, String arq) throws IOException {
		File arquivo = new File(path, arq);
		if(arquivo.exists()){
			FileInputStream fluxo = new FileInputStream(arquivo);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while(linha != null){
				System.out.println(linha);
				linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();
		}else{
			throw new IOException("Arq inválido");
		}
	}

	@Override
	public void escreveArquivo(String path, String arq) throws IOException {
		File arquivo = new File(path, arq);
		boolean existe = false;
		if(arquivo.exists()){
			existe = true;
		}
		String texto = escreve();
		FileWriter abreArq = new FileWriter(arquivo, existe);
		PrintWriter writer = new PrintWriter(abreArq);
		writer.write(texto);
		writer.flush();
		writer.close();
		abreArq.close();
	}
	
	public String escreve(){
		StringBuffer buffer = new StringBuffer();
		String linha = "";
		while(!linha.equals("fim")){
			linha = JOptionPane.showInputDialog(null, "Digite uma frase", "Entrada", JOptionPane.INFORMATION_MESSAGE);
			buffer.append(linha + "\r\n");
		}
		return buffer.toString();
	}
}
