import java.awt.*;
import javax.swing.*;

public class GUI extends JFrame {

	private Container container;					//container posto come attributo per semplicità
	private Cella[][] prato;						//matrice di celle

	//costruttore
	public GUI(int righe, int colonne) {
		super("Prato Fiorito");

		this.container = this.getContentPane();							//strutturazione dell'interfaccia
		this.container.setLayout(new GridLayout(righe, colonne));
		// TODO: inserire due pannelli, uno con il contatore e l'altro per il prato!
		this.prato = new Cella[righe][colonne];
		for(int i = 0; i < righe; i++) {
			for(int j = 0; j < colonne; j++) {
				prato[i][j] = new Cella();
				this.container.add(prato[i][j]);
			}
		setSize(300,300);
		setVisible(true);
		}
	}

	private void inserimentoBombe() {
		//TODO: data la matrice prato e il container, vengono create le celle e inserite le bombe!
	}
	private void popolamentoPrato() {
		//TODO: data la matrice prato con le bombe inserite, vengono popolate le celle non aventi le bombe!
	}


}