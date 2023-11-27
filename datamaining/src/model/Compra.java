package model;

import java.util.HashMap;

public class Compra {
 
    HashMap<Itens,Boolean> itens = new HashMap<Itens,Boolean>();

    public Boolean getComprado(Itens item){
        return itens.get(item);
    }

    public boolean foramCompradosJuntos(Itens itemX, Itens itemY){
        return getComprado(itemX) && getComprado(itemY);
    }

    public void adicionaItem(Itens item, boolean comprou){
        itens.put(item, comprou);
    }

}
