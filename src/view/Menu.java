package view;

import lexicalAnalyser.Generator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    private JPanel JMenu;
    private JTextField tfPath;
    private JButton selecionarButton;
    private JCheckBox cbCount;
    private JButton analisarButton;
    private JLabel labAviso;
    private String userDirLocation = System.getProperty("user.dir");


    public Menu() {
        Generator.createLexer();
        selecionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFileChooser fc = new JFileChooser(userDirLocation);

                int fcreturn = fc.showOpenDialog(JMenu);

                if (fcreturn != JFileChooser.APPROVE_OPTION) {
                    System.out.println("Command rejected.");
                    return;
                }
                tfPath.setText(fc.getSelectedFile().getAbsolutePath());
                tfPath.setEditable(false);
            }
        });
        analisarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tfPath.getText().length()==0){
                    labAviso.setText("Selecione o arquivo para análise:");
                }else{
                    String path = tfPath.getText();

                    new LexerOutputScreen(path, cbCount.isSelected()).setVisible(true);
                }
            }
        });
    }
    public static void main(String[] args){
        JFrame frame = new JFrame("Analisador Léxico");
        frame.setContentPane(new Menu().JMenu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
