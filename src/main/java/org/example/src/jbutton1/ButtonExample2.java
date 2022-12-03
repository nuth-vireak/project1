package org.example.src.jbutton1;

import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonExample2 {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel( new FlatDarculaLaf());
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }

        JFrame frame = new JFrame("Button Example");
        JTextField textField = new JTextField();
        JButton button = new JButton();

        textField.setBounds(100, 100, 280, 35);

        button.setText("Click Here");
        button.setBounds(100,150, 280, 35);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = "Welcome to Javatpoint";
                textField.setText(text);
            }
        });

        frame.add(textField);
        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
