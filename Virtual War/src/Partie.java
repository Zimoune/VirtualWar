import java.util.Random;


public class Partie {
	public Plateau jeu = new Plateau(10, 10);
	private Random r = new Random();
	
	public Partie(){
		
	}
	
	public void lancerPartie(){
		this.jeu = initialiserPartie();
		this.jeu.afficherPlateau();
	}
	
	public Plateau initialiserPartie(){
		//On créer un plateau
		this.jeu.genererPlateau();
		//On met des obstacle (5)
		this.initPartieObstacles();
		return this.jeu;
	}
	
	public Plateau initPartieObstacles(){
		int s = 0;
		int e = 0;
		for(int i=0; i<10; i++){
			do{
				s = r.nextInt(this.jeu.getLargeur());
				e = r.nextInt(this.jeu.getLongueur());
				
			}while(!this.jeu.isEmpty(s, e));

			this.jeu.tableau[s][e].setContient();
		}
		return this.jeu;
	}
	

}
