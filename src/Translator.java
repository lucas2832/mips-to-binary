public class Translator {
    ReaderAndWriter writer = new ReaderAndWriter();
    J j = new J();
    R r = new R();
    I i = new I();

    public String translate(String word) {

        String binary;
        String[] comands = separateComands(word);

        if (i.isI(comands[0])) {
            binary = i.toBinary(comands);
        } else if (r.isR(comands[0])) {
            binary = r.toBinary(comands);
        } else if (j.isJ(comands[0])) {
            binary = j.toBinary(comands);
        } else {
            binary = "Não foi possível traduzir";
        }
        return binary;
    }

    private String[] separateComands(String word) {

        String formattedWord = "";
        String[] comands;
        
        if (word.contains("j")) {
            word = word.replace(" ", ",");
            comands = word.split("[,]");
        } else {
            formattedWord = word.replace("  ", ",");
            formattedWord = formattedWord.replace(" ", "");
            formattedWord = formattedWord.replace("(", ",");
            formattedWord = formattedWord.replace(")", "");
            formattedWord = formattedWord.replace("$", ",");
            formattedWord = formattedWord.replace(",,", ",");
            formattedWord = formattedWord.replace(",,", ",");

            comands = formattedWord.split("[,]");
        }
        return comands;
    }
}
