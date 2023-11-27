package model;

import java.util.ArrayList;
import java.util.List;

public class Analisador {
    
    List<Compra> compras = new ArrayList<Compra>();
    int totalDeCompras;

    public int totalDeOcorrencias(){
        return totalDeCompras = compras.size();
    }

    public int contaOcorrenciaDeUmItem(Itens item){
        int sum = 0;
        for(int i = 0;i<compras.size();i++){
            if(compras.get(i).getComprado(item)){
                sum++;
            }
        }
        return sum;
    }

    public int contaOcorrenciaCombinada(Itens itemX, Itens itemY){
        int contador = 0;
            for(int i = 0;i<compras.size();i++){
                if(compras.get(i).foramCompradosJuntos(itemX, itemY)){
                    contador++;
            }
        }
        return contador;
    }
    
    public double suporteDaOcorrencia(Itens itemX, Itens itemY){
        return (double)contaOcorrenciaCombinada(itemX, itemY)/(double)totalDeOcorrencias();
    }

    public double confiancaDaOcorrencia(Itens itemX, Itens itemY){
        return (double)contaOcorrenciaCombinada(itemX, itemY)/(double)contaOcorrenciaDeUmItem(itemX);
    }

    public void addCompra(Compra compra){
        this.compras.add(compra);
    }

}
