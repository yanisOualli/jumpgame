package ui;

import java.awt.Color;
import java.awt.Rectangle;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JPanel;

import static_resources.UiManager;

public class CustomPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        // peindre ici

        g.setColor(Color.white);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.black);
        g.drawLine(-10, 350, 600, 350);
        g.setColor(Color.decode("#03f0fc"));
        g.fillRect(0, 0, getWidth(), getHeight() - 111);
        g.setColor(Color.black);
        g.fillRect(10, 400, 5, 50);
        try {
            final BufferedImage image = ImageIO.read(new File("C:\\Users\\YOUALL\\Desktop\\tree.png"));
            Image Arbre = image.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
            g.drawImage(Arbre, 0, 0, null);
        } catch (IOException e) {
            System.out.println("rgff");
        }

    }

}
