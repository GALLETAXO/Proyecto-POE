/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author junom
 */
public class ImagenFondoLogin extends JPanel {
    private Image image;
    private ImageIcon ImagenIcono;
    
    public ImagenFondoLogin(String ruta)
    {
    ImagenIcono = new ImageIcon(ruta);
    }
    
    public void paint(Graphics g)
    {
    image = ImagenIcono.getImage();
    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
    setOpaque(false);
    super.paint(g);
    }

    public void setOpaque(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
