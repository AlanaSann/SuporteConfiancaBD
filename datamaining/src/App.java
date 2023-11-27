import model.Analisador;
import model.Compra;
import model.Itens;
import model.Relatorio;


public class App {
    public static void main(String[] args) throws Exception {
      
        Analisador alanalizador = new Analisador();

        Compra compra0 = new Compra();
        Compra compra1 = new Compra();
        Compra compra2 = new Compra();
        Compra compra3 = new Compra();
        Compra compra4 = new Compra();
        Compra compra5 = new Compra();
        Compra compra6 = new Compra();
        Compra compra7 = new Compra();
        Compra compra8 = new Compra();
        Compra compra9 = new Compra();

        compra0.adicionaItem(Itens.leite, false);
        compra0.adicionaItem(Itens.cafe, true);
        compra0.adicionaItem(Itens.cerveja, false);
        compra0.adicionaItem(Itens.pao, true);
        compra0.adicionaItem(Itens.manteiga, true);
        compra0.adicionaItem(Itens.arroz, false);
        compra0.adicionaItem(Itens.feijao, false);


        compra1.adicionaItem(Itens.leite, true);
        compra1.adicionaItem(Itens.cafe, false);
        compra1.adicionaItem(Itens.cerveja, true);
        compra1.adicionaItem(Itens.pao, true);
        compra1.adicionaItem(Itens.manteiga, true);
        compra1.adicionaItem(Itens.arroz, false);
        compra1.adicionaItem(Itens.feijao, false);


        compra2.adicionaItem(Itens.leite, false);
        compra2.adicionaItem(Itens.cafe, true);
        compra2.adicionaItem(Itens.cerveja, false);
        compra2.adicionaItem(Itens.pao, true);
        compra2.adicionaItem(Itens.manteiga, true);
        compra2.adicionaItem(Itens.arroz, false);
        compra2.adicionaItem(Itens.feijao, false);

        compra3.adicionaItem(Itens.leite, true);
        compra3.adicionaItem(Itens.cafe, true);
        compra3.adicionaItem(Itens.cerveja, false);
        compra3.adicionaItem(Itens.pao, true);
        compra3.adicionaItem(Itens.manteiga, true);
        compra3.adicionaItem(Itens.arroz, false);
        compra3.adicionaItem(Itens.feijao, false);


        compra4.adicionaItem(Itens.leite, false);
        compra4.adicionaItem(Itens.cafe, false);
        compra4.adicionaItem(Itens.cerveja, true);
        compra4.adicionaItem(Itens.pao, false);
        compra4.adicionaItem(Itens.manteiga, false);
        compra4.adicionaItem(Itens.arroz, false);
        compra4.adicionaItem(Itens.feijao, false);


        compra5.adicionaItem(Itens.leite, false);
        compra5.adicionaItem(Itens.cafe, false);
        compra5.adicionaItem(Itens.cerveja, false);
        compra5.adicionaItem(Itens.pao, false);
        compra5.adicionaItem(Itens.manteiga, true);
        compra5.adicionaItem(Itens.arroz, false);
        compra5.adicionaItem(Itens.feijao, false);


        compra6.adicionaItem(Itens.leite, false);
        compra6.adicionaItem(Itens.cafe, false);
        compra6.adicionaItem(Itens.cerveja, false);
        compra6.adicionaItem(Itens.pao, true);
        compra6.adicionaItem(Itens.manteiga, false);
        compra6.adicionaItem(Itens.arroz, false);
        compra6.adicionaItem(Itens.feijao, false);


        compra7.adicionaItem(Itens.leite, false);
        compra7.adicionaItem(Itens.cafe, false);
        compra7.adicionaItem(Itens.cerveja, false);
        compra7.adicionaItem(Itens.pao, false);
        compra7.adicionaItem(Itens.manteiga, false);
        compra7.adicionaItem(Itens.arroz, false);
        compra7.adicionaItem(Itens.feijao, true);


        compra8.adicionaItem(Itens.leite, false);
        compra8.adicionaItem(Itens.cafe, false);
        compra8.adicionaItem(Itens.cerveja, false);
        compra8.adicionaItem(Itens.pao, false);
        compra8.adicionaItem(Itens.manteiga, false);
        compra8.adicionaItem(Itens.arroz, true);
        compra8.adicionaItem(Itens.feijao, true);


        compra9.adicionaItem(Itens.leite, false);
        compra9.adicionaItem(Itens.cafe, false);
        compra9.adicionaItem(Itens.cerveja, false);
        compra9.adicionaItem(Itens.pao, false);
        compra9.adicionaItem(Itens.manteiga, false);
        compra9.adicionaItem(Itens.arroz, true);
        compra9.adicionaItem(Itens.feijao, false);
    
        
        alanalizador.addCompra(compra0);

        alanalizador.addCompra(compra1);

        alanalizador.addCompra(compra2);

        alanalizador.addCompra(compra3);

        alanalizador.addCompra(compra4);

        alanalizador.addCompra(compra5);

        alanalizador.addCompra(compra6);

        alanalizador.addCompra(compra7);

        alanalizador.addCompra(compra8);

        alanalizador.addCompra(compra9);
        
        System.out.println(alanalizador.contaOcorrenciaDeUmItem(Itens.leite));
        System.out.println(alanalizador.contaOcorrenciaCombinada(Itens.leite, Itens.pao));
        System.out.println(alanalizador.totalDeOcorrencias());
        System.out.println(alanalizador.suporteDaOcorrencia(Itens.leite, Itens.pao));
        System.out.println(alanalizador.confiancaDaOcorrencia(Itens.leite, Itens.pao));
        
        (new Relatorio(alanalizador)).calculoDeSuporte();
    }
}
