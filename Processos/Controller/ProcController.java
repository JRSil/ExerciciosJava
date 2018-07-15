package Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.Set;

import javax.swing.JOptionPane;

public class ProcController {
	public ProcController() {
		super();
	}
	
	public String os() {
		String os = System.getProperty("os.name");
		return os;
	}
	
	public void propriedades() {
		Properties prop = System.getProperties();
		Set<Object> chaves = prop.keySet();
		for (Object key : chaves){
			String chave = key.toString();
			System.out.print(chave);
			System.out.print(" ==> ");
			String propriedade = System.getProperty(chave);
			System.out.println(propriedade);
		}
	}
	
	public void chamaProcesso (String caminhoProcesso){
		try {
			Runtime.getRuntime().exec(caminhoProcesso);
		} catch (IOException e) {
//			e.printStackTrace();
			String errMsg = e.getMessage();
			if (errMsg.contains("740")){
				StringBuffer buffer = new StringBuffer();
				buffer.append("cmd /c");
				buffer.append(" ");
				buffer.append(caminhoProcesso);
				try {
					Runtime.getRuntime().exec(buffer.toString());
				} catch (IOException e1) {
//					e1.printStackTrace();
				}
			} else{
				JOptionPane.showMessageDialog(null, 
								e.getMessage(), "ERRO", 
								JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	public void leProcesso (String caminhoProcesso){
		try {
			Process processo = Runtime.getRuntime().
					exec(caminhoProcesso);
			InputStream fluxo = processo.getInputStream();
			InputStreamReader leitor = 
					new InputStreamReader(fluxo);
			BufferedReader buffer = 
					new BufferedReader(leitor);
			String linha = buffer.readLine();
			while(linha != null){
				System.out.println(linha);
				linha = buffer.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void mataProcesso (String processo){
		String cmdPid = "TASKKILL /PID ";
		String cmdNome = "TASKKILL /IM ";
		int pid = 0;
		StringBuffer buffer = new StringBuffer();
		try{
			pid = Integer.parseInt(processo);
			buffer.append(cmdPid);
			buffer.append(pid);
		} catch (NumberFormatException e){
			buffer.append(cmdNome);
			buffer.append(processo);
		}
		chamaProcesso(buffer.toString());
	}
}
