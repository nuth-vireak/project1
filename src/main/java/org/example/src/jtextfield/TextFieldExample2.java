package org.example.src.jtextfield;

import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldExample2 extends JFrame {

    private JPanel mainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textFieldResult;
    private JButton btnAddition;
    private JButton btnSubstraction;

    public TextFieldExample2() {

        btnAddition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel( new FlatDarculaLaf());
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }

        TextFieldExample2 textFieldExample2 = new TextFieldExample2();

        textFieldExample2.setContentPane(textFieldExample2.mainPanel);
        textFieldExample2.setTitle("TextField Example");
        textFieldExample2.setSize(500, 500);
        textFieldExample2.setLocationRelativeTo(null);
        textFieldExample2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textFieldExample2.setVisible(true);
    }
}
