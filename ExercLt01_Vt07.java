/*
    Nome do programa : ExercLt01_Vt07
    Objetivo: A partir do exercício 6 (vetor classificado) solicitar um valor qualquer e
              verificar a sua existência no vetor (utilizar pesquisa binária).
    Nome do Programador    : Edilton Bezerra da Silva Junior
    Data de desenvolvimento: 30/03/2018
 */
import javax.swing.JOptionPane;
public class ExercLt01_Vt07 {
    public static void main (String args[]){
        int op = 0;
        int vt[] = new int[20];
        while(op != 9){
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada:"));
            switch(op){
                case 1:
                    vt = fCarrega(vt);
                    break;
                case 2:
                    vt = fClassifica(vt);
                    break;
                case 3:
                    pLocaliza(vt);
                    break;
                case 4:
                    pMostra(vt);
                    break;
                case 9:
                    System.out.println("FIM");
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA");
                    break;
            }
        }
    }
    
    static int[] fCarrega(int vt[]){
        for(int i = 0; i < 20; i++){
            vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        }
        return vt;
    }
    
    static int[] fClassifica(int v[]){
        int i, j, aux;
        for(i = 0; i < 19; i++){
            for(j = i + 1; j < 20; j++){
                if(v[i] > v[j]){
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
        return v;
    }
    
    static void pLocaliza(int vt[]){
        int i = 0, j = 19, escolha, local;
        boolean bandeira = false;
        escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite o número que deseja encontrar:"));
        
        while((i <= j)&&(bandeira == false)){
            local = (i + j) / 2;
            if(escolha == vt[local]){
                System.out.println("O número "+escolha+" está na posição "+local);
                bandeira = true;
            }else if(escolha < vt[local]){
                j = local - 1;
            }else{
                i = local + 1;
            }
        }
    }
    
    static void pMostra(int vt[]){
        for(int i = 0; i < 20; i++){
            System.out.println(vt[i]);
        }
    }
}
