package view;
import lexicalAnalyser.Generator;
import typeScript.TSLexicalAnalyser;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


public class LexerOut{
    private ArrayList<String[]> tokenTable;
    private HashMap<String, Integer> totals;
    private JTable tbToken;
    public  JPanel pTela;
    private JTextArea textArea1;
    private JTable tbTotals;
    private JLabel lblTokens;
    private JLabel lblTotais;
    private JScrollPane textPane;
    ;
    public LexerOut(boolean countTokens, String filePath){
        tokenTable = new ArrayList<>();
        totals = new HashMap<>();
        StringBuilder text = new StringBuilder();
        Generator.createLexer();
        TSLexicalAnalyser Lexer = new TSLexicalAnalyser(filePath);
        //pTela.setLayout(null);
        try {
            tokenTable = Lexer.getTokenTable();
            tbToken.setEnabled(true);
            tbToken.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

            JScrollPane tablePane = new JScrollPane(tbToken);
            JScrollPane textPane = new JScrollPane(textArea1);

            String[] columns ={"Key","Value","Line"};
            Object[][] data = new Object[tokenTable.size()][columns.length];

            for (int i=0; i<tokenTable.size();i++) {
                String[] element = tokenTable.get(i);
                text.append("<").append(element[0]).append(",").append(element[1]).append(">");
                text.append("\n");
                data[i][0] = element[0];
                data[i][1] = element[1];
                data[i][2] = element[2];
            }
            //noinspection BoundFieldAssignment
            tbToken = new JTable(data, columns);
            textArea1.setText(text.toString());
            textPane.add(textArea1);

            System.out.println(text.toString());

            textPane.setVisible(true);

            if (countTokens) {
                totals = Lexer.getCountTokens(tokenTable);
                DefaultTableModel countModel = new DefaultTableModel();
                String[] totalColumns = {"Type","Total"};
                lblTotais.setVisible(false);
                tbTotals.setVisible(false);

                for(String col:totalColumns)
                    countModel.addColumn(col);

                for (String key : totals.keySet()){
                    System.out.println("Type:"+key+"| Total:"+totals.get(key));
                    countModel.addRow(new Object[]{key, totals.get(key)});
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
