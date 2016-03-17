package AppliSimu;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

import DomaineVoiture.Voiture;

public class IHMVoiture extends JFrame {

	private Voiture maVoiture;
	private CommandeVoiture maCommandeVoiture;
	private ObserverVoiture observer;
		
	public IHMVoiture(Voiture maVoiture) {
		super();
		this.maVoiture = maVoiture;
		initGraphique();
		this.observer = new ObserverVoiture(this, maVoiture);
	}

	public IHMVoiture() {
		super();
		initGraphique();
		this.maVoiture = null;
		this.observer = null;
	}
	
	private void initGraphique() {
		this.setTitle("Simulateur de Voiture");
		this.setSize(505, 505);

		this.maCommandeVoiture = new CommandeVoiture(this, maVoiture);

		this.setVisible(true);
	}
	
	@Override
	public void paint(Graphics contexteGraphique) {
		super.paint(contexteGraphique);
		contexteGraphique.setColor(Color.red);
		dessinerVoiture(contexteGraphique);
	}


	private void dessinerVoiture(Graphics contexteGraphique) {
		int xPixel = observer.getVoiturePositionPixels();
		contexteGraphique.fillRect(xPixel, 300, 30, 15);
	}
	
}
