package ejercicios.ip;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GeneradorIpTest {

    @Test
    public void testGenerarNumero() {
        for (int i = 0; i < 1000; i++) {
            int num = GeneradorIp.generarNumero(0, 254);
            assertTrue(num >= 0 && num <= 254);
        }
    }

    @Test
    public void testGenerarIPV4() {
        for (int i = 0; i < 1000; i++) {
            String ip = GeneradorIp.generarIPV4();
            String[] partes = ip.split("\\.");

            assertEquals(4, partes.length);
            assertNotEquals("0", partes[0]);
            assertNotEquals("0", partes[3]);

            for (String parte : partes) {
                int n = Integer.parseInt(parte);
                assertTrue(n >= 0 && n <= 254);
            }
        }
    }
}
