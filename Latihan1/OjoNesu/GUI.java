package OjoNesu;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args) {
        // String name = JOptionPane.showInputDialog("Enter your name");
        // JOptionPane.showMessageDialog(null, "Heayyy euy" + name);

        // int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        // JOptionPane.showMessageDialog(null, "Your are " + age + "years old");

        // double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your heigt"));
        // JOptionPane.showMessageDialog(null, "Youre are" +height+ "cm tall"); 
        JFrame frame = new JFrame();
        frame.setTitle("GUI Programming eeuy");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(500, 500);
        frame.setVisible(true);

        ImageIcon gmbr = new ImageIcon("pOjoNesu\\potongOK.jpg");
        frame.setIconImage(gmbr.getImage());
    }
}