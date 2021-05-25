package ub.info.prog2.FrancoOriolGubauClara.model;

import java.util.Date;

/**
 * Classe Comanda normal
 */
public class ComandaNormal extends Comanda{
    float descEnviament = 1 - client.descompteEnv()/100;
    int dosDies = 2*24*3600*1000;
    float tempsEnviament = article.getTempsEnviament()*60*1000;
    Date dataActual = new Date();
    float tempsRestant = dataActual.getTime() - dataComanda.getTime();

    /**
     * Constuctor Comanda Normal
     * @param article Article
     * @param client Client
     * @param quantitat int
     * @param dataComanda Date
     */

    public ComandaNormal(Article article, Client client, int quantitat, Date dataComanda) {
        super(article, client, quantitat, dataComanda);
    }

    /**
     * Mètode per saber de quin tipus és la comanda
     * @return String
     */
    @Override
    public String tipusComanda() {
        return "Normal";
    }

    /**
     * Mètode per saber si la comanda ha estat enviada
     * @return boolean
     */
    @Override
    public boolean comandaEnviada() {
            return tempsRestant >= tempsEnviament;
        }

    /**
     * Mètode per saber si la comanda ha estat rebuda
     * @return boolean
     */
    @Override
    public boolean comandaRebuda() {
        if(this.comandaEnviada()){
            return tempsRestant >= tempsEnviament + dosDies;
        }else{
            return false;
        }
    }

    /**
     * Mètode per saber el preu de l'enviament
     * @return float
     */
    @Override
    public float preuEnviament() {
        return descEnviament;
    }


}
