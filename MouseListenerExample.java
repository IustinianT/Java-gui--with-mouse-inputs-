import java.awt.*;
import java.awt.event.*;

public class MouseListenerExample extends Frame implements MouseListener, MouseMotionListener {
    Label l, position;
    double scaleX, scaleY;

    MouseListenerExample() {
        addMouseListener(this);
        addMouseMotionListener(this);

        // CREATE LABEL FOR ACTION
        l = new Label();
        l.setBounds(20, 50, 100, 20);
        add(l);

        // CREATE LABEL FOR POSITION
        position = new Label();
        position.setBounds(20, 70, 100, 20);
        add(position);

        setSize(600, 600);
        setLayout(null);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse clicked");
        position.setText("X: " + e.getX() + ", Y: " + e.getY());
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse entered");
        position.setText("X: " + e.getX() + ", Y: " + e.getY());
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse exited");
        position.setText("X: " + e.getX() + ", Y: " + e.getY());
    }

    public void mousePressed(MouseEvent e) {
        l.setText("Mouse pressed");
        position.setText("X: " + e.getX() + ", Y: " + e.getY());
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse released");
        position.setText("X: " + e.getX() + ", Y: " + e.getY());
    }

    public void mouseMoved(MouseEvent e) {
        l.setText("Mouse moving");
        position.setText("X: " + e.getX() + ", Y: " + e.getY());
    }

    public void mouseDragged(MouseEvent e) {
        l.setText("Mouse dragged");
        position.setText("X: " + e.getX() + ", Y: " + e.getY());
    }
}