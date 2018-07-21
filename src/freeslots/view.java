/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freeslots;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author Eduardo
 */
public class view {
  public static JFrame jf_main;
    public static JLabel jl_icons = new JLabel("String");
    public static void main(String[] args) 
    {
        jf_main = new JFrame("Mig JFrame");
        jf_main.setPreferredSize(new Dimension(800,600));
        jf_main.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf_main.setLocationRelativeTo(null);
        jf_main.setLayout(new MigLayout("fillx"));
        
        initView();
        jf_main.setVisible(true);
        jf_main.pack();
    }
    
    private static void initView(){
        
        JPanel jp_icons = new JPanel(new MigLayout("debug"));       
        jp_icons.setBackground(new Color(0xffffff));
        JPanel jp_menu = new JPanel(new MigLayout("debug"));
        jp_menu.setBackground(new Color(0x000000));
        
        
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if(j < 4){
                    
                    jp_icons.add(new JLabel(new IconoC().getNumIcon(i)), "align center, pushx, pushy, w 60, h 60");
                }
                else{
                    jp_icons.add(new JLabel(new IconoC().getNumIcon(i)), "align center, pushx, pushy, w 60, h 60, wrap");
                }
            }
        }
        
        jf_main.add(jp_icons, "north, w 100%, h 80%");
        jf_main.add(jp_menu, "south, w 100%, h 20%");
    }
    
}

