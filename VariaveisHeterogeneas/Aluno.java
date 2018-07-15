public class Aluno {
    String pnome;
    String unome;
    int pontos;
    
    //Construtor
    Aluno(){
        this("","",0);
    }
    
    Aluno(String pnomealuno, String unomealuno, int pontosaluno){
        pnome = pnomealuno;
        unome = unomealuno;
        pontos = pontosaluno;
    }
}
