
import static_resources.UiManager;
import listener.CustomKeyListener;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class App {

    public static JFrame frame = new JFrame();

    public static void main(String[] args) throws Exception {
        // initialisation des options des composants
        frame.setTitle("JeuYanis");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.addKeyListener(new CustomKeyListener());
        // attribution du panneau comme contenu principal de la fenetre
        frame.setContentPane(UiManager.panel);

        new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(50);

                    } catch (InterruptedException e) {

                    }

                }

            }

        }).start();

        frame.setVisible(true);

    }
}
