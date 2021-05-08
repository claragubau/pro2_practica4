package prog2.model;

import java.io.Serializable;

/**
 * Classe Client Estandard
 */
public class ClientEstandard extends Client implements Serializable {

    /**
     * Constructor Client Premium
     * @param correuElectronic String correu electrònic
     * @param nom String nom
     * @param correuPostal String correu postal
     */
    public ClientEstandard(String nom, String correuElectronic, String correuPostal) {
        super(nom, correuElectronic, correuPostal);
    }

    /**
     * Mètode per determinar el tipus de client
     * @return String tipus
     */
    @Override
    public String tipusClient() {
        return "Estandard";
    }

    /**
     * Mètode per calcular la mensualitat
     * @return float mensualitat
     */
    @Override
    public float calcMensual() {
        return 0;
    }

    /**
     * Mêtode per calcular el descompte de l'enviament
     * @return float amb el descompte
     */
    @Override
    public float descompteEnv() {
        return 0;
    }
}
