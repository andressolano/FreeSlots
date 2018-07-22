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
//Clase para crear iconos aleatorios en base a 5 iconos
//con la capacidad de adaptarse con parametros de altura y ancho
public class MIcon extends JLabel {

    //Atributo que contiene el identificador del icono
    private int icon_type;

    //Constructor de la clase con parametros de 
    //x ancho
    //y alto
    public MIcon(int x, int y) {

        //Crea un JLabel y despues se le asigna un Icono
        super.setIcon(selectIcon(x, y));
    }

    //Metodo que retorna un ImageIcon de forma aleatoria
    //y establece el identificador de imageicon
    private ImageIcon getRandomImage() {

        //Identificador del tipo de icono
        int i = Complemento.getRandomImageType();
        this.icon_type = i;

        //Creacion del Image icon
        ImageIcon tmp_icon;
        switch (i) {
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

    //Metodo utilizado para instanciar la clase redimencionando altura y ancho
    private ImageIcon selectIcon(int x, int y) {
        return new ImageIcon(getRandomImage().getImage().getScaledInstance(x, y, Image.SCALE_SMOOTH));
    }

    //Metodo utilizado para cambiar el icono asociado al JLabel
    public void changeIcon(int x, int y) {
        this.setIcon(new ImageIcon(getRandomImage().getImage().getScaledInstance(x, y, Image.SCALE_SMOOTH)));
    }

    //Metodo para obtener el identificador del icono asociado
    public int getType() {
        return this.icon_type;
    }

}
