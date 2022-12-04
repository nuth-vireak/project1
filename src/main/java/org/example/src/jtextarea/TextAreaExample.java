package org.example.src.jtextarea;

import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;

public class TextAreaExample extends JFrame{

    private JPanel mainPanel;
    private JTextArea textArea;

    public TextAreaExample() {

    }

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel( new FlatDarculaLaf());
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }

        TextAreaExample textAreaExample = new TextAreaExample();

        textAreaExample.setContentPane(textAreaExample.mainPanel);
        textAreaExample.setTitle("TextArea Example");
        textAreaExample.setSize(500, 500);
        textAreaExample.setLocationRelativeTo(null);
        textAreaExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textAreaExample.setVisible(true);
    }
}
