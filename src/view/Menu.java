package view;

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

    public Menu() {
        selecionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser();
                fc.showOpenDialog(JMenu);
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
                    JFrame newFrame = new JFrame("Analisador Léxico");
                    String path = tfPath.getText();
                    newFrame.setContentPane(new LexerOut(cbCount.isSelected(), path).pTela);
                    newFrame.setResizable(false);
                    newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    newFrame.pack();
                    newFrame.setVisible(true);
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
