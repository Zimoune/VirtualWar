
public class TypeRobot extends Robot{
	private int portee;
	private int deplacement;
	private int energie;
	private int base;
	private int tirer;
	private int avancer;
	private int degat;
	
	public TypeRobot(int id, String nom, int portee, int deplacement, int energie, int base, int avancer, int degat){
		super(id, nom);
		this.portee = portee;
		this.deplacement = deplacement;
		this.energie = energie;
		this.base = base;
		this.avancer = avancer;
		this.degat = degat;

	}
	
	/**
	 * R�cup�re la port�e du robot
	 * @return
	 */
	public int getPortee(){
		return this.portee;
	}
	
	/**
	 * R�cup�re la distance de d�placement du robot
	 * @return
	 */
	public int getDeplacement(){
		return this.deplacement;
	}
	
	/**
	 * R�cup�re l'�nergie du robot
	 * @return
	 */
	public int getEnergie(){
		return this.energie;
	}
	
	/**
	 * R�cup�re la base du robot
	 * @return
	 */
	public int getBase(){
		return this.base;
	}
	
	/**
	 * R�cup�re la distance de tir
	 * @return
	 */
	public int getTirer(){
		return this.tirer;
	}
	
	/**
	 * R�cup�re 
	 * @return
	 */
	public int getAvancer(){
		return this.avancer;
	}
	
	public int getDegat(){
		return this.degat;
	}
}
