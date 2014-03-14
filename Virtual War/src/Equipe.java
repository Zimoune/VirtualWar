import java.util.ArrayList;

import pnj.Char;
import pnj.Robot;


public class Equipe {

	//On cr�er une liste qui contient les robots de l'�quipe
	private ArrayList<Robot> list = new ArrayList<Robot>();
	private int id;
	private String nomPays;
	private boolean ordinateur = false;
	
	public Equipe(int numEquip, String nom, boolean b){
		this.id = numEquip;
		this.nomPays = nom;
	}
	
	public Equipe(int numEquip, String nom){
		this.id = numEquip;
		this.nomPays = nom;
	}
	
	/**
	 * R�cup�re l'id de l'�quipe
	 * @return
	 */
	public int getId(){
		return this.id;
	}
	
	/**
	 * R�cup�re le nom de l'�quipe
	 * @return
	 */
	public String getNom(){
		return this.nomPays;
	}
	
	/**
	 * Remplie l'�quipe avec un nombre des robots
	 * @param nmbRobot
	 */
	public void remplir(int nmbRobot){
		Robot r;
		for(int i=1; i<=nmbRobot; i++){
			r = new Char(i);
			list.add(r);
		}
		//Si l'�quipe est l'ordinateur alors on change l'affiche des �quipes
		if(ordinateur)
			robotOrdi();
	}
	
	/**
	 * Change l'affichage des robot si l'�quipe est ordinateur
	 * Les majuscules sont les joueurs et minuscule ordinateur
	 */
	private void robotOrdi(){
		for(Robot r:list){
			r.setNom(r.getNom().toLowerCase());
		}
	}
	
	public String toString(){
		return this.nomPays + "("+this.id+")";
	}
}
