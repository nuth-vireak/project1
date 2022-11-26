package org.example.src;

import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {

    private JPanel mainPanel;
    private JButton loginButton;

    public MainForm() {

        setContentPane(mainPanel);
        setTitle("Welcome");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        loginButton.setSize(200, 200);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(mainPanel,"Mother Fucker");
            }
        });
    }

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel( new FlatDarculaLaf());
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }

        MainForm mainForm = new MainForm();
    }
}
