package GestionAvion;

public class EtatOk extends Etat{
	
	/*M�thodes*/
	public String toString(){
		return "A l'heure";
	}
	
	public void afficher(){
		System.out.println(this.toString());
	}
}
