package model;

public class Condicao {

    private final Itens itemX;
    private final Itens itemY;
    private final double suporte;
    private Double confianca;

    public Condicao(Itens itemX, Itens itemY, double suporte) {
        this.itemX = itemX;
        this.itemY = itemY;
        this.suporte = suporte;
    }

    public Itens getItemX() {
        return itemX;
    }

    public Itens getItemY() {
        return itemY;
    }

    public double getSuporte() {
        return suporte;
    }

    public double getConfianca() {
        return confianca;
    }

    public void setConfianca(double confianca) {
        this.confianca = confianca;
    }

    public String stringDeRespostaDeConfianca() {
        if (this.suporte < 0.2) {
            return "Suporte muito baixo";
        }
        return this.confianca + "";
    }

    @Override
    public String toString() {
        return "Condicao itemX=" + itemX + ", itemY=" + itemY + ", suporte=" + suporte + ", confianca="
                + stringDeRespostaDeConfianca();
    }

}
