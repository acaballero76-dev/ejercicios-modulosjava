public class Main {
    private static double n1;

    public static double calcularPromedio(double n1, double n2)
    {
        Main.n1 = n1;
        return (n1+n2)/2;
    }
    public static String obtenerEstado(double p){
        String estado;
        if(p>70){
            estado="Aprobo";
        }
        else{
            estado="Reprobo";
        }
        return estado;
    }
    public static void main(String[] args) {
        double calif1=70.0;
        double calif2=80.5;
        double promedio=calcularPromedio(calif1,calif2);
        String estado=obtenerEstado(promedio);
        System.out.println("Promedio:"+promedio);
        System.out.println("Estado:"+estado);

    }
}
