package typeScript;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import lexicalAnalyser.LexicalAnalyzer;

import util.Token;

public class TSLexicalAnalyser {
    private ArrayList<String[]> tokenTable;
    private HashMap<String, Integer> tokenTotals;
    private LexicalAnalyzer lexical;

    public TSLexicalAnalyser(String filePath){
        try {
            this.tokenTable = new ArrayList<>();
            this.tokenTotals = new HashMap<>();
            this.lexical = new LexicalAnalyzer(new FileReader(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<String[]> getTokenTable() throws IOException{
        Token lexicalToken;
        while ((lexicalToken = this.lexical.yylex()) != null) {
            System.out.println("Value:"+lexicalToken.value);
            this.tokenTable.add(new String[] {lexicalToken.name, lexicalToken.value, String.valueOf(lexicalToken.line)});
        }
        return this.tokenTable;
    }
    public HashMap<String, Integer> getCountTokens(ArrayList<String[]> tokenTable){
        Integer actualCount;
        this.tokenTotals.clear();

        for (String[] element : tokenTable) {
            if (this.tokenTotals.containsKey(element[0])) {
                actualCount = this.tokenTotals.get(element[0]);
                this.tokenTotals.put(element[0], actualCount + 1);
            }else {
                this.tokenTotals.put(element[0], 1);
            }
        }

        return this.tokenTotals;
    }
    public static void main(String[] args){
        ArrayList<String[]> table;
        HashMap<String, Integer> totals;
        TSLexicalAnalyser tsLex = new TSLexicalAnalyser("C:\\Users\\lucas\\IdeaProjects\\TSLexerAnalyser\\src\\exemplos\\exemplo1.ts");
        try {
            table = tsLex.getTokenTable();
            totals = tsLex.getCountTokens(table);
            System.out.println("Totals:");
            for (String i : totals.keySet()){
                System.out.println("Key:"+i+" Value:"+totals.get(i));
            }
            System.out.println("Table:");
            for(int i=0; i<table.size(); i++){
                String[] line = table.get(i);
                System.out.println("Pos("+i+")| Line: "+line[0]+"|"+line[1]+"|"+line[2]);
            }

        } catch (IOException e ){
            e.getStackTrace();
        }
    }
}