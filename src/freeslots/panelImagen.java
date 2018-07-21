
package freeslots;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Eduardo
 */
public class panelImagen extends JPanel {

    class bk implements javax.swing.border.Border {

        private BufferedImage bImage = null;

        public bk(String dir) {
            try {
                bImage = ImageIO.read(new File(dir));
            } catch (IOException ex) {
                Logger.getLogger(panelImagen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        @Override
        public boolean isBorderOpaque() {
            return true;
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(0, 0, 0, 0);
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            if (bImage != null) {
                g.drawImage(bImage, 0, 0, width, height, null);
            }
        }
    }

    public panelImagen(String dir) {
        this.setBorder(new bk(dir));
    }
}
