package xiejiahong;
  ////////////Ð»¼Òºê//
/////////////////////
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class aka extends JFrame implements ActionListener{
    JTextField jtf;//Lab
    int index=2;//number
    public aka() {
        jtf = new JTextField(15);
        JButton jb = new JButton("Button");//add button
        jb.addActionListener(this);//add event
        add(jtf);
        add(jb);
        setLayout(new FlowLayout());
        setTitle("ME LIST");
        setSize(500, 200);
        setLocationRelativeTo(null);//place the button
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new aka();
         
    }
    public void actionPerformed(ActionEvent e) {
        jtf.setText(index+"");

    }
    
}