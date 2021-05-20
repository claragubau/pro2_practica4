package ub.info.prog2.FrancoOriolGubauClara.vista;

/**
 * Classe MercatException
 */
public class MercatException extends Throwable { /*Throwable -> Exception*/
    
    /**
     * Constructor de MercatException que rep com a parametre el missatge de l'excepció
     * @param missatge 
     */
    public MercatException (String missatge){
        super(missatge);
    }
}
