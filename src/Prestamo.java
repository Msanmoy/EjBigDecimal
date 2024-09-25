import java.math.BigDecimal;

public class Prestamo {
    private BigDecimal P;
    private BigDecimal r;
    private int n;

    public Prestamo(BigDecimal P, BigDecimal r, int n) {
        this.P = P;
        this.r = r;
        this.n = n;
    }

    public BigDecimal getP() {
        return P;
    }

    public void setP(BigDecimal p) {
        P = p;
    }

    public BigDecimal getR() {
        return r;
    }

    public void setR(BigDecimal r) {
        this.r = r;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public BigDecimal calcular() {
        BigDecimal resultado;
        BigDecimal a = P.multiply(r).multiply((BigDecimal.ONE.add(r)).pow(n));
        BigDecimal b = BigDecimal.ONE.add(r).pow(n).add(BigDecimal.valueOf(-1));
        resultado = a.divide(b, 10, BigDecimal.ROUND_HALF_UP);
        return resultado;
    }

}
