package employee.management.system;

import javax.swing.*;
import java.awt.*;

public class splash extends JFrame {
    splash(){
        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.gif"));
        Image i2 = I1.getImage().getScaledInstance(1700,800, Image.SCALE_DEFAULT );
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1700,800);
        add(image);


        setSize(1700,800);
        setLocation(250,80);
        setLayout(null);
        setVisible(true);
        try{
        Thread.sleep(5000);
        setVisible(false);
        new Login();
        }catch (Exception e){
            e.fillInStackTrace();
        }
    }
    public static void main(String[] args) {
    new splash();
    }
}