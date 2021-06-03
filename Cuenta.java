package ec.edu.utpl.pro.semana7.banco;

import java.time.LocalDate;
/**
 * @author: Roger Criollo, Alvaro Pacheco
 * @version: 30/05/2021
 * @see:<a href = "https://github.com/CienciasComputacion-UTPL/trabajo-de-consulta-por-alvaro-david-pacheco-y-roger-lizandrocriollo-largo" /> GitHub.com – Documentacion con JavaDoc </a>
 */
public class Cuenta {
    private double saldo;
    protected String numero;
    private LocalDate fechaApertura;
    /**

     * Constructor para el numero de cuenta y saldo de la misma

     * @param numero El parámetro numero define el número de la cuenta
     * @param saldo El parámetro saldo define el saldo de la cuenta

     */
    public Cuenta(double saldo, String numero) {
        setSaldo(saldo);
        this.numero = numero;
        fechaApertura = LocalDate.now();
    }

    public double getSaldo() {

        return saldo;
    }

    public void setSaldo(double saldo) {
        if ( !validarSaldoNoNegativo() ) {
            this.saldo = saldo;

        }else {
            throw new IllegalArgumentException("Saldo negativo");
        }
    }

    public String getNumero() {

        return numero;
    }

    public void setNumero(String numero) {

        this.numero = numero;
    }
    /**

     * Método que valida si el saldo es negativo

     */
    private boolean validarSaldoNoNegativo() {

        return saldo < 0;
    }
    /**

     * Método que valida si el monto es mayor a 0
     * @param monto El parámetro monto define el monto a depositar en la cuenta
     */
    public void depositar(double monto) {
        if (monto > 0 ) {
            this.saldo = this.saldo + monto;
        } else {
            throw new IllegalArgumentException("Monto Negativo");
        }
    }
}