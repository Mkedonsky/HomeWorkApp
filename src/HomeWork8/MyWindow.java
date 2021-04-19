package HomeWork8;

import javax.swing.*;
import java.awt.*;


public class MyWindow extends JFrame {
    public MyWindow(){

        Panel panel = new Panel(new GridLayout(4,4));


        setVisible(true);
//        setSize(500,500);
//        setLocation(450,250);
        setBounds(450,250,500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(panel,BorderLayout.CENTER);
        pack();




    }



}
