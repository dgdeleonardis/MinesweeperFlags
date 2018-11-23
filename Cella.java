import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Cella extends JButton {

    //boolean per verificare che sia stato già scoperto
    //valore int che indica il valore assegnato al di sopra (-1 bomba, 0/8 bombe nell'intorno)
    //


	public Cella() {
		super("1");
		/*this.addActionListener(new ActionListener() {
			@Override
    		public void actionPerformed(ActionEvent e) {	
    			System.out.println("Do Something Clicked");
    		}
    	});*/
    	this.addMouseListener(new MouseAdapter() {
    		public void mouseClicked(MouseEvent e){
       			if (SwingUtilities.isLeftMouseButton(e)) {
            		System.out.println("left");
        		}
        		else {
            		if (SwingUtilities.isRightMouseButton(e)) {
            			System.out.println("right");
            		}
        		}
    		}
		});
	}
}