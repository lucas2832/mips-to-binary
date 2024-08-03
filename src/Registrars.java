import java.util.HashMap;
import java.util.Map;

public class Registrars {
    
    private final Map<String, String> registrars = new HashMap<String, String>();

    public Registrars() {
        registrars.put("at", "00001");
        registrars.put("v0", "00010");
        registrars.put("v1", "00011");
        registrars.put("a0", "00100");
        registrars.put("a1", "00101");
        registrars.put("a2", "00110");
        registrars.put("a3", "00111");

        registrars.put("t0", "01000");
        registrars.put("t1", "01001");
        registrars.put("t2", "01010");
        registrars.put("t3", "01011");
        registrars.put("t4", "01100");
        registrars.put("t5", "01101");
        registrars.put("t6", "01110");
        registrars.put("t7", "01111");

        registrars.put("s0", "10000");
        registrars.put("s1", "10001");
        registrars.put("s2", "10010");
        registrars.put("s3", "10011");
        registrars.put("s4", "10100");
        registrars.put("s5", "10101");
        registrars.put("s6", "10110");
        registrars.put("s7", "10111");

        registrars.put("t8", "10000");
        registrars.put("t9", "10001");
        registrars.put("k0", "10010");
        registrars.put("k1", "10011");
        registrars.put("gp", "10100");
        registrars.put("sp", "10101");
        registrars.put("s8", "10110");
        registrars.put("ra", "10111");

        registrars.put("zero", "00000");
    }

    public String getRegistrar(String key) {
        return registrars.get(key);
    }
}
