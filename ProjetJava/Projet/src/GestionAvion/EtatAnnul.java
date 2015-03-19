package GestionAvion;

public class EtatAnnul extends Etat {
	
	public EtatAnnul(){
		super();
	}
	
	public EtatAnnul(String p_raison){
		super(p_raison);
	}
	
	/*Méthodes*/
	public String toString(){
		return "Annulé";
	}
	
	public void afficher(){
		System.out.println(this.toString());
	}
}
