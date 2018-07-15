/*
    Nome do programa : Sistema de Votação - ClasseMetodos
    Objetivo: Aqui ficam todos os métodos do sistema de votação
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 31/05/2018
 */
import java.io.*;
import javax.swing.*;
public class ClasseMetodos {
    public Votacao[] fCadastra(Votacao[] vot, int qtd){
        for(int i = 0; i < qtd; i++){
            vot[i] = new Votacao();
        }
        
        for(int i = 0; i < qtd; i++){
            vot[i].secao = (int) (Math.random() * 10);
            vot[i].candidato = (int) (Math.random() * 300);
        }
        return vot;
    }
    
    public Votacao[] fClassificaSecao(Votacao[] vot, int qtd){
        Votacao[] aux = new Votacao[1];
        aux[0] = new Votacao();
        
        for(int i = 0; i < qtd - 1; i++){
            for(int j = i + 1; j < qtd; j++){
                if(vot[j].secao > vot[i].secao){
                    aux[0] = vot[i];
                    vot[i] = vot[j];
                    vot[j] = aux[0];
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Dados classificados!");
        return vot;
    }
    
    public Votacao[] fGrava(Votacao[] vot, int qtd) throws IOException{
        String fileName = "Votacao2018.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        for(int i = 0; i < qtd; i++){
            writer.write(Integer.toString(vot[i].secao));
            writer.newLine();
            writer.write(Integer.toString(vot[i].candidato));
            writer.newLine();
        }
        writer.close();
        JOptionPane.showMessageDialog(null, "Arquivo gerado!");
        return vot;
    }
    
    public void pEleitores(Votacao[] vot, int qtd){
        int eleitor[] = new int[10];
        for(int i = 0; i < qtd; i++){
            eleitor[vot[i].secao]++;
        }
        
        for(int i = 0; i < 10; i++){
            System.out.println("Seção #"+i+": "+eleitor[i]+" eleitores.");
        }
    }
}
