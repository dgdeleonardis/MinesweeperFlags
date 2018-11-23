import java.awt.*;
import javax.swing.*;

public class GUI extends JFrame {

	private Container container;
	private Cella[][] prato;
	private int totBombe;
	private int countCaselleAperte;

	public GUI(int righe, int colonne) {
		super("Prato Fiorito");

		this.container = this.getContentPane();

		this.container.setLayout(new BorderLayout());
		JPanel topPanel = new JPanel();
		this.container.add(topPanel, BorderLayout.NORTH);
		topPanel.add(new JLabel("HELLOOOOO"));
		JPanel centerPanel = new JPanel();
		this.container.add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(new GridLayout(righe, colonne));
		//definire contatore e inizializzarlo.
		this.prato = new Cella[righe][colonne];
		for(int i = 0; i < righe; i++) {
			for(int j = 0; j < colonne; j++) {
				prato[i][j] = new Cella();
				centerPanel.add(prato[i][j]);
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