package org.example.src.jbutton;

import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.*;

public class ButtonExample3 {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel( new FlatDarculaLaf());
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }


        JFrame frame = new JFrame("Button Example");

        ImageIcon imageIcon = setImageSize();
        JButton button = new JButton(imageIcon);

        button.setBounds(100, 200, 280, 50);

        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    //create a function to resize the image
    public static ImageIcon setImageSize(){
        ImageIcon icon = new ImageIcon("src/main/java/org/example/src/jbutton/img.png");
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(40, 40, Image.SCALE_SMOOTH);

        return new ImageIcon(newImg);
    }
}
