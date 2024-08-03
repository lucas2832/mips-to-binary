import java.util.HashMap;
import java.util.Map;

public class Instructions {
    
    private final Map<String, String> i = new HashMap<String, String>();
    private final Map<String, String> r = new HashMap<String, String>();
    private final Map<String, String> j = new HashMap<String, String>();

    public Instructions() {
        i.put("lb", "100000");
        i.put("lh", "100001");
        i.put("lwl", "100010");
        i.put("lw", "100011");
        i.put("lbu", "100100");
        i.put("lhu", "100101");
        i.put("lwr", "100110");
        i.put("sb", "101000");
        i.put("sh", "101001");
        i.put("swl", "101010");
        i.put("sw", "101011");
        i.put("swr", "101110");
        i.put("addi", "001000");
        i.put("addiu", "001001");
        i.put("slti", "001010");
        i.put("sltiu", "001011");
        i.put("andi", "001100");
        i.put("ori", "001101");
        i.put("xori", "001110");
        i.put("lui", "001111");
        i.put("bltz", "000001");
        i.put("bgez", "000001");
        i.put("beq", "000100");
        i.put("bne", "000101");
        i.put("blez", "000110");
        i.put("bgtz", "000111");
        i.put("bltzal", "000001");
        i.put("bgezal", "000001");

        r.put("add", "100000");
        r.put("addu", "100001");
        r.put("sub", "100010");
        r.put("subu", "100011");
        r.put("and", "100100");
        r.put("or", "100101");
        r.put("xor", "100110");
        r.put("nor", "100111");
        r.put("slt", "101010");
        r.put("sltu", "101011");
        r.put("sllv", "000100");
        r.put("srlv", "000110");
        r.put("srav", "000111");
        r.put("sll", "000000");
        r.put("srl", "000010");
        r.put("sra", "000011");
        r.put("mfhi", "010000");
        r.put("mthi", "010001");
        r.put("mflo", "010010");
        r.put("mtlo", "010011");
        r.put("mult", "011000");
        r.put("multu", "011001");
        r.put("div", "011010");
        r.put("divu", "011011");
        r.put("jr", "001000");
        r.put("jarl", "001001");

        j.put("j", "000010");
        j.put("jal", "000011");
    }

    public String geti(String key) {
        return i.get(key);
    }

    public String getr(String key) {
        return r.get(key);
    }

    public String getj(String key) {
        return j.get(key);
    }
}
