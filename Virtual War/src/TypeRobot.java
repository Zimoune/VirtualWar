
public class TypeRobot extends Robot{
	private String nom;
	private int portee;
	private int deplacement;
	private int energie;
	private int base;
	private int tirer;
	private int avancer;
	private int degat;
	
	TypeRobot(String nom, int portee, int deplacement, int energie,
	int base, int avancer, int degat){
		
		this.nom = nom;
		this.portee = portee;
		this.deplacement = deplacement;
		this.energie = energie;
		this.base = base;
		this.avancer = avancer;
		this.degat = degat;

	}
	
	public String getNom(){
		return this.nom;
	}
	
	public int getPortee(){
		return this.portee;
	}
	
	public int getDeplacement(){
		return this.deplacement;
	}
	
	public int getEnergie(){
		return this.energie;
	}
	
	public int getBase(){
		return this.base;
	}
	
	public int getTirer(){
		return this.tirer;
	}
	
	public int getAvancer(){
		return this.avancer;
	}
	
	public int getDegat(){
		return this.degat;
	}
	public char representation(){
		return this.nom.charAt(0);
	}
}
