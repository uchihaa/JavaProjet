package GestionAvion;

import Outils.Duree;

public class EtatRetard extends Etat{
	private Duree duree;
	
	public EtatRetard(){
		super();
		this.duree = new Duree();
	}

	public EtatRetard(String p_raison, Duree p_duree){
		super(p_raison);
		this.duree = p_duree;
	}
	
	/*Getter*/
	public Duree getDuree() {
		return duree;
	}

	/*Setter*/
	public void setDuree(Duree p_duree) {
		this.duree = p_duree;
	}
	
	/*Méthodes*/
	public String toString(){
		return "Aura un retard de : "+duree.toString();
	}
	
	public void afficher(){
		System.out.println(this.toString());
	}

}
