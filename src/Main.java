//motor extendes combustion implementa SistemaEnfreamiento.
public class Main{
    public static void main (String[] args) {
        Motor motor= new Motor();
        System.out.println("++++++++++++");
        motor.gasolina();
    

        System.out.println("hay dos tipos de enfreamiento :");
        motor.agua();
        motor.forzada();
    }
}