import java.io.*;

public class ReaderAndWriter {

    public void reader(String txt) {

        try {
            BufferedReader bf = new BufferedReader(new FileReader(txt));
            String linha = bf.readLine();
            while (linha != null) { 
                Translator translate = new Translator();
                linha = translate.translate(linha);
                writer(linha);
                linha = bf.readLine();

            }
            
            bf.close();// Fechar o BufferedReader após a conclusão da leitura do arquivo

        } catch (Exception e) {
            System.out.println("Erro presente: " + e);
        }
    }

    public void writer(String linha) {
        
        if (linha == null) {
            linha = "null";
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/programOut.txt", true))) { // Modo de anexar (append)
            bw.write(linha);
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
