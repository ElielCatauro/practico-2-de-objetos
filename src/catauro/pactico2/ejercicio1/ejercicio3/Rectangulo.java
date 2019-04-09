package catauro.pactico2.ejercicio1.ejercicio3;

public class Rectangulo
{
    private Punto v1,v2,v3,v4;


    private double disX=this.v1.distanciaEuclidea(this.v2);
    private double disY=this.v1.distanciaEuclidea(this.v3);
    public Rectangulo(Punto v0,Punto v2,Punto v3,Punto v4)
    {
        this.v1=v0;
        this.v2=v2;
        this.v3=v3;
        this.v4=v4;
    }

    public Rectangulo(Punto v1,Punto v4)
    {
        this.v1=v1;
        this.v4=v4;
        this.v2.setX(v4.getX());
        this.v2.setY(v1.getY());
        this.v3.setY(v4.getY());
        this.v3.setX(v1.getX());
    }
    //gets

    public Punto getV1() {
        return v1;
    }

    public Punto getV3() {
        return v3;
    }

    public Punto getV2() {
        return v2;
    }

    public Punto getV4() {
        return v4;
    }

    public void trasladar(double x, double y)
    {
        this.v1.trasladar(x,y);
        this.v2.trasladar(x,y);
        this.v3.trasladar(x,y);
        this.v4.trasladar(x,y);
    }

    public double getArea()
    {
        return this.v1.distanciaEuclidea(v2)*this.v1.distanciaEuclidea(v3);
    }
    public boolean esCuadrado(){
        return this.v1.distanciaEuclidea(v2)==this.v1.distanciaEuclidea(v3);
    }

    public int esIgual(Rectangulo rec2)
    {
        if(this.getArea()< rec2.getArea()){return -1;}
        else if(this.getArea()< rec2.getArea()){return 1;}
        else return 0;

    }

    public void invertir(int a) {
        switch (a) {
            case 1:
                this.v2.trasladar(-2 * disX, 0);
                this.v3.trasladar(0, -2 * disY);
                this.v4.trasladar(-2 * disX, -2 * disY);
                break;
            case 2:
                this.v1.trasladar(2 * disX, 0);
                this.v3.trasladar(2 * disX, -2 * disY);
                this.v4.trasladar(0, -2 * disY);
                break;
            case 3:
                this.v1.trasladar(0, 2 * disY);
                this.v2.trasladar(-2 * disX, 2 * disY);
                this.v4.trasladar(-2 * disX, 0);
                break;
            case 4:
                this.v1.trasladar(2 * disX, 2 * disY);
                this.v2.trasladar(0, 2 * disY);
                this.v3.trasladar(2 * disX, 0);
                break;
            default:
                break;
        }
    }

        public double getDisX () {
            return disX;
        }

        public double getDisY () {
            return disY;
        }

        public boolean acostado () {
            return disX > disY;
        }
    }
