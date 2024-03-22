

import java.sql.Date;

public class Ferroviaria {
    public static void main(String[] args){
        
        Linha l1 = new Linha();
        Linha linhas[] = {l1};


        Estacao parangaba = new Estacao(linhas);
        Estacao benfica = new Estacao(linhas);

        Vagao v1 = new Vagao(l1, 1453, "carga", 2000, 1);
        Vagao v2 = new Vagao(l1, 1453, "carga", 2000, 1);
        Vagao v3 = new Vagao(l1, 1453, "passageiro", 40, 1);
        
        Locomotiva lo1 = new Locomotiva(l1, 70306, 10000, 18);
        Locomotiva locomotivas[] = {lo1};

        Vagao vagoes[] = {v1, v2, v3};
        Trem t1 = new Trem(l1, vagoes, locomotivas, parangaba, benfica);
        Trem trens[] = {t1};
        
        RecursoFerroviario r1 = new RecursoFerroviario(l1);
        r1.setLocomotiva(locomotivas);
        r1.setTrem(trens);
        r1.setVagao(vagoes);

        RecursoFerroviario recs[] = {r1};

        Date d1 = new Date(1999/1/1);
        t1.setDataFormacao(d1);
        
        l1.setRecursos(recs);
        l1.setDescricao("Linha Parangaba/Benfica\nSaída: 18:30\nChegada: 18:45");
        l1.setExtensao(6);
        l1.setNumero(420);

        System.out.println(l1.toString());
     



    }
    
}
