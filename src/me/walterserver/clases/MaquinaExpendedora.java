package me.walterserver.clases;
import java.util.Hashtable;
import java.util.Queue;

public class MaquinaExpendedora {

    /**
     * @param args the command line arguments
     */
    private double precio;
    private double saldo;
    private Hashtable <char[], Tiquet> ventas;
    private double total;


    /**
     * Constructor de la clase MaquinaExpendedora
     * @param precioProducto
     */
    public MaquinaExpendedora(double precioProducto) {
        precio = precioProducto;
        saldo = 0;
        total = 0;
        ventas = new Hashtable <char[], Tiquet>();
    }


    /**
     * Devuelve el saldo de la maquina
     * @return
     */
    public double getSaldo() {
        return saldo;
    }


    /**
     * Devuelve el precio del producto
     * @return
     */
    public double getPrecio() {
        return precio;
    }


    /**
     * Modifica el precio del producto
     * @param valor
     */
    public void setPrecio(double valor) {
        precio = valor;
    }

    public void insertarMoneda(int valor) {
        if (valor == 5 || valor == 10 || valor == 25 || valor == 100) {
            saldo = saldo + valor;
        } else {
            System.out.println("Moneda no valida");
        }
    }

    public void ConsultarPrecios() {
        if (saldo >= precio) {
            System.out.println("##################");
            System.out.println("# Productos");
            System.out.println("##################");
            System.out.println("# Gracias por su compra");
            System.out.println("##################");
            System.out.println();
            saldo = saldo - precio;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void imprimirTicket() {
        if (saldo >= precio) {
            System.out.println("##################");
            System.out.println("# Producto");
            System.out.println("# Precio: " + precio);
            System.out.println("##################");
            System.out.println("# Gracias por su compra");
            System.out.println("##################");
            System.out.println();
            total = total + precio;
            saldo = saldo - precio;
        } else {
            System.out.println("Saldo insuficiente");
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
