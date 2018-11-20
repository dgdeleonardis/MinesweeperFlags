import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Cella extends JButton {

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