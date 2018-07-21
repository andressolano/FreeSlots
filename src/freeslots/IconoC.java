/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freeslots;

import javax.swing.ImageIcon;

/**
 *
 * @author Eduardo
 */
public class IconoC {
    private ImageIcon icon;
    
    public ImageIcon getNumIcon(int Icono){
        switch(Icono){
            case 0:
                icon = new ImageIcon("icon1.png");
            break;
             
            case 1:
                icon = new ImageIcon("icon2.png");
            break;
            
            case 2:
                icon = new ImageIcon("icon3.png");
            break;
            
            case 3:
                icon = new ImageIcon("icon4.png");
            break;
            
            case 4:
                icon = new ImageIcon("icon5.png");
            break;
           
            case 5:
                icon = new ImageIcon("icon6.png");
            break;
           
            case 6:
                icon = new ImageIcon("icon7.png");
            break;
            
            case 7:
                icon = new ImageIcon("icon8.png");
            break;
            
        }
        return icon;
    }
}
