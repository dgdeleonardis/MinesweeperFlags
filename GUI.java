import java.awt.*;
import javax.swing.*;
import java.util.Random;

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
		inserimentoBombe();
		setSize(300,300);
		setVisible(true);
	}

	private void inserimentoBombe() {
		Random ran = new Random();
		int celleTotali = this.prato.length * this.prato[0].length;
		this.totBombe = (int) ((double)  celleTotali / 100 * 15);
		int count = totBombe;
		while(count != 0) {
			int rigaRandom = ran.nextInt(this.prato.length);
			int colonnaRandom = ran.nextInt(this.prato[0].length);
			if(!this.prato[rigaRandom][colonnaRandom].hasBombInside()) {
				this.prato[rigaRandom][colonnaRandom].putBomb();
				incrementatoreIntorno(rigaRandom, colonnaRandom);
				count--;
			}
		}
 
	}
	private void incrementatoreIntorno(int h, int k) {
		//TODO: data la matrice prato con le bombe inserite, vengono popolate le celle non aventi le bombe!
		//scannerizzo ogni cella e vado a vedere quante bombe ha nell'intorno. dopodiché inserisco tale numero.
		for(int i = h - 1; i <= h + 1; i++) {
			for(int j = k - 1; j <= k + 1; j++) {
				if(((i >= 0 && i < this.prato.length) && (j >= 0 && j < this.prato[0].length)) && !(this.prato[i][j].hasBombInside())) {
					this.prato[i][j].incrementaContenuto();
				}
			}
		}
	}


}