import java.math.MathContext;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class Haversine {
    private static final BigDecimal RADIO_TIERRA_KM = new BigDecimal("6371");
    private static final MathContext mc = new MathContext(34, RoundingMode.HALF_UP);

    public static BigDecimal toRadians(BigDecimal degrees) {
        BigDecimal pi = new BigDecimal(Math.PI, mc);
        return degrees.multiply(pi, mc).divide(new BigDecimal("180"), mc);
    }

    public static BigDecimal haversine(BigDecimal latitude1, BigDecimal longitude1, BigDecimal latitude2, BigDecimal longitude2) {
        // Convertir grados a radianes
        BigDecimal lat1Rad = toRadians(latitude1);
        BigDecimal lon1Rad = toRadians(longitude1);
        BigDecimal lat2Rad = toRadians(latitude2);
        BigDecimal lon2Rad = toRadians(longitude2);

        // Diferencias entre latitudes y longitudes
        BigDecimal dLat = lat2Rad.subtract(lat1Rad, mc);
        BigDecimal dLon = lon2Rad.subtract(lon1Rad, mc);

        // Fórmula de Haversine
        BigDecimal sinLat = Trigonometrica.sin(dLat.divide(new BigDecimal("2"), mc), mc);
        BigDecimal sinLon = Trigonometrica.sin(dLon.divide(new BigDecimal("2"), mc), mc);

        BigDecimal a = sinLat.pow(2, mc).add(Trigonometrica.cos(lat1Rad, mc).multiply(Trigonometrica.cos(lat2Rad, mc), mc).multiply(sinLon.pow(2, mc), mc), mc);
        BigDecimal c = new BigDecimal("2").multiply(Trigonometrica.atan2(Trigonometrica.sqrt(a, mc), Trigonometrica.sqrt(BigDecimal.ONE.subtract(a, mc), mc), mc), mc);

        // Distancia final en kilómetros
        return RADIO_TIERRA_KM.multiply(c, mc);
    }
}
