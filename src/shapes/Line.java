
package shapes;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

public class Line extends Shape implements Cloneable { // extend shape class and override its method as a line instance and implements Cloneable to make clone of a line
    private int x1,y1;
    private int x2,y2;
  
    public Line(int x1, int y1, int x2, int y2, Color color,boolean fill) {
        super(color,fill);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    
    @Override
    public void draw(Graphics g) { // draw a line
       g.setColor(getColor());
       g.drawLine(x1,y1,x2,y2);
    }   

    @Override
        public boolean contains(int x, int y) { // check if a line contains a pressed point
        if(x1!=x2 && y1!=y2)
        {
            JOptionPane.showMessageDialog(null, "Selected...");
            return (y-y1)/(y2-y1)==(x-x1)/(x2-x1);
        }
        else if(y1==y2)
        {
            JOptionPane.showMessageDialog(null, "Selected...");
            return (y==y1 && ((x>=x1 && x<=x2) || (x<=x1 && x>=x2)));
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Selected...");
            return (x==x1 && ((y>=y1 && y<=y2) || (y<=y1 && y>=y2)));
        }
    
    }
    @Override   
    public Object clone() throws CloneNotSupportedException {  // make a clone of a line
       shapes.Line l =( shapes.Line)super.clone(); 
       JOptionPane.showMessageDialog(null, "Copied...");
       return l;
    }
    
}
