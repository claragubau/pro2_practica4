package ub.info.prog2.FrancoOriolGubauClara.model;

import ub.info.prog2.FrancoOriolGubauClara.vista.MercatException;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Classe Dades
 */
public class Dades implements InDades, Serializable{
    private LlistaArticles llistaArticles;
    private LlistaClients llistaClients;
    private LlistaComandes llistaComandes;

    public Dades() {
        this.llistaArticles = new LlistaArticles();
        this.llistaComandes = new LlistaComandes();
        this.llistaClients = new LlistaClients();
    }

    /**
     * Mètode per afegir articles
     * @param id String
     * @param nom String
     * @param preu float
     * @param temps int
     * @param admetUrgent boolean
     * @throws MercatException La que llença llistaArticles.afegir(...)
     */
    @Override
    public void afegirArticle(String id, String nom, float preu, int temps, boolean admetUrgent) throws MercatException {
        Article article = new Article(id, nom, preu, temps, admetUrgent);
        llistaArticles.afegir(article);
    }

    /**
     * Mètode per recuperar articles
     * @return List<String>
     */
    @Override
    public List<String> recuperaArticles(){
        List<String> res = new ArrayList<>();
        Iterator it = llistaArticles.llista.iterator();
        int pos = 1;
        while(it.hasNext()){
            res.add("\n[" + String.valueOf(pos) + "] " + it.next().toString());
            pos++;
        }
        return res;
    }

    /**
     * Mètode per afegir un client
     * @param email String
     * @param nom String
     * @param adreca String
     * @param esPremium boolean
     * @throws MercatException la que llença llistaClients.afegir()
     */
    @Override
    public void afegirClient(String email, String nom, String adreca, boolean esPremium) throws MercatException {
        if(esPremium){
            ClientPremium clientPremium = new ClientPremium(nom, email, adreca);
            llistaClients.afegir(clientPremium);
        }else{
            ClientEstandard clientEs = new ClientEstandard(nom, email, adreca);
            llistaClients.afegir(clientEs);
        }
    }

    /**
     * Mètode per recuperar clients
     * @return List<String>
     */
    @Override
    public List<String> recuperaClients(){
        List<String> res = new ArrayList<>();
        Iterator it = llistaClients.llista.iterator();
        int pos = 1;
        while(it.hasNext()){
            res.add("\n[" + String.valueOf(pos) + "]" + it.next().toString());
            pos++;
        }
        return res;
    }

    /**
     * Mètode per afegir una comanda
     * @param articlePos int
     * @param clientPos int
     * @param quantitat int
     * @param esUrgent boolean
     * @throws MercatException Si la comanda d'un article que no admet enviaments urgents es fa urgent o les que envien llistaArticles.getAt(...) i llistaClients.getAt(...)
     */
    @Override
    public void afegirComanda(int articlePos, int clientPos, int quantitat, boolean esUrgent) throws MercatException {
        Article article = llistaArticles.getAt(articlePos);
        Client client = llistaClients.getAt(clientPos);
        Date date = new Date();
        if(esUrgent){
            if(article.isEnviamentUrgent()){
                ComandaUrgent comandaUr = new ComandaUrgent(article, client, quantitat, date);
                llistaComandes.afegir(comandaUr);
            }else{
                throw new MercatException("L'article solicitat no admet comandes urgents.\n");
            }
        }else{
            ComandaNormal comandaNormal = new ComandaNormal(article, client, quantitat, date);
            llistaComandes.afegir(comandaNormal);
        }

    }

    /**
     * Mètode per esborrar una comanda
     * @param position posició de la comanada
     * @throws MercatException Si la comanda ja ha estat enviada o bé el de llistaComandes.esborrar(...) o llistaComandes.getAt(...)
     */
    @Override
    public void esborrarComanda(int position) throws MercatException {
        Comanda comanda = llistaComandes.getAt(position);
        if(comanda.comandaEnviada()){
            throw new MercatException("La comanda ja ha estat enviada. No s'ha pogut eliminar.\n");
        }else{
            llistaComandes.esborrar(comanda);
        }
    }

    /**
     * Mètode per recuperar una comanda
     * @return List<String>
     */
    @Override
    public List<String> recuperaComandes(){
        List<String> res = new ArrayList<>();
        int pos = 1;
        Iterator it = llistaComandes.llista.iterator();
        while(it.hasNext()){
            res.add("\n[" + String.valueOf(pos) + "]" + it.next().toString());
            pos++;
        }
        return res;
    }

    /**
     * Mètode per recuperar les comandes urgents
     * @return List<String>
     */
    @Override
    public List<String> recuperaComandesUrgents(){
        List<String> res = new ArrayList<>();
        Iterator it = llistaComandes.llista.iterator();
        int pos = 1;
        while(it.hasNext()){
            Comanda cmd = (Comanda) it.next();
            if(cmd instanceof ComandaUrgent){
                ComandaUrgent comandaUrgent = (ComandaUrgent) cmd;
                res.add("\n[" + String.valueOf(pos) + "]" + comandaUrgent.toString());
                pos++;
            }
        }
        return res;
    }

    /**
     * Mètode guardaDades que guarda les dades en un fitxer
     * @param camiDesti
     * @throws MercatException Si no es pot guardar el fitxer correctament
     */
    public void guardaDades(String camiDesti) throws MercatException {
        try {
            File fitxer = new File(camiDesti);
            FileOutputStream fout = new FileOutputStream(fitxer);

            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(this);
            oos.close();
            fout.close();
        }catch(FileNotFoundException e){
            throw new MercatException("No s'ha pogut trobar el fitxer.\n");
        }catch(IOException e){
            throw new MercatException("No s'ha pogut guardar el fitxer.\n");
        }
    }

    /**
     * Mètode carregaDades que recupera les Dades guardades a un fitxer
     * @param camiOrigen
     * @return Dades
     * @throws MercatException Si no pot recuperar les dades del fitxer o no el troba.
     */
    public static Dades carregaDades(String camiOrigen) throws MercatException {
        try{
            File fitxer = new File(camiOrigen);
            FileInputStream fin = new FileInputStream(fitxer);

            ObjectInputStream ois = new ObjectInputStream(fin);
            Dades dades = (Dades)ois.readObject();
            ois.close();
            fin.close();
            return dades;
        }catch(FileNotFoundException e){
            throw new MercatException("No s'ha pogut trobar el fitxer.\n");
        }catch(IOException | ClassNotFoundException e){
            throw new MercatException("No s'ha pogut carregar el fitxer.\n");
        }
    }
}