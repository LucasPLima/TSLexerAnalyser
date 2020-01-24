package lexicalAnalyser;

import java.io.File;
import java.nio.file.Paths;

public class Generator {

    public static void createLexer(){
        String rootPath = Paths.get("").toAbsolutePath(). toString();
        String subPath = "/src/lexicalAnalyser/";

        String file = rootPath + subPath + "language.lex";

        File sourceCode = new File(file);

        jflex.Main.generate(sourceCode);
    }

    public static void main(String[] args) {
        createLexer();
    }
}
