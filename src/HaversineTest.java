import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HaversineTest {

    @Test
    public void testHaversine() {
        BigDecimal latParis = new BigDecimal("48.8566");
        BigDecimal lonParis = new BigDecimal("2.3522");
        BigDecimal latNY = new BigDecimal("40.7128");
        BigDecimal lonNY = new BigDecimal("-74.0060");
        BigDecimal expectedDistance = new BigDecimal("5837");
        BigDecimal actualDistance = Haversine.haversine(latParis, lonParis, latNY, lonNY);
        assertEquals(expectedDistance, actualDistance.setScale(0, BigDecimal.ROUND_HALF_UP));
    }

}