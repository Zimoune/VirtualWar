
public class Plateau {

	private int longueur, largeur;
	public Case[][] tableau;
	
	/**
	 * Définit un plateau de taille x, y
	 * @param x
	 * @param y
	 */
	Plateau(int x, int y){
		this.longueur = x;
		this.largeur = y;
		
	}
	
	public int getLongueur(){
		return this.longueur;
	}
	
	public int getLargeur(){
		return this.largeur;
	}
	
	/**
	 * Genère le plateau
	 */
	public void genererPlateau(){
		tableau = new Case[this.longueur][this.largeur];
		for(int i=0; i<this.longueur; i++)
			for(int j=0; j<this.largeur; j++)
				this.tableau[i][j] = new Case(i, j);
	}
	
	public void afficherPlateau(){
		for(int i=0; i<this.longueur; i++){
			System.out.println("-----------------------------------------");
			for(int j=0; j<this.largeur; j++){
				System.out.print("¦");
				System.out.print(tableau[i][j]);		
			}
			System.out.println("¦");
		}
		System.out.println("-----------------------------------------");
	}
	
	public boolean isEmpty(int x, int y){
		if(this.tableau[x][y].isEmpty())
			return true;
			return false;
	}
}
