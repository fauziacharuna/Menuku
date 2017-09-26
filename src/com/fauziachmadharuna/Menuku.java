package com.fauziachmadharuna;

/**
 * Created by fauziachmadharuna on 9/26/17.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Menuku extends JFrame {

    private JLabel tampil;
    private JMenuItem item;

    public Menuku(){//konstruktor untuk create
        tampil=new JLabel("tidak ada menu",JLabel.CENTER);
        JMenuBar menuBar=new JMenuBar();
        this.setJMenuBar(menuBar);
        JMenu menu1= new JMenu("menu 1");
        JMenu menu2=new JMenu("menu 2");
        menuBar.add(menu1);
        menuBar.add(menu2);

        JMenuItem menuItem1 = new JMenuItem("Menu item 1");
        item=new JMenuItem("item");
        JMenuItem menuItem2=new JMenuItem("Menu item 2");
        JMenuItem menuItem3=new JMenuItem("Menu item 3");
        JMenuItem menuKeluar=new JMenuItem("keluar");

        menu1.add(menuItem1);
        menu2.add(menuItem2);
        menu1.add(menuKeluar);
        menu2.add(menuItem3);
        this.getContentPane().add(tampil,BorderLayout.CENTER);

    }
    public static void main(String[]args){
        Menuku menu=new Menuku();
        menu.show();
    }
}
