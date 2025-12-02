package modulo;

public class Estudiante {
    public String nombre;
    private double calif1;
    private double calif2;

    public Estudiante(String nom, double n1, double n2){
        this.nombre=nom;
        this.calif1=n1;
        this.calif2=n2;
    }
    public double promedio(){
        return (this.calif1+calif2)/2;
    }
}
