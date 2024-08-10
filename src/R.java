import java.util.Arrays;
import java.util.List;

public class R {

    List<String> listaR = Arrays.asList("add", "addu", "sub", "subu", "and", "or", "xor", "nor", "slt", "sltu");
    List<String> listaRNonStandard = Arrays.asList("sll", "srl", "sra", "mfhi", "mthi", "mtlo", "mflo", "mult", "multu", "div", "divu",
    "jr", "jalr", "sllv", "srlv", "srav");

    Instructions instructions = new Instructions();
    Registrars registrars = new Registrars();

    public String toBinary(String[] comands) {
        
        String binary;
        if (listaR.contains(comands[0])) {
            binary = "000000" + registrars.getRegistrar(comands[2]) + registrars.getRegistrar(comands[3])
            + registrars.getRegistrar(comands[1]) + "00000" + instructions.getr(comands[0]);;
        }else if (listaRNonStandard.contains(comands[0])) { // não padões R
            if (comands[0].equals("sll")) { 
                binary = "000000" + "00000" + registrars.getRegistrar(comands[2]) + registrars.getRegistrar(comands[1])
                        + FixBinary.fixBinary(Integer.toBinaryString(Integer.parseInt(comands[3])), 5)
                        + "000000";
    
            } else if (comands[0].equals("srl")) {
                binary = "000000" + "00000" + registrars.getRegistrar(comands[2]) + registrars.getRegistrar(comands[1])
                        + FixBinary.fixBinary(Integer.toBinaryString(Integer.parseInt(comands[3])), 5)
                        + instructions.getr("srl");
    
            } else if (comands[0].equals("sra")) {
                binary = "000000" + "00000" + registrars.getRegistrar(comands[2]) + registrars.getRegistrar(comands[1])
                        + FixBinary.fixBinary(Integer.toBinaryString(Integer.parseInt(comands[3])), 5)
                        + instructions.getr("sra");
    
            } else if (comands[0].equals("mfhi")) {
                binary = "000000" + "00000" + "00000" + registrars.getRegistrar(comands[1]) + "00000"
                        + instructions.getr("mfhi");
    
            } else if (comands[0].equals("mthi")) {
                binary = "000000" + registrars.getRegistrar(comands[1]) + "00000" + "00000" + "00000"
                        + instructions.getr("mthi");
    
            } else if (comands[0].equals("mtlo")) {
                binary = "000000" + registrars.getRegistrar(comands[1]) + "00000" + "00000" + "00000"
                        + instructions.getr("mtlo");
    
            } else if (comands[0].equals("mflo")) {
                binary = "000000" + "00000" + "00000" + registrars.getRegistrar(comands[1]) + "00000"
                        + instructions.getr("mflo");
    
            } else if (comands[0].equals("mult") || comands[0].equals("multu") || comands[0].equals("div")|| comands[0].equals("divu")) {
                binary = "000000" + registrars.getRegistrar(comands[2]) + registrars.getRegistrar(comands[1]) + "00000"
                        + "00000" + instructions.getr(comands[0]);
    
            } else if (comands[0].equals("jr")) {
                binary = "000000" + registrars.getRegistrar(comands[1]) + "00000" + "00000" + "00000"
                        + instructions.getr("jr");
    
            } else if (comands[0].equals("sllv") || comands[0].equals("srlv") || comands[0].equals("srav")) {
                binary = "000000" + "00000" + registrars.getRegistrar(comands[2]) + registrars.getRegistrar(comands[1]) + "00000" + instructions.getr(comands[0]);
    
            }  else if (comands[0].equals("jalr")) {
                binary = "000000" + registrars.getRegistrar(comands[2]) + "00000" + registrars.getRegistrar(comands[1]) + "00000" + instructions.getr("jalr");
    
            } else {
                binary = "Não foi possível traduzir.";
            }
        
        }else {
            binary = "Não foi possível traduzir";
        }
        return binary;
    }

    public boolean isR(String instruction) {
        return (listaR.contains(instruction) || listaRNonStandard.contains(instruction));
    }
}

