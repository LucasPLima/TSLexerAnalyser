package view;

import typeScript.TSLexicalAnalyser;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class LexerOutputScreen extends JFrame {

    private JLabel lbTable;
    private JLabel lbTokens;
    private JLabel lbTotal;
    private JLabel lbtxtArea;

    private JTable tokenTable;
    private JTextArea txtArea;


    private ArrayList<String[]> tokens;
    private HashMap<String, Integer> totalTokens;
    private TSLexicalAnalyser lexer;

    private JPanel mainPainel;


    public LexerOutputScreen(String filePath, boolean countTokens) throws HeadlessException {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.tokens = new ArrayList<>();
        this.totalTokens = new HashMap<>();
        this.lexer =  new TSLexicalAnalyser(filePath);

        initComp();
        initLexer(countTokens);
    }

    private void initLexer(boolean countTokens) {

        StringBuilder text = new StringBuilder();

        try {
            this.tokens = this.lexer.getTokenTable();
            String[] columns_ ={"Key","Value","Line"};
            Object[][] data = new Object[tokens.size()][columns_.length];

            for (int i = 0; i < tokens.size(); i++) {
                String[] element = tokens.get(i);
                text.append("<").append(element[0]).append(",").append(element[1]).append(">\t").append(" (linha ").append(element[2]).append(")");
                text.append("\n");
                data[i][0] = element[0];
                data[i][1] = element[1];
                data[i][2] = element[2];
            }
            if (countTokens) {
                this.totalTokens = this.lexer.getCountTokens(tokens);
                String columns[] = {"Key", "Value"};

                DefaultTableModel countModel = new DefaultTableModel(null, columns);
                lbTable.setVisible(true);


                for (String key : totalTokens.keySet()){
                    System.out.println("Type:"+key+"| Total:"+totalTokens.get(key));
                    countModel.addRow(new Object[]{key, totalTokens.get(key)});
                }

                tokenTable = new JTable();
                tokenTable.setModel(countModel);
                JScrollPane scrollPane2 = new JScrollPane(tokenTable);
                scrollPane2.setBounds(new Rectangle(5, 490, 570, 150));
                mainPainel.add(scrollPane2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        updateTextArea(text.toString());
    }

    private void initComp() {
        this.setSize(new Dimension(600, 700));
        this.setTitle("Lexer Analyzer");
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        mainPainel = new JPanel();
        mainPainel.setLayout(null);


        lbTable = new JLabel("Totais de Tokens:");
        lbTable.setBounds(new Rectangle(5, 470, 100, 30));

        lbtxtArea = new JLabel("Tokens gerados - (<TIPO, valor> (linha))");
        lbtxtArea.setBounds(new Rectangle(5, 20, 400, 30));
        txtArea = new JTextArea();
        txtArea.setEditable(false);
        txtArea.setLineWrap(true);
        txtArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(txtArea);
        scrollPane.setBounds(new Rectangle(5, 80, 570, 350));



        mainPainel.add(lbTable);
        mainPainel.add(lbtxtArea);
        mainPainel.add(scrollPane);
        this.setContentPane(mainPainel);

    }
    private void updateTextArea(String text) {

        this.txtArea.setText(text);
    }


}

