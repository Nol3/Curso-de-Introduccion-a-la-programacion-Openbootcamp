public class Main {
    public static void main(String[] args) {

        var resultado = suma(10, 20, 30);

        coche micoche = new coche();
        micoche.MasPuertas();

        System.out.println(resultado);
        System.out.println(micoche.puertas);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

}
class coche {
    public int puertas; {
        puertas = 0;
    }
    public void MasPuertas() {
        this.puertas++;
    }
}