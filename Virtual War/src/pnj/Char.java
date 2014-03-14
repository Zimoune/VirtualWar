package pnj;


public class Char extends TypeRobot{
	private int tirer = -1;
	
	public Char(int id){
		super(id, "Char", 10, 2, 60, 2, -10, -6);
	}
	
	/**
	 * Récupère l'énergie que consomme un tir
	 */
	public int getTirer(){
		return this.tirer;
	}
	
	public String toString(){
		return super.toString();
	}
}
