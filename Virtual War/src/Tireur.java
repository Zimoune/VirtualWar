
public class Tireur extends TypeRobot{
	private int tirer = -2;
	
	public Tireur(int id){
		super(id, "Tireur", 1, 1, 40, 2, -1, -3);
	}
	
	public int getTirer(){
		return this.tirer;
	}
	
	public String toString(){
		return super.toString();
	}
}
