public class Main {
    public static void main(String[] args) {
        Coche miCoche=new Coche();
        int a,b,c;
        a=1;
        b=2;
        c=3;
        miCoche.incrementarPuertas();
        System.out.println(suma(a,b,c));
        System.out.println(miCoche.puertas);
    }
    public static int suma(int a, int b, int c)
    {
        return a+b+c;
    }
}
class Coche
{
    public int puertas=0;
    public void incrementarPuertas()
    {
        puertas++;
    }
}
