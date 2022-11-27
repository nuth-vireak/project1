package org.example.src.jlabel;

import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;

public class LabelExample {
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel( new FlatDarculaLaf());
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }

        JFrame frame = new JFrame("Label Example");
        JLabel firstLabel = new JLabel("First Label");
        JLabel secondLabel = new JLabel("Second Label");

        firstLabel.setBounds(100, 50, 200, 30);
        secondLabel.setBounds(100, 100, 200, 30);

        frame.add(firstLabel);
        frame.add(secondLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
