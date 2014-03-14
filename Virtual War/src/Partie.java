import java.util.Random;
import java.util.Scanner;


public class Partie {
	public Plateau jeu = new Plateau(10, 10);
	private Random r = new Random();
	private Scanner sc = new Scanner(System.in);
	private double pourcentageObstacle;
	private int nmbRobotParEquipe;
	private String[] pays = new String[]{"France", "Allemagne", "Italie", "Espagne"};
	private Equipe[] equipes;
	public Partie(){
		
	}
	
	public void lancerPartie(){
		configurationSolo();
		this.jeu = initialiserPartie();
		this.jeu.afficherPlateau();
		System.out.println(equipes[0].toString());
	}
	
	/**
	 * Configuration de la partie solo (coté joueur)
	 */
	private void configurationSolo() {
		System.out.println("===== CONFIGURATION ====");
		this.equipes = new Equipe[2];
		int choixpays;
		System.out.println("Quel pays ?");
		for(int i=1; i<=pays.length; i++){
			System.out.println(i + " . " + pays[i-1]);
		}
		do{
			choixpays = sc.nextInt();
			if(choixpays >= pays.length || choixpays <0)
				System.out.println("Le choix doit être compris entre 1 et "+ (pays.length-1));
		}while(choixpays >= pays.length || choixpays <0);
		equipes[0] = new Equipe(1, pays[choixpays-1]);
		System.out.println("Combien de robot par équipe ?");
		
		do{
			this.nmbRobotParEquipe = sc.nextInt();
				if(nmbRobotParEquipe > 5 || nmbRobotParEquipe <1)
					System.out.println("Il doit y avoir entre 1 et 5 robots");
		}while(nmbRobotParEquipe > 5 || nmbRobotParEquipe <1);
			
	}

	private Plateau initialiserPartie(){
		//On créer un plateau
		this.jeu.genererPlateau();
		//On met des obstacles
		this.initPartieObstacles(this.pourcentageObstacle);
		return this.jeu;
	}
	
	/**
	 * Insert des obstacles d'après un pourcentage
	 * @return
	 */
	public Plateau initPartieObstacles(double pourcentage){
		//Calcul du nombre d'obstacle à ajouter
		int nmbObstacle = (int) (pourcentage/100) * (jeu.getLargeur() * jeu.getLongueur());
		int s = 0;
		int e = 0;
		for(int i=0; i<nmbObstacle; i++){
			do{
				s = r.nextInt(this.jeu.getLargeur());
				e = r.nextInt(this.jeu.getLongueur());
				
			}while(!this.jeu.isEmpty(s, e));

			this.jeu.tableau[s][e].setContient();
		}
		return this.jeu;
	}
	
	

}
