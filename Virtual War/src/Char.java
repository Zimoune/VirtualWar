
public class Char extends TypeRobot{
	private int tirer = -1;
	
	public Char(String nom){
		super(nom, 10, 2, 60, 2, -10, -6);
	}
	
	public int getTirer(){
		return this.tirer;
	}
	
	public String toString(){
		return this.getNom();
	}
}
