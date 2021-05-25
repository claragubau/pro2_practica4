package ub.info.prog2.FrancoOriolGubauClara.controlador;

import ub.info.prog2.FrancoOriolGubauClara.model.*;
import ub.info.prog2.FrancoOriolGubauClara.vista.MercatException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 * Classe Controlador
 */
public class Controlador {
    Dades dades;
    
    /**
     * Constructor classe Controlador
     * @param dades dades
     */
    public Controlador(){
        this.dades = new Dades();
    }

    /**
     * Mètode per afegir un article
     * @param id string
     * @param nom string
     * @param preu float
     * @param tempsEnviament int
     * @param enviamentUrgent boolean
     * @throws MercatException Quan rep un preu o un temps d'enviament menor o igual a 0, o bé la que llença dades.afegirArticles(...)
     */
    public void afegirArticle(String id, String nom, float preu,
                              int tempsEnviament, boolean enviamentUrgent) throws MercatException {
        if (preu <= 0){
            throw new MercatException("El preu ha de ser un valor positiu. No ens podem permetre perdues.\n");
        }else if (tempsEnviament <= 0){
            throw new MercatException("El temps d'enviament ha de ser un valor positiu.\n");
        }else{
            dades.afegirArticle(id, nom, preu, tempsEnviament, enviamentUrgent);
        }
    }

    /**
     * Mètode per visualitzar la llista d'articles
     * @return string
     */
    public List<String> visualitzarArticles(){
        return dades.recuperaArticles();
    }

    /**
     * Mètode per afegir un client
     * @param nom string
     * @param email string
     * @param adreca string
     * @param esPremium boolean
     * @throws MercatException La que llença dades.afegirClient
     */
    public void afegirClient(String nom, String email, String adreca, boolean esPremium) throws MercatException{
        dades.afegirClient(email, nom, adreca, esPremium);
    }

    /**
     * Mètode per visualitzar la llista de clients
     * @return string
     */
    public List<String> visualitzarClients() {
        return dades.recuperaClients();
    }


    /**
     * Mètode per afegir una comanda
     * @param articlePos int
     * @param clientPos int
     * @param quantitat int
     * @param esUrgent boolean
     * @throws MercatException Si la quantitat és menor o igual a 0 i la que llença afegirComanda(...)
     */
    public void afegirComanda(int articlePos, int clientPos, int quantitat, boolean esUrgent) throws MercatException {
        if(quantitat <= 0){
            throw new MercatException("La quantitat d'articles ha de ser positiva.\n");
        }else{
            dades.afegirComanda(articlePos-1, clientPos-1, quantitat, esUrgent);
        }
    }

    /**
     * Mètode per visualitzar les comandes
     * @return list<string>
     */
    public List<String> visualitzarComandes(){
        return dades.recuperaComandes();
    }

    /**
     * Mètode per visualitzar les comandes urgents
     * @return list<string>
     */
    public List<String> visualitzarComandesUrgents(){
        return dades.recuperaComandesUrgents();
    }

    /**
     * Mètode per esborrar una comanda
     * @param position int posicio
     * @throws MercatException Les que llença dades.esborrarComanda(...)
     */
    public void esborrarComanda(int position) throws MercatException {
        dades.esborrarComanda(position-1);
    }
    
    /**
     * Metode guardarMercat per guardar les dades
     * @param camiDesti
     * @throws MercatException la 
     */
    public void guardarMercat(String camiDesti) throws MercatException {
        dades.guardaDades(camiDesti);
    }
    
    /**
     * Metode carregarMercat per recuperar les dades
     * @param camiOrigen
     * @throws MercatException La que llença dades.carregaDades
     */
    public void carregarMercat(String camiOrigen) throws MercatException {
        dades = Dades.carregaDades(camiOrigen);
    }
}
