package GestionAvion;

public class EtatOk extends Etat{
	
	/*Méthodes*/
	public String toString(){
		return "A l'heure";
	}
	
	public void afficher(){
		System.out.println(this.toString());
	}
}
