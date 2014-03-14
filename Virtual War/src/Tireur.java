
public class Tireur extends TypeRobot{
	private int tirer = -2;
	
	public Tireur(String nom){
		super(nom, 1, 1, 40, 2, -1, -3);
	}
	
	public int getTirer(){
		return this.tirer;
	}
	
	public String toString(){
		return this.getNom();
	}
}
