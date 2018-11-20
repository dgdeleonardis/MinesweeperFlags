import java.awt.*;
import javax.swing.*;
import fond.io.InputWindow;

public class ProvaGUI {

	public static void main(String[] args) {
		InputWindow in = new InputWindow();
		GUI userInterface = new GUI(in.readInt("Righe"), in.readInt("Colonne"));
	}
}