/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freeslots;

import javax.swing.JFrame;

/**
 *
 * @author andre
 */
public class JFVentana extends JFrame{
    

    //private ArrayList<JLabel> icons;
    
    public JFVentana(){
        initFrame();
  
    }
    
    private void initFrame(){
        //Variable del panel
        JPFreeSlots jp = new JPFreeSlots();
        
        //Iniciar el JFrame
        this.setSize(1440, 690);
        this.setTitle("FreeSlots");
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //Agregar Panel        
       this.getContentPane().add(jp);
        
        this.setResizable(false);
        
    }
    
    
    
}
