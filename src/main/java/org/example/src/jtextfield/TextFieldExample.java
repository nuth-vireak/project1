package org.example.src.jtextfield;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;

import javax.swing.*;

public class TextFieldExample extends JFrame {

    private JPanel mainPanel;
    private JTextField welcomeToJavatpointTextField;
    private JTextField AWTTutorialTextField;
    private JButton btnSubmit;

    public TextFieldExample() {

        btnSubmit.setIcon(new FlatSVGIcon("src/main/resources/back.svg"));
    }

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel( new FlatDarculaLaf());
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }

        TextFieldExample textFieldExample = new TextFieldExample();

        textFieldExample.setContentPane(textFieldExample.mainPanel);
        textFieldExample.setTitle("TextField Example");
        textFieldExample.setSize(500, 500);
        textFieldExample.setLocationRelativeTo(null);
        textFieldExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textFieldExample.setVisible(true);
    }
}
