import java.util.Scanner;


public class Menu {

	private static Scanner sc = new Scanner(System.in);
	
	public Menu(){
		
	}
	
	public static int afficherMenu() {
        System.out.println("=========== VIRTUAL WAR ==========");
        System.out.println("\t 1) Lancer la partie");
        System.out.println("\t 2) Quitter");
        System.out.println("=======================================");
        int choice = sc.nextInt();
        return choice;
	}
	
    public static void actionMenu(int choice) {
        //On traite ce choix par un switch, qui va checker successivement la valeur du choix
        switch(choice) {
        case 1: 
        	Partie p = new Partie();
        	p.lancerPartie();

        break;
        case 2:
                quit();
        break;
        default: //Si autre, alors on affiche un message d'erreur et on redemande un choix a l'utilisateur
                System.out.println("Valeur incorrecte");
                actionMenu(afficherMenu());
        break;
        }
    }
    
	private static void quit() {
        System.out.println("==================");
        System.out.println("=== Au revoir ====");
        System.out.println("==================");
    }
}
