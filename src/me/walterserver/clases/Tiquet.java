package me.walterserver.clases;
public class Tiquet {

    //Atributos

    private double precio;
    private char[] tipo ={'a','b','c'};

    //Constructores

    public Tiquet() {
        this.precio = precio;
        this.tipo = tipo;
    }
    public Tiquet(double precio, char[] tipo) {
        this.precio = precio;
        this.tipo = tipo;
    }

    //Metodos

    public double getPrecio() {
        return precio;
    }

    public char[] getProducto() {
        return tipo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setProducto(char[] tipo) {
        this.tipo = tipo;
    }
}
