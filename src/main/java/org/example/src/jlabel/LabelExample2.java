package org.example.src.jlabel;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;

import javax.swing.*;
import java.net.UnknownHostException;

public class LabelExample2 {
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel( new FlatDarculaLaf());
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }

        JFrame frame = new JFrame("Label Example");

        JTextField textField = new JTextField();
        textField.setBounds(100, 50, 300, 40);

        JLabel label = new JLabel();
        label.setBounds(100, 100, 300, 40);

        JButton button = new JButton(new FlatSVGIcon("src/main/resources/back.svg"));
        button.setBounds(100, 150, 300, 40);
        button.addActionListener(e -> {
            String host = textField.getText();
            try {
                String ip = java.net.InetAddress.getByName(host).getHostAddress();
                label.setText("IP of " + host + " is: " + ip);
            } catch (UnknownHostException ex) {
                throw new RuntimeException(ex);
            }
        });

        frame.add(textField);
        frame.add(label);
        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
