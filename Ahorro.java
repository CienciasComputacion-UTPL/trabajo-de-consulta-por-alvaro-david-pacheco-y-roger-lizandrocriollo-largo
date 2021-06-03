package ec.edu.utpl.pro.semana7.banco;


/**

 * Esta clase define objetos que contienen tantos enteros aleatorios entre 0 y 1000 como se le definen al crear un objeto

 * @author: ROGER CRIOLLO Y ALVARO PACHECO
 * @version: 30/05/2021/

 * @see <https://github.com/CienciasComputacion-UTPL/trabajo-de-consulta-por-alvaro-david-pacheco-y-roger-lizandrocriollo-largo/new/master

 */
public class Ahorro extends Cuenta{
    private double interesAnual;

    public Ahorro(double saldo, String numero, double interesAnual) {
        super(saldo, numero);
        this.interesAnual = interesAnual;
    }

    @Override
    public String getNumero() {

        return "CTA-AH-".concat(super.getNumero());
    }

    public double getInteresAnual() {

        return interesAnual;
    }

    private boolean isMontoValido( double monto ) {

        return  monto > 0;
    }

    public void retirar(double monto ) {
        if (isMontoValido(monto) ) {
            setSaldo( getSaldo() - monto);
        } else {
            throw new IllegalArgumentException("el monto no es valido");
        }
    }
}
