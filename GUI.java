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
		//impostare il layout BorderLayout ponendo il container attuale. contenente il prato come center e il contatore al north.
		//definire contatore e inizializzarlo.
		this.prato = new Cella[righe][colonne];
		for(int i = 0; i < righe; i++) {
			for(int j = 0; j < colonne; j++) {
				prato[i][j] = new Cella();
				this.container.add(prato[i][j]);
			}
		}
		//inserimentoBombe()
		//popolamentoPrato()
		setSize(300,300);
		setVisible(true);
	}

	private void inserimentoBombe() {
		//TODO: data la matrice prato e il container, vengono create le celle e inserite le bombe!
		//ottengo le dimensioni della matrice prato;
		//definisco il numero massimo di bombe da inserire in percetuale 10/64 e poi finché il contatore non è minore (o uguale) a numero massimo assegno causalmente le bombe (-1)
		//ricordandomi che se è già presente devo cambiare riferimenti.

	}
	private void popolamentoPrato() {
		//TODO: data la matrice prato con le bombe inserite, vengono popolate le celle non aventi le bombe!
		//scannerizzo ogni cella e vado a vedere quante bombe ha nell'intorno. dopodiché inserisco tale numero.
	}


}