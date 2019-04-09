
package catauro.pactico2.ejercicio1.ejercicio3;

public class Punto {

    private double x;
    private double y;


    //constructores
    public Punto(){setDefault();}

    public Punto(double x,double y)
    {
        this.x=x;
        this.y=y;
    }
    private void setDefault()
    {
        this.x=0;
        this.y=0;
    }

    public void trasladar(double x, double y)
    {
        this.x+=x;
        this.y+=y;
    }
    // sets and gets


    public void setY(double y) {
        this.y = y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public double getX() {
        return x;
    }

    public double distanciaEuclidea(Punto dos)
    {
        return Math.sqrt(((this.x-dos.getX())*(this.x-dos.getX()))+((this.x-dos.getY())*(this.x-dos.getY())));
    }

}
