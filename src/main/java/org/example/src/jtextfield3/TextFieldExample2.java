package org.example.src.jtextfield3;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;

import javax.swing.*;

public class TextFieldExample2 extends JFrame {

    private JPanel mainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textFieldResult;
    private JButton btnAddition;
    private JButton btnSubstraction;
    private JLabel labelValueA;
    private JLabel labelValueB;
    private JLabel labelResult;

    public TextFieldExample2() {

        btnAddition.setIcon(new FlatSVGIcon("plus-solid-light.svg", 10,10));
        btnSubstraction.setIcon(new FlatSVGIcon("minus-solid-light.svg", 10, 10));

        btnAddition.addActionListener(e -> {

            String s1 = textField1.getText();
            int a = Integer.parseInt(s1);

            String s2 = textField2.getText();
            int b = Integer.parseInt(s2);

            int c = a + b;

            String result = String.valueOf(c);

            textFieldResult.setText(result);
        });

        btnSubstraction.addActionListener(e -> {

            String s1 = textField1.getText();
            int a = Integer.parseInt(s1);

            String s2 = textField2.getText();
            int b = Integer.parseInt(s2);

            int c = a - b;

            String result = String.valueOf(c);

            textFieldResult.setText(result);
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
