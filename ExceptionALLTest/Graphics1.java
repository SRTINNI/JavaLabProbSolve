 
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class Graphics1 extends JPanel
{
    public void paintComponent(Graphics g)
    {
        g.setColor(Color.yellow);
       // g.drawOval(20, 20, 100, 100);
        g.fillOval(10,10, 100, 100);
        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);
        g.fillOval(50, 110, 120, 60);
        g.setColor(Color.yellow);
        
        
    }
}