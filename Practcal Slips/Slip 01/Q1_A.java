//  Write a java program to scroll the text from left to right and vice versa continuously using swing.


import java.awt.*;
import javax.swing.*;

public class Q1_A {
    public static void main(String[]args)throws InterruptedException{
        JFrame jf=new JFrame("Scrolling Component");
        jf.setSize(800,600);
        JLabel lab=new JLabel("Hello World!");
        jf.setLayout(null);
        Dimension size=lab.getPreferredSize();
        int x=0;
        boolean reverse = false;
        lab.setBounds(x,jf.getHeight()/2,size.width,size.height);
        jf.add(lab);
        jf.setVisible(true);
        while(true){
            if(x == jf.getWidth()-60 && !reverse)
                reverse = true;
            else if(x==0&& reverse)
                reverse = false;
            if(reverse)
                x--;
            else
                x++;
            lab.setBounds(x,jf.getHeight()/2,size.width,size.height);
            Thread.sleep(10);
        }
    }
}