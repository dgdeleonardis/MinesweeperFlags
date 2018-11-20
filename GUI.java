import java.awt.*;
import javax.swing.*;

public class GUI extends JFrame {

	private Container container;
	private Cella[][] prato;

	
	public GUI(int righe, int colonne) {
		super("Prato Fiorito");
		this.prato = new Cella[righe][colonne];
		this.container = this.getContentPane();
		this.container.setLayout(new GridLayout(righe, colonne));
		for(int i = 0; i < righe; i++) {
			for(int j = 0; j < colonne; j++) {
				prato[i][j] = new Cella();
				this.container.add(prato[i][j]);
			}
		setSize(300,300);
		setVisible(true);
		}
	}
}