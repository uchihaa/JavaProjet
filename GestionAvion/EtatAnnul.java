package GestionAvion;

public class EtatAnnul extends Etat {
	
	public EtatAnnul(){
		super();
	}
	
	public EtatAnnul(String p_raison){
		super(p_raison);
	}
	
	/*M�thodes*/
	public String toString(){
		return "Annul�";
	}
	
	public void afficher(){
		System.out.println(this.toString());
	}
}
