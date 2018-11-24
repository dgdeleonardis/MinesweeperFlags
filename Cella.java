import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Cella extends JButton implements MouseListener {

    private boolean check;
    private int contenuto;
    private boolean bandiera;

	public Cella() {
		super(" ");
        this.contenuto = 0;
		/*this.addActionListener(new ActionListener() {
			@Override
    		public void actionPerformed(ActionEvent e) {	
    			System.out.println("Do Something Clicked");
    		}
    	});*/
    	this.addMouseListener(this);
	}

    public void mouseClicked(MouseEvent e) {
        if (SwingUtilities.isLeftMouseButton(e)) {
            this.setText(Integer.toString(this.contenuto));
        }
        else {
            if (SwingUtilities.isRightMouseButton(e)) {
            }
        }
    }
    public boolean hasBombInside() {
        boolean result = false;
        if(contenuto == -1) {
            result = true;
        }
        return result;
    }

    public void putBomb() {
        this.contenuto = -1;
    }

    public int getContenuto() {
        return this.contenuto;
    }
    public void incrementaContenuto() {
        this.contenuto++;
    }

    public void mousePressed(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
}