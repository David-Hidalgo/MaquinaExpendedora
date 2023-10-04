import java.util.Hashtable;

public class MaquinaExpendedora {
    protected class Tiquet {
        private double precio;
        private String producto;

        public Tiquet(double precio, String producto) {
            this.precio = precio;
            this.producto = producto;
        }

        public double getPrecio() {
            return precio;
        }

        public String getProducto() {
            return producto;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public void setProducto(String producto) {
            this.producto = producto;
        }
    } 
    private double precio;
    private double saldo;
    private Hashtable <char[], Integer> ventas;
    private double total;

    public MaquinaExpendedora(double precioProducto) {
        precio = precioProducto;
        saldo = 0;
        total = 0;
        ventas = new Hashtable <char[], Integer>();
    }

    public double getSaldo() {
        return saldo;
    }

    public double getPrecio() {
        return precio;
    }

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
