package view;

import Controller.ProcController;

public class Principal {
	public static void main (String args[]){
		ProcController pCont = new ProcController();
//		String os = pCont.os();
//		System.out.println(os);
//		pCont.propriedades();
//		String caminhoProcesso = "C:\\Windows\\notepad.exe";
//		pCont.chamaProcesso(caminhoProcesso);
//		String caminhoProcesso = "TASKLIST /FO TABLE";
//		pCont.leProcesso(caminhoProcesso);
		String processo = "notepad.exe";
		pCont.mataProcesso(processo);
	}
}
