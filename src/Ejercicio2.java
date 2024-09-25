import java.math.BigDecimal;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        //Interes compuesto

        BigDecimal p;
        BigDecimal r = new BigDecimal("0.05"); // Interes anual;
        int n; // NºAños;
        BigDecimal c; // Cantidad depositada al final;

        System.out.print("Ingrese el monto inicial: ");
        Scanner sc = new Scanner(System.in);
        p = sc.nextBigDecimal();
        System.out.print("Ingrese el número de años: ");
        n = sc.nextInt();

        BigDecimal x = r.add(BigDecimal.valueOf(1));
        c = p.multiply(x.pow(n)).setScale(10, BigDecimal.ROUND_HALF_UP);

        System.out.println("El monto final es: " + c.toString());

    }


}
