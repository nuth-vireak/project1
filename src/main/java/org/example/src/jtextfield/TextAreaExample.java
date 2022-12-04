package org.example.src.jtextfield;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;

import javax.swing.*;

public class TextAreaExample extends JFrame {

    private JPanel mainPanel;
    private JTextField welcomeToJavatpointTextField;
    private JTextField AWTTutorialTextField;
    private JButton btnSubmit;

    public TextAreaExample() {

        btnSubmit.setIcon(new FlatSVGIcon("back.svg"));
    }

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel( new FlatDarculaLaf());
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }

        TextAreaExample textAreaExample = new TextAreaExample();

        textAreaExample.setContentPane(textAreaExample.mainPanel);
        textAreaExample.setTitle("TextField Example");
        textAreaExample.setSize(500, 500);
        textAreaExample.setLocationRelativeTo(null);
        textAreaExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textAreaExample.setVisible(true);
    }
}
