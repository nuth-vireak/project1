package org.example.src.jtextarea;

import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaExample2 extends JFrame {

    private JPanel mainPanel;
    private JTextArea textArea;
    private JButton buttonCountWord;
    private JLabel labelWordCount;
    private JLabel labelCharacterCount;

    public TextAreaExample2() {
        buttonCountWord.addActionListener(e -> {
            String text = textArea.getText();
            String words[] = text.split("\\s");

            labelWordCount.setText("Words: " + words.length);
            labelCharacterCount.setText("Characters: " + text.length());
        });
    }

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel( new FlatDarculaLaf());
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }

        TextAreaExample2 textAreaExample2 = new TextAreaExample2();

        textAreaExample2.setContentPane(textAreaExample2.mainPanel);
        textAreaExample2.setTitle("TextArea Example2");
        textAreaExample2.setSize(500, 500);
        textAreaExample2.setLocationRelativeTo(null);
        textAreaExample2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textAreaExample2.setVisible(true);
    }
}
