package model;

import java.util.ArrayList;
import java.util.Collections;

public class Relatorio {
    Analisador alanalisador;
    ArrayList<Itens> itens = new ArrayList<Itens>();
    ArrayList<Condicao> resultados;
    ArrayList<Condicao> destaques = new ArrayList<Condicao>();

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

    public void calculoDeSuporte() {
        ArrayList<Condicao> resultados = new ArrayList<Condicao>();
        for (int i = 0; i < itens.size(); i++) {
            final Itens itemX = itens.get(i);
            for (int j = i + 1; j < itens.size(); j++) {
                final Itens itemY = itens.get(j);
                final double suporte = alanalisador.suporteDaOcorrencia(itemX, itemY);
                System.out.println("suporte item:" + itemX + " e " + itemY + " = "
                        + suporte);
                final Condicao condicaoEmFuncaoDeX = new Condicao(itemX, itemY, suporte);
                final Condicao condicaoEmFuncaoDeY = new Condicao(itemY, itemX, suporte);
                resultados.add(condicaoEmFuncaoDeX);
                resultados.add(condicaoEmFuncaoDeY);
                if (!(suporte < 0.2)) {
                    this.calculoDeConfiaca(itemX, itemY, condicaoEmFuncaoDeX, condicaoEmFuncaoDeY);
                }
            }
        }
        this.resultados = resultados;
        exibeResultadosEmOrdem();
        exibeDestaques();
    }

    public void calculoDeConfiaca(Itens itemX, Itens itemY, Condicao condicaoEmFuncaoDeX,
            Condicao condicaoEmFuncaoDeY) {
        final double resultadoEmFuncaoDeX = alanalisador.confiancaDaOcorrencia(itemX, itemY);
        final double resultadoEmFuncaoDeY = alanalisador.confiancaDaOcorrencia(itemY, itemX);
        System.out.println("confianca item:" + itemX + " e " + itemY + " = "
                + resultadoEmFuncaoDeX);
        condicaoEmFuncaoDeX.setConfianca(resultadoEmFuncaoDeX);
        System.out.println("confianca item:" + itemY + " e " + itemX + " = "
                + resultadoEmFuncaoDeY);
        condicaoEmFuncaoDeY.setConfianca(resultadoEmFuncaoDeY);

        destaques.add(condicaoEmFuncaoDeX);
        destaques.add(condicaoEmFuncaoDeY);
    }

    public void exibeResultadosEmOrdem() {
        for (int i = 0; i < resultados.size(); i++) {
            System.out.println(resultados.get(i).toString());
        }
    }

    public void exibeDestaques() {
        System.out.println("Destaques\n");
        Collections.sort(this.destaques);
        for (int i = 0; i < destaques.size(); i++) {
            System.out.println(destaques.get(i).toString());
        }
        System.out.println("Fim dos Destaques\n");
    }

}
