import java.util.Arrays;
import java.util.List;

public class J {
    
    Instructions instructions = new Instructions();
    List<String> listaJ = Arrays.asList("j", "jal");

    public String toBinary(String[] comands) {
        String binary;
        binary = instructions.getj(comands[0]) + FixBinary.fixBinary(Integer.toBinaryString(Integer.parseInt(comands[1])), 26);
        return binary;
    }

    public boolean isJ(String instruction) {
        return (listaJ.contains(instruction));
    }
}
