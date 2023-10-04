package me.walterserver.clases;
public class Tiquet {

    //Atributos

    private double precio;
    private String producto;

    //Constructores

    public Tiquet(double precio, String producto) {
        this.precio = precio;
        this.producto = producto;
    }

    //Metodos

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
