import java.math.BigDecimal;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        System.out.println("Introduce el monto del prestamo");
        Scanner sc = new Scanner(System.in);
        BigDecimal monto = sc.nextBigDecimal();
        System.out.println("Introduce el interes mensual del prestamo");
        BigDecimal interesm= sc.nextBigDecimal();
        System.out.println("Introduce el número total de pagos (en meses)");
        int pagos = sc.nextInt();

        Prestamo prestamo = new Prestamo(monto,interesm,pagos);

        BigDecimal resultado;

        resultado = prestamo.calcular();


       System.out.println(resultado.toString());


        System.out.println("Esquema de amortización");
        System.out.print("------------------------");



    }
}
