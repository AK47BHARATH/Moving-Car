import java.awt.*;
import java.awt.event.*;
public class Vandi extends Frame implements ActionListener{
int x1,x2;
Button b1,b2,b3,b4,b5;
  Frame f;
public Vandi() 
  {
    
  x1 = 0;
     setTitle("Vandi by Alpha");
  b1 = new Button("Start");
  b1.addActionListener(this);
  add(b1);
   b2 = new Button("Fast");
  b2.addActionListener(this);
  add(b2);
  b3 = new Button("Slow");
  b3.addActionListener(this);
  add(b3);
  b4 = new Button("Reverse");
b4.addActionListener(this);
add(b4);

b5 = new Button("Stop");
b5.addActionListener(this);
add(b5);

setSize(500, 500);
setLayout(new FlowLayout());
setVisible(true);
addWindowListener(new WindowAdapter() {
 public void windowClosing(WindowEvent e) {
  System.exit(0);
}
}
);
}


public void paint(Graphics g) {

  g.drawRect(x1, 70, 90, 50);
  g.drawRect(x1+80, 90, 30, 30);
  g.drawOval(x1, 100, 30, 30);
  g.drawOval(x1+60, 100, 30, 30);
  g.setColor(Color.red);
  g.fillRect(x1, 70, 90, 50);
    g.setColor(Color.yellow);
  g.fillRect(x1+80, 90, 30, 30);
  g.setColor(Color.black);
  g.fillOval(x1, 100, 30, 30);
  g.fillOval(x1+60, 100, 30, 30);
 x1= (x1)+x2;
 try{
 Thread.sleep(10);
 g.clearRect(0,0,500,500);
 repaint();
 } 

catch (Exception e){
System.out.println("Error");
}
}
   public void actionPerformed(ActionEvent e) {

     if ((e.getActionCommand()) == "Start") {
        x2=1;
          }
        if ((e.getActionCommand()) == "Fast") {
        x2=3;
          }
     if ((e.getActionCommand()) == "Slow") {
      x2=2;
      }
        if ((e.getActionCommand()) == "Stop") {
            x2=0;
        }
     if ((e.getActionCommand()) == "Reverse") {
            x2=-1;
        }


    }
public static void main(String args[])
  {
new Vandi();
      System.out.println("---------------------");
  System.out.println("\nWelcome to Vandi by alpha\n");
      System.out.println("-----------------------");
}
}
