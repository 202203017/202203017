
import java.util.Date;
import java.awt.*;
import java.applet.*;
import java.awt.event.*; 

public class HelloWorld extends Applet implements ActionListener {
    TextField n  ;
    String name = " ";

    public void init() {
        n = new TextField(20);
        Label l1 = new Label("Enter the your name");
        Button b1 = new Button("Enter");
        add(l1);
        add(n);
        add(b1);
        b1.addActionListener(this);

    }

    public void paint(Graphics g) {

        g.drawString("Hello " + name, 10, 50);

    }

    public void actionPerformed(ActionEvent e) {
        name = n.getText();
	repaint();
    }
}
