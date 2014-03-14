import java.util.ArrayList;

import pnj.Char;
import pnj.Robot;


public class Equipe {

	//On créer une liste qui contient les robots de l'équipe
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
	 * Récupère l'id de l'équipe
	 * @return
	 */
	public int getId(){
		return this.id;
	}
	
	/**
	 * Récupère le nom de l'équipe
	 * @return
	 */
	public String getNom(){
		return this.nomPays;
	}
	
	/**
	 * Remplie l'équipe avec un nombre des robots
	 * @param nmbRobot
	 */
	public void remplir(int nmbRobot){
		Robot r;
		for(int i=1; i<=nmbRobot; i++){
			r = new Char(i);
			list.add(r);
		}
		//Si l'équipe est l'ordinateur alors on change l'affiche des équipes
		if(ordinateur)
			robotOrdi();
	}
	
	/**
	 * Change l'affichage des robot si l'équipe est ordinateur
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
