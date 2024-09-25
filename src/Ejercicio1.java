import java.math.BigInteger;

public class Ejercicio1 {
    public void main() {
        int number = 0;
        for (int i = 1; i <= 10; i++) {
            number = number + 1;
            System.out.println("Factorial de " + number + " es: " + factorial(number));
        }


    }

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

}



