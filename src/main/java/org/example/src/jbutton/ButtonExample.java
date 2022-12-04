package org.example.src.jbutton;

import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;

public class ButtonExample {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel( new FlatDarculaLaf());
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }

        JFrame jFrame = new JFrame();
        JButton jButton = new JButton();

        jButton.setText("Click Me");
        jButton.setBounds(50, 100, 95, 35);

        jFrame.add(jButton);

        jFrame.setTitle("Button Example");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}
