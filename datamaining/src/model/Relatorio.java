package model;

import java.util.ArrayList;

public class Relatorio {
    Analisador alanalisador;
    ArrayList<Itens> itens = new ArrayList<Itens>();
    public Relatorio(Analisador alanalisador) {
        this.alanalisador = alanalisador;
        this.itens.add(Itens.leite);
        this.itens.add(Itens.cafe);
        this.itens.add(Itens.cerveja);
        this.itens.add(Itens.pao);
        this.itens.add(Itens.manteiga);
        this.itens.add(Itens.arroz);
        this.itens.add(Itens.feijao);
    }

    public void calculoDeSuporte(){
       for (int i = 0; i < itens.size(); i++) {
        for (int j = i+1; j < itens.size(); j++) {
            System.out.println("suporte item:" + itens.get(i) +" e " + itens.get(j) + " = " + alanalisador.suporteDaOcorrencia(itens.get(i), itens.get(j)));
        }
       }
    }
    
}
