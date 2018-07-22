/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freeslots;

import java.util.ArrayList;

/**
 *
 * @author andre
 */
//Clase con metodos complementarios
public class Complemento {

    /*Metodo para sacar un numero random con probabilidades
        1 = 25%
        2 = 20%
        3 = 15%
        4 = 10%
        5 = 5%
     */
    public Complemento() {
    }

    /*
        Metodo para retornar un valor entre 1 y 5
        con las siguientes probabilidades
            
            1 => 25/75
            2 => 20/75
            3 => 15/75
            4 => 10/75
            5 => 5/75
     */
    public static int getRandomImageType() {
        int random = (int) (Math.random() * 75);
        if (random < 25) {
            return 1;
        } else if (random < 45) {
            return 2;
        } else if (random < 60) {
            return 3;
        } else if (random < 70) {
            return 4;
        } else {
            return 5;
        }
    }

    //Metodo para validar si hay iguales utilizando un ArrayList de MICon
    //retornando el total ganado
    public static int validarIconos(ArrayList<MIcon> array_icons) {
        int tmp[] = new int[]{0, 0, 0, 0};
        if ((array_icons.get(0).getType() == 1) && (array_icons.get(1).getType() == 1) && (array_icons.get(2).getType() == 1) && (array_icons.get(3).getType() == 1) && (array_icons.get(4).getType() == 1)) {
            tmp[0] = 1 * 5;
        } else if ((array_icons.get(0).getType() == 2) && (array_icons.get(1).getType() == 2) && (array_icons.get(2).getType() == 2) && (array_icons.get(3).getType() == 2) && (array_icons.get(4).getType() == 2)) {
            tmp[0] = 2 * 5;
        } else if ((array_icons.get(0).getType() == 3) && (array_icons.get(1).getType() == 3) && (array_icons.get(2).getType() == 3) && (array_icons.get(3).getType() == 3) && (array_icons.get(4).getType() == 3)) {
            tmp[0] = 3 * 5;
        } else if ((array_icons.get(0).getType() == 4) && (array_icons.get(1).getType() == 4) && (array_icons.get(2).getType() == 4) && (array_icons.get(3).getType() == 4) && (array_icons.get(4).getType() == 4)) {
            tmp[0] = 4 * 5;
        } else if ((array_icons.get(0).getType() == 5) && (array_icons.get(1).getType() == 5) && (array_icons.get(2).getType() == 5) && (array_icons.get(3).getType() == 5) && (array_icons.get(4).getType() == 5)) {
            tmp[0] = 5 * 5;
        } else if ((array_icons.get(0).getType() == 1) && (array_icons.get(1).getType() == 1) && (array_icons.get(2).getType() == 1) && (array_icons.get(3).getType() == 1)) {
            tmp[0] = 1 * 4;
        } else if ((array_icons.get(0).getType() == 2) && (array_icons.get(1).getType() == 2) && (array_icons.get(2).getType() == 2) && (array_icons.get(3).getType() == 2)) {
            tmp[0] = 2 * 4;
        } else if ((array_icons.get(0).getType() == 3) && (array_icons.get(1).getType() == 3) && (array_icons.get(2).getType() == 3) && (array_icons.get(3).getType() == 3)) {
            tmp[0] = 3 * 4;
        } else if ((array_icons.get(0).getType() == 4) && (array_icons.get(1).getType() == 4) && (array_icons.get(2).getType() == 4) && (array_icons.get(3).getType() == 4)) {
            tmp[0] = 4 * 4;
        } else if ((array_icons.get(0).getType() == 5) && (array_icons.get(1).getType() == 5) && (array_icons.get(2).getType() == 5) && (array_icons.get(3).getType() == 5)) {
            tmp[0] = 5 * 4;
        } else if ((array_icons.get(1).getType() == 1) && (array_icons.get(2).getType() == 1) && (array_icons.get(3).getType() == 1) && (array_icons.get(4).getType() == 1)) {
            tmp[0] = 1 * 4;
        } else if ((array_icons.get(1).getType() == 2) && (array_icons.get(2).getType() == 2) && (array_icons.get(3).getType() == 2) && (array_icons.get(4).getType() == 2)) {
            tmp[0] = 2 * 4;
        } else if ((array_icons.get(1).getType() == 3) && (array_icons.get(2).getType() == 3) && (array_icons.get(3).getType() == 3) && (array_icons.get(4).getType() == 3)) {
            tmp[0] = 3 * 4;
        } else if ((array_icons.get(1).getType() == 4) && (array_icons.get(2).getType() == 4) && (array_icons.get(3).getType() == 4) && (array_icons.get(4).getType() == 4)) {
            tmp[0] = 4 * 4;
        } else if ((array_icons.get(1).getType() == 5) && (array_icons.get(2).getType() == 5) && (array_icons.get(3).getType() == 5) && (array_icons.get(4).getType() == 5)) {
            tmp[0] = 5 * 4;
        } else if ((array_icons.get(0).getType() == 1) && (array_icons.get(1).getType() == 1) && (array_icons.get(2).getType() == 1)) {
            tmp[0] = 1 * 3;
        } else if ((array_icons.get(0).getType() == 2) && (array_icons.get(1).getType() == 2) && (array_icons.get(2).getType() == 2)) {
            tmp[0] = 2 * 3;
        } else if ((array_icons.get(0).getType() == 3) && (array_icons.get(1).getType() == 3) && (array_icons.get(2).getType() == 3)) {
            tmp[0] = 3 * 3;
        } else if ((array_icons.get(0).getType() == 4) && (array_icons.get(1).getType() == 4) && (array_icons.get(2).getType() == 4)) {
            tmp[0] = 4 * 3;
        } else if ((array_icons.get(0).getType() == 5) && (array_icons.get(1).getType() == 5) && (array_icons.get(2).getType() == 5)) {
            tmp[0] = 5 * 3;
        } else if ((array_icons.get(1).getType() == 1) && (array_icons.get(2).getType() == 1) && (array_icons.get(3).getType() == 1)) {
            tmp[0] = 1 * 3;
        } else if ((array_icons.get(1).getType() == 2) && (array_icons.get(2).getType() == 2) && (array_icons.get(3).getType() == 2)) {
            tmp[0] = 2 * 3;
        } else if ((array_icons.get(1).getType() == 3) && (array_icons.get(2).getType() == 3) && (array_icons.get(3).getType() == 3)) {
            tmp[0] = 3 * 3;
        } else if ((array_icons.get(1).getType() == 4) && (array_icons.get(2).getType() == 4) && (array_icons.get(3).getType() == 4)) {
            tmp[0] = 4 * 3;
        } else if ((array_icons.get(1).getType() == 5) && (array_icons.get(2).getType() == 5) && (array_icons.get(3).getType() == 5)) {
            tmp[0] = 5 * 3;
        } else if ((array_icons.get(2).getType() == 1) && (array_icons.get(3).getType() == 1) && (array_icons.get(4).getType() == 1)) {
            tmp[0] = 1 * 3;
        } else if ((array_icons.get(2).getType() == 2) && (array_icons.get(3).getType() == 2) && (array_icons.get(4).getType() == 2)) {
            tmp[0] = 2 * 3;
        } else if ((array_icons.get(2).getType() == 3) && (array_icons.get(3).getType() == 3) && (array_icons.get(4).getType() == 3)) {
            tmp[0] = 3 * 3;
        } else if ((array_icons.get(2).getType() == 4) && (array_icons.get(3).getType() == 4) && (array_icons.get(4).getType() == 4)) {
            tmp[0] = 4 * 3;
        } else if ((array_icons.get(2).getType() == 5) && (array_icons.get(3).getType() == 5) && (array_icons.get(4).getType() == 5)) {
            tmp[0] = 5 * 3;
        } else if ((array_icons.get(5).getType() == 1) && (array_icons.get(6).getType() == 1) && (array_icons.get(7).getType() == 1) && (array_icons.get(8).getType() == 1) && (array_icons.get(9).getType() == 1)) {
            tmp[1] = 1 * 5;
        } else if ((array_icons.get(5).getType() == 2) && (array_icons.get(6).getType() == 2) && (array_icons.get(7).getType() == 2) && (array_icons.get(8).getType() == 2) && (array_icons.get(9).getType() == 2)) {
            tmp[1] = 2 * 5;
        } else if ((array_icons.get(5).getType() == 3) && (array_icons.get(6).getType() == 3) && (array_icons.get(7).getType() == 3) && (array_icons.get(8).getType() == 3) && (array_icons.get(9).getType() == 3)) {
            tmp[1] = 3 * 5;
        } else if ((array_icons.get(5).getType() == 4) && (array_icons.get(6).getType() == 4) && (array_icons.get(7).getType() == 4) && (array_icons.get(8).getType() == 4) && (array_icons.get(9).getType() == 4)) {
            tmp[1] = 4 * 5;
        } else if ((array_icons.get(5).getType() == 5) && (array_icons.get(6).getType() == 5) && (array_icons.get(7).getType() == 5) && (array_icons.get(8).getType() == 5) && (array_icons.get(9).getType() == 5)) {
            tmp[1] = 5 * 5;
        } else if ((array_icons.get(5).getType() == 1) && (array_icons.get(6).getType() == 1) && (array_icons.get(7).getType() == 1) && (array_icons.get(8).getType() == 1)) {
            tmp[1] = 1 * 4;
        } else if ((array_icons.get(5).getType() == 2) && (array_icons.get(6).getType() == 2) && (array_icons.get(7).getType() == 2) && (array_icons.get(8).getType() == 2)) {
            tmp[1] = 2 * 4;
        } else if ((array_icons.get(5).getType() == 3) && (array_icons.get(6).getType() == 3) && (array_icons.get(7).getType() == 3) && (array_icons.get(8).getType() == 3)) {
            tmp[1] = 3 * 4;
        } else if ((array_icons.get(5).getType() == 4) && (array_icons.get(6).getType() == 4) && (array_icons.get(7).getType() == 4) && (array_icons.get(8).getType() == 4)) {
            tmp[1] = 4 * 4;
        } else if ((array_icons.get(5).getType() == 5) && (array_icons.get(6).getType() == 5) && (array_icons.get(7).getType() == 5) && (array_icons.get(8).getType() == 5)) {
            tmp[1] = 5 * 4;
        } else if ((array_icons.get(6).getType() == 1) && (array_icons.get(7).getType() == 1) && (array_icons.get(8).getType() == 1) && (array_icons.get(9).getType() == 1)) {
            tmp[1] = 1 * 4;
        } else if ((array_icons.get(6).getType() == 2) && (array_icons.get(7).getType() == 2) && (array_icons.get(8).getType() == 2) && (array_icons.get(9).getType() == 2)) {
            tmp[1] = 2 * 4;
        } else if ((array_icons.get(6).getType() == 3) && (array_icons.get(7).getType() == 3) && (array_icons.get(8).getType() == 3) && (array_icons.get(9).getType() == 3)) {
            tmp[1] = 3 * 4;
        } else if ((array_icons.get(6).getType() == 4) && (array_icons.get(7).getType() == 4) && (array_icons.get(8).getType() == 4) && (array_icons.get(9).getType() == 4)) {
            tmp[1] = 4 * 4;
        } else if ((array_icons.get(6).getType() == 5) && (array_icons.get(7).getType() == 5) && (array_icons.get(8).getType() == 5) && (array_icons.get(9).getType() == 5)) {
            tmp[1] = 5 * 4;
        } else if ((array_icons.get(5).getType() == 1) && (array_icons.get(6).getType() == 1) && (array_icons.get(7).getType() == 1)) {
            tmp[1] = 1 * 3;
        } else if ((array_icons.get(5).getType() == 2) && (array_icons.get(6).getType() == 2) && (array_icons.get(7).getType() == 2)) {
            tmp[1] = 2 * 3;
        } else if ((array_icons.get(5).getType() == 3) && (array_icons.get(6).getType() == 3) && (array_icons.get(7).getType() == 3)) {
            tmp[1] = 3 * 3;
        } else if ((array_icons.get(5).getType() == 4) && (array_icons.get(6).getType() == 4) && (array_icons.get(7).getType() == 4)) {
            tmp[1] = 4 * 3;
        } else if ((array_icons.get(5).getType() == 5) && (array_icons.get(6).getType() == 5) && (array_icons.get(7).getType() == 5)) {
            tmp[1] = 5 * 3;
        } else if ((array_icons.get(6).getType() == 1) && (array_icons.get(7).getType() == 1) && (array_icons.get(8).getType() == 1)) {
            tmp[1] = 1 * 3;
        } else if ((array_icons.get(6).getType() == 2) && (array_icons.get(7).getType() == 2) && (array_icons.get(8).getType() == 2)) {
            tmp[1] = 2 * 3;
        } else if ((array_icons.get(6).getType() == 3) && (array_icons.get(7).getType() == 3) && (array_icons.get(8).getType() == 3)) {
            tmp[1] = 3 * 3;
        } else if ((array_icons.get(6).getType() == 4) && (array_icons.get(7).getType() == 4) && (array_icons.get(8).getType() == 4)) {
            tmp[1] = 4 * 3;
        } else if ((array_icons.get(6).getType() == 5) && (array_icons.get(7).getType() == 5) && (array_icons.get(8).getType() == 5)) {
            tmp[1] = 5 * 3;
        } else if ((array_icons.get(7).getType() == 1) && (array_icons.get(8).getType() == 1) && (array_icons.get(9).getType() == 1)) {
            tmp[1] = 1 * 3;
        } else if ((array_icons.get(7).getType() == 2) && (array_icons.get(8).getType() == 2) && (array_icons.get(9).getType() == 2)) {
            tmp[1] = 2 * 3;
        } else if ((array_icons.get(7).getType() == 3) && (array_icons.get(8).getType() == 3) && (array_icons.get(9).getType() == 3)) {
            tmp[1] = 3 * 3;
        } else if ((array_icons.get(7).getType() == 4) && (array_icons.get(8).getType() == 4) && (array_icons.get(9).getType() == 4)) {
            tmp[1] = 4 * 3;
        } else if ((array_icons.get(7).getType() == 5) && (array_icons.get(8).getType() == 5) && (array_icons.get(9).getType() == 5)) {
            tmp[1] = 5 * 3;
        } else if ((array_icons.get(10).getType() == 1) && (array_icons.get(11).getType() == 1) && (array_icons.get(12).getType() == 1) && (array_icons.get(13).getType() == 1) && (array_icons.get(14).getType() == 1)) {
            tmp[2] = 1 * 5;
        } else if ((array_icons.get(10).getType() == 2) && (array_icons.get(11).getType() == 2) && (array_icons.get(12).getType() == 2) && (array_icons.get(13).getType() == 2) && (array_icons.get(14).getType() == 2)) {
            tmp[2] = 2 * 5;
        } else if ((array_icons.get(10).getType() == 3) && (array_icons.get(11).getType() == 3) && (array_icons.get(12).getType() == 3) && (array_icons.get(13).getType() == 3) && (array_icons.get(14).getType() == 3)) {
            tmp[2] = 3 * 5;
        } else if ((array_icons.get(10).getType() == 4) && (array_icons.get(11).getType() == 4) && (array_icons.get(12).getType() == 4) && (array_icons.get(13).getType() == 4) && (array_icons.get(14).getType() == 4)) {
            tmp[2] = 4 * 5;
        } else if ((array_icons.get(10).getType() == 5) && (array_icons.get(11).getType() == 5) && (array_icons.get(12).getType() == 5) && (array_icons.get(13).getType() == 5) && (array_icons.get(14).getType() == 5)) {
            tmp[2] = 5 * 5;
        } else if ((array_icons.get(10).getType() == 1) && (array_icons.get(11).getType() == 1) && (array_icons.get(12).getType() == 1) && (array_icons.get(13).getType() == 1)) {
            tmp[2] = 1 * 4;
        } else if ((array_icons.get(10).getType() == 2) && (array_icons.get(11).getType() == 2) && (array_icons.get(12).getType() == 2) && (array_icons.get(13).getType() == 2)) {
            tmp[2] = 2 * 4;
        } else if ((array_icons.get(10).getType() == 3) && (array_icons.get(11).getType() == 3) && (array_icons.get(12).getType() == 3) && (array_icons.get(13).getType() == 3)) {
            tmp[2] = 3 * 4;
        } else if ((array_icons.get(10).getType() == 4) && (array_icons.get(11).getType() == 4) && (array_icons.get(12).getType() == 4) && (array_icons.get(13).getType() == 4)) {
            tmp[2] = 4 * 4;
        } else if ((array_icons.get(10).getType() == 5) && (array_icons.get(11).getType() == 5) && (array_icons.get(12).getType() == 5) && (array_icons.get(13).getType() == 5)) {
            tmp[2] = 5 * 4;
        } else if ((array_icons.get(11).getType() == 1) && (array_icons.get(12).getType() == 1) && (array_icons.get(13).getType() == 1) && (array_icons.get(14).getType() == 1)) {
            tmp[2] = 1 * 4;
        } else if ((array_icons.get(11).getType() == 2) && (array_icons.get(12).getType() == 2) && (array_icons.get(13).getType() == 2) && (array_icons.get(14).getType() == 2)) {
            tmp[2] = 2 * 4;
        } else if ((array_icons.get(11).getType() == 3) && (array_icons.get(12).getType() == 3) && (array_icons.get(13).getType() == 3) && (array_icons.get(14).getType() == 3)) {
            tmp[2] = 3 * 4;
        } else if ((array_icons.get(11).getType() == 4) && (array_icons.get(12).getType() == 4) && (array_icons.get(13).getType() == 4) && (array_icons.get(14).getType() == 4)) {
            tmp[2] = 4 * 4;
        } else if ((array_icons.get(11).getType() == 5) && (array_icons.get(12).getType() == 5) && (array_icons.get(13).getType() == 5) && (array_icons.get(14).getType() == 5)) {
            tmp[2] = 5 * 4;
        } else if ((array_icons.get(10).getType() == 1) && (array_icons.get(11).getType() == 1) && (array_icons.get(12).getType() == 1)) {
            tmp[2] = 1 * 3;
        } else if ((array_icons.get(10).getType() == 2) && (array_icons.get(11).getType() == 2) && (array_icons.get(12).getType() == 2)) {
            tmp[2] = 2 * 3;
        } else if ((array_icons.get(10).getType() == 3) && (array_icons.get(11).getType() == 3) && (array_icons.get(12).getType() == 3)) {
            tmp[2] = 3 * 3;
        } else if ((array_icons.get(10).getType() == 4) && (array_icons.get(11).getType() == 4) && (array_icons.get(12).getType() == 4)) {
            tmp[2] = 4 * 3;
        } else if ((array_icons.get(10).getType() == 5) && (array_icons.get(11).getType() == 5) && (array_icons.get(12).getType() == 5)) {
            tmp[2] = 5 * 3;
        } else if ((array_icons.get(11).getType() == 1) && (array_icons.get(12).getType() == 1) && (array_icons.get(13).getType() == 1)) {
            tmp[2] = 1 * 3;
        } else if ((array_icons.get(11).getType() == 2) && (array_icons.get(12).getType() == 2) && (array_icons.get(13).getType() == 2)) {
            tmp[2] = 2 * 3;
        } else if ((array_icons.get(11).getType() == 3) && (array_icons.get(12).getType() == 3) && (array_icons.get(13).getType() == 3)) {
            tmp[2] = 3 * 3;
        } else if ((array_icons.get(11).getType() == 4) && (array_icons.get(12).getType() == 4) && (array_icons.get(13).getType() == 4)) {
            tmp[2] = 4 * 3;
        } else if ((array_icons.get(11).getType() == 5) && (array_icons.get(12).getType() == 5) && (array_icons.get(13).getType() == 5)) {
            tmp[2] = 5 * 3;
        } else if ((array_icons.get(12).getType() == 1) && (array_icons.get(13).getType() == 1) && (array_icons.get(14).getType() == 1)) {
            tmp[2] = 1 * 3;
        } else if ((array_icons.get(12).getType() == 2) && (array_icons.get(13).getType() == 2) && (array_icons.get(14).getType() == 2)) {
            tmp[2] = 2 * 3;
        } else if ((array_icons.get(12).getType() == 3) && (array_icons.get(13).getType() == 3) && (array_icons.get(14).getType() == 3)) {
            tmp[2] = 3 * 3;
        } else if ((array_icons.get(12).getType() == 4) && (array_icons.get(13).getType() == 4) && (array_icons.get(14).getType() == 4)) {
            tmp[2] = 4 * 3;
        } else if ((array_icons.get(12).getType() == 5) && (array_icons.get(13).getType() == 5) && (array_icons.get(14).getType() == 5)) {
            tmp[2] = 5 * 3;
        } else if ((array_icons.get(15).getType() == 1) && (array_icons.get(16).getType() == 1) && (array_icons.get(17).getType() == 1) && (array_icons.get(18).getType() == 1) && (array_icons.get(19).getType() == 1)) {
            tmp[3] = 1 * 5;
        } else if ((array_icons.get(15).getType() == 2) && (array_icons.get(16).getType() == 2) && (array_icons.get(17).getType() == 2) && (array_icons.get(18).getType() == 2) && (array_icons.get(19).getType() == 2)) {
            tmp[3] = 2 * 5;
        } else if ((array_icons.get(15).getType() == 3) && (array_icons.get(16).getType() == 3) && (array_icons.get(17).getType() == 3) && (array_icons.get(18).getType() == 3) && (array_icons.get(19).getType() == 3)) {
            tmp[3] = 3 * 5;
        } else if ((array_icons.get(15).getType() == 4) && (array_icons.get(16).getType() == 4) && (array_icons.get(17).getType() == 4) && (array_icons.get(18).getType() == 4) && (array_icons.get(19).getType() == 4)) {
            tmp[3] = 4 * 5;
        } else if ((array_icons.get(15).getType() == 5) && (array_icons.get(16).getType() == 5) && (array_icons.get(17).getType() == 5) && (array_icons.get(18).getType() == 5) && (array_icons.get(19).getType() == 5)) {
            tmp[3] = 5 * 5;
        } else if ((array_icons.get(15).getType() == 1) && (array_icons.get(16).getType() == 1) && (array_icons.get(17).getType() == 1) && (array_icons.get(18).getType() == 1)) {
            tmp[3] = 1 * 4;
        } else if ((array_icons.get(15).getType() == 2) && (array_icons.get(16).getType() == 2) && (array_icons.get(17).getType() == 2) && (array_icons.get(18).getType() == 2)) {
            tmp[3] = 2 * 4;
        } else if ((array_icons.get(15).getType() == 3) && (array_icons.get(16).getType() == 3) && (array_icons.get(17).getType() == 3) && (array_icons.get(18).getType() == 3)) {
            tmp[3] = 3 * 4;
        } else if ((array_icons.get(15).getType() == 4) && (array_icons.get(16).getType() == 4) && (array_icons.get(17).getType() == 4) && (array_icons.get(18).getType() == 4)) {
            tmp[3] = 4 * 4;
        } else if ((array_icons.get(15).getType() == 5) && (array_icons.get(16).getType() == 5) && (array_icons.get(17).getType() == 5) && (array_icons.get(18).getType() == 5)) {
            tmp[3] = 5 * 4;
        } else if ((array_icons.get(16).getType() == 1) && (array_icons.get(17).getType() == 1) && (array_icons.get(18).getType() == 1) && (array_icons.get(19).getType() == 1)) {
            tmp[3] = 1 * 4;
        } else if ((array_icons.get(16).getType() == 2) && (array_icons.get(17).getType() == 2) && (array_icons.get(18).getType() == 2) && (array_icons.get(19).getType() == 2)) {
            tmp[3] = 2 * 4;
        } else if ((array_icons.get(16).getType() == 3) && (array_icons.get(17).getType() == 3) && (array_icons.get(18).getType() == 3) && (array_icons.get(19).getType() == 3)) {
            tmp[3] = 3 * 4;
        } else if ((array_icons.get(16).getType() == 4) && (array_icons.get(17).getType() == 4) && (array_icons.get(18).getType() == 4) && (array_icons.get(19).getType() == 4)) {
            tmp[3] = 4 * 4;
        } else if ((array_icons.get(16).getType() == 5) && (array_icons.get(17).getType() == 5) && (array_icons.get(18).getType() == 5) && (array_icons.get(19).getType() == 5)) {
            tmp[3] = 5 * 4;
        } else if ((array_icons.get(15).getType() == 1) && (array_icons.get(16).getType() == 1) && (array_icons.get(17).getType() == 1)) {
            tmp[3] = 1 * 3;
        } else if ((array_icons.get(15).getType() == 2) && (array_icons.get(16).getType() == 2) && (array_icons.get(17).getType() == 2)) {
            tmp[3] = 2 * 3;
        } else if ((array_icons.get(15).getType() == 3) && (array_icons.get(16).getType() == 3) && (array_icons.get(17).getType() == 3)) {
            tmp[3] = 3 * 3;
        } else if ((array_icons.get(15).getType() == 4) && (array_icons.get(16).getType() == 4) && (array_icons.get(17).getType() == 4)) {
            tmp[3] = 4 * 3;
        } else if ((array_icons.get(15).getType() == 5) && (array_icons.get(16).getType() == 5) && (array_icons.get(17).getType() == 5)) {
            tmp[3] = 5 * 3;
        } else if ((array_icons.get(16).getType() == 1) && (array_icons.get(17).getType() == 1) && (array_icons.get(18).getType() == 1)) {
            tmp[3] = 1 * 3;
        } else if ((array_icons.get(16).getType() == 2) && (array_icons.get(17).getType() == 2) && (array_icons.get(18).getType() == 2)) {
            tmp[3] = 2 * 3;
        } else if ((array_icons.get(16).getType() == 3) && (array_icons.get(17).getType() == 3) && (array_icons.get(18).getType() == 3)) {
            tmp[3] = 3 * 3;
        } else if ((array_icons.get(16).getType() == 4) && (array_icons.get(17).getType() == 4) && (array_icons.get(18).getType() == 4)) {
            tmp[3] = 4 * 3;
        } else if ((array_icons.get(16).getType() == 5) && (array_icons.get(17).getType() == 5) && (array_icons.get(18).getType() == 5)) {
            tmp[3] = 5 * 3;
        } else if ((array_icons.get(17).getType() == 1) && (array_icons.get(18).getType() == 1) && (array_icons.get(19).getType() == 1)) {
            tmp[3] = 1 * 3;
        } else if ((array_icons.get(17).getType() == 2) && (array_icons.get(18).getType() == 2) && (array_icons.get(19).getType() == 2)) {
            tmp[3] = 2 * 3;
        } else if ((array_icons.get(17).getType() == 3) && (array_icons.get(18).getType() == 3) && (array_icons.get(19).getType() == 3)) {
            tmp[3] = 3 * 3;
        } else if ((array_icons.get(17).getType() == 4) && (array_icons.get(18).getType() == 4) && (array_icons.get(19).getType() == 4)) {
            tmp[3] = 4 * 3;
        } else if ((array_icons.get(17).getType() == 5) && (array_icons.get(18).getType() == 5) && (array_icons.get(19).getType() == 5)) {
            tmp[3] = 5 * 3;
        }

        return (tmp[0] + tmp[1] + tmp[2] + tmp[3]);
    }
}
