/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freeslots;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingWorker;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author andre
 */
public class JPFreeSlots extends JPanel {

    //Variables de la clase
    private final ImageIcon img_background = new ImageIcon("background.jpg");
    private ArrayList<MIcon> icons;
    private JPanel jp_icons;
    private final long time_debug = 10;
    private int int_saldo;
    private JLabel jl_saldov;
    private JLabel jl_ganadov;
    private JButton btn_jugar;

    //Contructor de la Clase
    public JPFreeSlots() {

        initComponents();
    }

    //Iniciar Componentes
    private void initComponents() {

        Dimension bg_size = new Dimension(img_background.getImage().getWidth(null), img_background.getImage().getHeight(null));

        this.setPreferredSize(bg_size);
        this.setMaximumSize(bg_size);
        this.setMinimumSize(bg_size);
        this.setSize(bg_size);
        this.setLayout(new MigLayout());

        icons = new ArrayList<>();
        int_saldo = 200;
        initIcons();
        initControls();

    }

    //JPanel Front
    private void initIcons() {
        jp_icons = new JPanel(new MigLayout());
        jp_icons.setBackground(Color.black);

        for (int i = 1; i <= 20; i++) {
            if ((i % 5 != 0)) {
                icons.add(new MIcon(80, 80));
                jp_icons.add(icons.get(i - 1), "align center, pushx, pushy, w 5, h 5");
            } else {
                icons.add(new MIcon(80, 80));
                jp_icons.add(icons.get(i - 1), "align center, pushx, pushy, w 5, h 5, wrap");
            }
        }

        this.add(jp_icons, "west, gapleft 290, gaptop 35, w 560, h 450");

    }

    //JComponents de los controles 
    private void initControls() {
        JLabel jl_saldoh = new JLabel("Saldo:");
        jl_saldoh.setForeground(Color.yellow);
        jl_saldoh.setFont(new Font("chiller", 1, 40));
        this.add(jl_saldoh, "gapleft 50, gaptop 35");
        
        JLabel jl_gandaoh = new JLabel("Ganado:");
        jl_gandaoh.setForeground(Color.yellow);
        jl_gandaoh.setFont(new Font("chiller", 1, 40));
        this.add(jl_gandaoh, "gapleft 0, gaptop 35, wrap");

        jl_saldov = new JLabel(String.valueOf(int_saldo));
        jl_saldov.setForeground(Color.yellow);
        jl_saldov.setFont(new Font("chiller", 1, 30));
        this.add(jl_saldov, "gapleft 50, gaptop 0");
        
        jl_ganadov = new JLabel("0");
        jl_ganadov.setForeground(Color.yellow);
        jl_ganadov.setFont(new Font("chiller", 1, 30));
        this.add(jl_ganadov, "gapleft 0, gaptop 0, wrap");

        btn_jugar = new JButton("Jugar");
        btn_jugar.setBackground(Color.red);
        btn_jugar.setFont(new Font("chiller", 1, 30));
        btn_jugar.addActionListener((e) -> {
            Jugar();
        });
        this.add(btn_jugar, "gapleft 50, gaptop 35, wrap");
        
        //Informacion de iconos
        for (int i = 1; i <= 5; i++) {
            JLabel jl_tmph = new JLabel(String.valueOf(i) + "x ");
            jl_tmph.setForeground(Color.white);
            jl_tmph.setFont(new Font("chiller", 1, 40));
            ImageIcon tmp_img = new ImageIcon(String.valueOf(i) + ".png ");
            JLabel jl_tmpi = new JLabel(new ImageIcon(tmp_img.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
            
            this.add(jl_tmph, "gapleft 150, gaptop 10, pushx");
            this.add(jl_tmpi, "gaptop 10, pushx, wrap");
        }

    }

    //Metodo para Jugar
    private void Jugar() {
        
        SwingWorker<String, Void> jugar = new SwingWorker<String, Void>() {
            @Override
            protected String doInBackground() throws Exception {
                int_saldo -= 5;
                jl_saldov.setText(String.valueOf(int_saldo));
                
                jl_ganadov.setText("0");
                
                for (int i = 0; i < 20; i++) {
                    for (int j = 0; j < 20; j++) {
                        icons.get(j).changeIcon(80, 80);
                        try {
                            Thread.sleep(time_debug);
                        } catch (InterruptedException err) {
                            JOptionPane.showMessageDialog(null, "Algo Salio Mal");
                        }
                    }
                    try {
                        Thread.sleep(time_debug);
                    } catch (InterruptedException err) {
                        JOptionPane.showMessageDialog(null, "Algo Salio Mal");
                    }
                }
                return "Completado";
            }

            @Override
            protected void done() {
                int tmp_ganado = Complemento.validarIconos(icons);
                int_saldo += tmp_ganado;
                
                jl_ganadov.setText(String.valueOf(tmp_ganado));
                jl_saldov.setText(String.valueOf(int_saldo));
                
                if (int_saldo < 5) {
                    JOptionPane.showMessageDialog(null, "No tienes fondos");
                    System.exit(0);
                }
                
            }
        };

        jugar.execute();
    }


    //Dibujar el Background con imagen
    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(img_background.getImage(), 0, 0, this);
    }

}
