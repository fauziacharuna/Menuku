package com.fauziachmadharuna;

/**
 * Created by fauziachmadharuna on 9/26/17.
 */
import javax.swing.*;
import java.awt.*;
public class TestCardLayout extends JFrame {
    JPanel p1;
    JPanel p2;
    JRadioButton pil1,pil2,pil3;
    ButtonGroup radioGroup;
    JTextArea g;
    public TestCardLayout(){
        super("Uji Coba Card Layout");
        p1=new JPanel();
        p2=new JPanel();
        pil1=new JRadioButton("Pilihan 1",true);
        pil2=new JRadioButton("Pilihan 2",false);
        pil3=new JRadioButton("Pilihan 3",false);

        p1.add(pil1);
        p1.add(pil2);
        p1.add(pil3);
        radioGroup=new ButtonGroup();
        radioGroup.add(pil1);
        radioGroup.add(pil2);
        radioGroup.add(pil3);
        g=new JTextArea("text area ");
        p2.add(g);
        JTabbedPane tab= new JTabbedPane();
        tab.add(p1, "Tab dengan radio Button");
        tab.add(p2,"Tab dengan Text Area");
        Container c= getContentPane();
        c.add(tab, BorderLayout.NORTH);
    }
    public static void main(String[]args){
        TestCardLayout tc1=new TestCardLayout();
        tc1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tc1.setSize(500,100);
        tc1.setVisible(true);
    }
}
