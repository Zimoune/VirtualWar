import pnj.TypeRobot;


public class Case extends Plateau{
	
	private char contient = ' ';
	
	public Case(int x, int y){
		super(x, y);
	}
	
	public String toString(){
		return " "+contient+" ";
	}
	
	public void setContient(TypeRobot tr){
		this.contient = tr.representation();
	}
	
	public void setContient(){
		this.contient = 'x';
	}
	public void setPosition(int x, int y){
	}
	
	public char getContient(){
		return this.contient;
	}
	
	public int getPositionX(){
		return this.getPositionX();
	}
	
	public int getPositionY(){
		return this.getPositionY();
	}
	
	public boolean isEmpty(){
		return this.contient == ' ';
	}
	
}
