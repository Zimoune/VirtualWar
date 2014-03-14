
public class Case {
	
	private int positionX;
	private int positionY;
	private char contient = ' ';
	
	public Case(int x, int y){
		this.positionX = x;
		this.positionY = y;
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
		this.positionX = x;
		this.positionY = y;
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
