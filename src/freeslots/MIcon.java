/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freeslots;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author andre
 */
public class MIcon extends JLabel{
    private int icon_type;
    
    public MIcon(int x, int y){
        super.setIcon(selectIcon(x, y));
    }
    
    private ImageIcon getRandomImage(){
        int i = Complemento.getRandomImageType();
        this.icon_type = i;
        ImageIcon tmp_icon;
        switch(i){
            case 1:
                tmp_icon = new ImageIcon("1.png");
                break;
            case 2:
                tmp_icon = new ImageIcon("2.png");
                break;
            case 3:
                tmp_icon = new ImageIcon("3.png");
                break;
            case 4:
                tmp_icon = new ImageIcon("4.png");
                break;
            default:
                tmp_icon = new ImageIcon("5.png");
                break;
        }
        
        return tmp_icon;
    }
    
    
    private ImageIcon selectIcon(int x, int y){        
        return new ImageIcon(getRandomImage().getImage().getScaledInstance(x, y, Image.SCALE_SMOOTH));
    }
    
    public void changeIcon(int x, int y){
        this.setIcon(new ImageIcon(getRandomImage().getImage().getScaledInstance(x, y, Image.SCALE_SMOOTH)));
    }
    
    public int getType(){
        return this.icon_type;
    }
    
}
