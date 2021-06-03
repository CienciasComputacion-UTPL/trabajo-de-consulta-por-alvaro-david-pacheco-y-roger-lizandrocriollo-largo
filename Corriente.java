package ec.edu.utpl.pro.semana7.banco;


/**

 * Esta clase define objetos que contienen tantos enteros aleatorios entre 0 y 1000 como se le definen al crear un objeto

 * @author: ROGER CRIOLLO Y ALVARO PACHECO
 * @version: 30/05/2021/

 * @see <https://github.com/CienciasComputacion-UTPL/trabajo-de-consulta-por-alvaro-david-pacheco-y-roger-lizandrocriollo-largo/new/master

 */
public class Corriente extends Cuenta{
    private int nroMaxCheques;
    private SecuencialCheque secuencialCh;

    public Corriente(double saldo, String numero) {

        super(saldo, numero);
    }

    public int getNroMaxCheques() {

        return nroMaxCheques;
    }

    public void setNroMaxCheques(int nroMaxCheques) {

        this.nroMaxCheques = nroMaxCheques;
    }

    public SecuencialCheque getSecuencialCh() {

        return secuencialCh;
    }

    public void setSecuencialCh(SecuencialCheque secuencialCh) {

        this.secuencialCh = secuencialCh;
    }
}
