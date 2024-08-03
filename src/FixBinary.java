public class FixBinary {

    public static String fixBinary(String binary, int size) {

        if (binary.length() < size) {
            int diferenca = size - binary.length();
            for (int i = 0; i < diferenca; i++) {
                binary = "0" + binary;
            }
        } else if (binary.length() > size) {
            String last16 = binary.substring(binary.length() - size);
            binary = last16;
        }

        return binary;
        
    }
}
