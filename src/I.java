import java.util.Arrays;
import java.util.List;

public class I {

    List<String> listaI1 = Arrays.asList("lb", "lh", "lwl", "lw", "sw", "lbu", "lhu", "lwr", "sb", "sh", "swl", "swr"); //Registrador tipo i que possui ()
    List<String> listaI2 = Arrays.asList("addi", "slti", "sltiu", "andi", "ori", "xori"); //Registrador tipo i que não possui ()
    List<String> listaI3 = Arrays.asList("bltz", "bgez", "bltzal", "bgezal", "bgtz", "lui","blez"); // Registradores tipo i sem padrâo
    Instructions instructions = new Instructions();
    Registrars registrars = new Registrars();

    public String toBinary(String[] comands) {
        
        String binary;
        if (listaI1.contains(comands[0])) {
            binary = instructions.geti(comands[0]) + registrars.getRegistrar(comands[3]) + registrars.getRegistrar(comands[1]) + FixBinary.fixBinary(Integer.toBinaryString(Integer.parseInt(comands[2])), 16);
        }else if (listaI2.contains(comands[0])) {
            binary = instructions.geti(comands[0]) + registrars.getRegistrar(comands[2]) + registrars.getRegistrar(comands[1]) + FixBinary.fixBinary(Integer.toBinaryString(Integer.parseInt(comands[3])), 16);
        } else if (comands[0].equals("bltz")) { // não padrões I
            binary = instructions.geti("bltz") + registrars.getRegistrar(comands[1]) + "00000" + FixBinary.fixBinary(Integer.toBinaryString(Integer.parseInt(comands[2])), 16);

        } else if (comands[0].equals("blez")) {
            binary = instructions.geti("blez") + registrars.getRegistrar(comands[1]) + "00000"  + FixBinary.fixBinary(Integer.toBinaryString(Integer.parseInt(comands[2])), 16);

        } else if (comands[0].equals("bgtz")) {
            binary = instructions.geti("bgtz") + registrars.getRegistrar(comands[1]) + "00000" + FixBinary.fixBinary(Integer.toBinaryString(Integer.parseInt(comands[2])), 16);

        } else if (comands[0].equals("bgez")) {
            binary = instructions.geti("bgez") + registrars.getRegistrar(comands[1]) + "00001" + FixBinary.fixBinary(Integer.toBinaryString(Integer.parseInt(comands[2])), 16);

        } else if (comands[0].equals("bltzal")) {
            binary = instructions.geti("bltzal") + registrars.getRegistrar(comands[1]) + "10000" + FixBinary.fixBinary(Integer.toBinaryString(Integer.parseInt(comands[2])), 16);

        } else if (comands[0].equals("bgezal")) {
            binary = instructions.geti("bgezal") + registrars.getRegistrar(comands[1]) + "10001" + FixBinary.fixBinary(Integer.toBinaryString(Integer.parseInt(comands[2])), 16);

        } else if (comands[0].equals("lui")) {
            binary = instructions.geti("lui") + "00000" + registrars.getRegistrar(comands[1]) + FixBinary.fixBinary(Integer.toBinaryString(Integer.parseInt(comands[3])), 16);

        }else {
            binary = "Não foi possível traduzir.";
        }
        return binary;
    }

    public boolean isI(String instruction) {
        return (listaI1.contains(instruction) || listaI2.contains(instruction) || listaI3.contains(instruction));
    }
}
