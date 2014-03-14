package pnj;

public class Robot {

	private int identifiant;
	private String nom;
	
	public Robot(int id, String nom){
		this.identifiant = id;
		this.nom = nom;
	}
	
	/**
	 * R�cup�re l'id du robot
	 * @return
	 */
	public int getId(){
		return this.identifiant;
	}
	
	/**
	 * Change le nom du robot
	 */
	public void setNom(String nom){
		this.nom = nom;
	}
	/**
	 * R�cup�re le nom du robot
	 * @return
	 */
	public String getNom(){
		return this.nom;
	}
	
	/**
	 * Affiche la premi�re lettre du type de robot
	 * @return
	 */
	public char representation(){
		return this.nom.charAt(0);
	}
}
