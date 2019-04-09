package catauro.pactico2.ejercicio1.ejercicio2;

public class Electrodomesticos {
    final private double consumoBajo=45;
    final private double altaGama=3;
    private String nombre;
    private String color;
    private double precioBase;
    private double consumo;
    private double peso;

    // constructores
    private void setDefault() {
        color = "gris plata";
        precioBase = 100;
        consumo = 10;
        peso = 2;
    }

    public Electrodomesticos(String nombre, String color, double precio, double consumo, double peso) {
        this.color = color;
        this.nombre = nombre;
        this.consumo = consumo;
        this.peso = peso;
        this.precioBase = precio;
    }

    public Electrodomesticos(String nombre) {
        this.nombre = nombre;
        setDefault();
    }


    // set y gets

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }


    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public String getNombre() {
        return nombre;
    }

    public double getConsumo() {
        return consumo;
    }

    public double getPeso() {
        return peso;
    }


    // funcionalidades
    public boolean bajoConsumo() {return getConsumo()<consumoBajo;}
    public double getBalance (){return getPrecioBase()/getPeso();}
    public boolean esGamaAlta(){return getBalance()>altaGama;}
}



