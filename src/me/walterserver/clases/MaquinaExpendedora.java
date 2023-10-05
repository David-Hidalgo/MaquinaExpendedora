package me.walterserver.clases;
import java.util.Hashtable;
import java.util.Queue;

public class MaquinaExpendedora {

    private Queue<Tiquet> tiquets;
    private double saldo;
    private double total;
    private Hashtable <char[], Tiquet> ventas;


    /**
     * Constructor de la clase MaquinaExpendedora
     * @param precioProducto
     */
    public MaquinaExpendedora() {
        tiquets = null ;
        saldo = 0;
        total = 0;
        ventas = new Hashtable <char[], Tiquet>();
    }

    //Metodos

    //hacer cargar tiquets

    /**
     * Devuelve el saldo de la maquina
     * @return
     */
    public double getSaldo() {
        return saldo;
    }

    public void insertarMoneda(int valor) {
        if (valor == 5 || valor == 10 || valor == 25 || valor == 100) {
            saldo = saldo + valor;
        } else {
            System.out.println("Moneda no valida");
        }
    }

    public double getTotal() {
        return total;
    }

    public double vaciarCajaRegistradora() {
        double dinero = total;
        total = 0;
        return dinero;
    }
}
