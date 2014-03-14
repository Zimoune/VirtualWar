
public class Piegeur extends TypeRobot{

	private int miner = -2;
	
	public Piegeur(int id){
		super(id, "Piegeur", 1, 1, 50, 2, -2, -2);
	}
	
	public int getMiner(){
		return this.miner;
	}
	
	public String toString(){
		return super.toString();
	}
	
}
