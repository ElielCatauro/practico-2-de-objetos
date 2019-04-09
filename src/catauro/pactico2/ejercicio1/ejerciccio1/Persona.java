package catauro.pactico2.ejercicio1.ejerciccio1;

// import java.*;
import java.time.*;

public class Persona
{
    final private double maxIMC=25.f;
    final private double minIMC=18.5f;
    private  String nombre="N";
    private String apellido="N";
    private String sexo="F";
    private int dni;
    private double peso=1;
    private double altura=1;
    private LocalDate nacimiento=LocalDate.of(2000,1,1);

    //sets y gets de cada parametro

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre(){return nombre;}
    public String getApellido(){return apellido;}
    public String getSexo(){return sexo;}
    public int getDni(){return dni;}
    public double getPeso(){return peso;}
    public double getAltura(){return altura;}
    public LocalDate getNacimiento(){return nacimiento;}
    public int getEdad(){ return Period.between(nacimiento,LocalDate.now()).getYears();}





    // contructores
    public Persona (int document)
    {
      dni=document;
    }
    public Persona (int document,String nombre ,String apellido )
    {
        dni=document;
        setNombre(nombre);
        setApellido(apellido);
    }
    public Persona (int document,String nombre ,String apellido ,LocalDate fecha)
    {
        dni=document;
        setNombre(nombre);
        setApellido(apellido);
        setNacimiento(fecha);
    }


    //sets y gets de cada parametro

    public void asetNombre(String nombre) {
       this.nombre = nombre;
   }
    public void asetApellido(String apellido) {
        this.apellido = apellido;
    }
    public void asetSexo(String sexo) {
        this.sexo = sexo;
    }
    public void asetDni(int dni) {
        this.dni = dni;
    }
    public void asetPeso(double peso) {
        this.peso = peso;
    }
    public void asetNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }
    public void asetAltura(double altura) {
        this.altura = altura;
    }

    public String agetNombre(){return nombre;}
    public String agetApellido(){return apellido;}
    public String agetSexo(){return sexo;}
    public int agetDni(){return dni;}
    public double agetPeso(){return peso;}
    public double agetAltura(){return altura;}
    public LocalDate agetNacimiento(){return nacimiento;}
    public int gaetEdad(){ return Period.between(nacimiento,LocalDate.now()).getYears();}


    public boolean puedoVotar(){return getEdad()>16;}
    public double iMC(){return (peso/altura*altura);}
    public boolean estaForma(){return (minIMC<iMC() && maxIMC>iMC());}
    public boolean cumpleaños(){return nacimiento.isEqual(LocalDate.now());}
    public boolean esMayor(){return getEdad()>18;}
   // public String toString(){return this.getEdad() + " , " +this.getDni() + " , " + this.getNacimiento() + " " + this.getApellido() + " , " +this.getNacimiento() + " , " +this.getSexo();}


}