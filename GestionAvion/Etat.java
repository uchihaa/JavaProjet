package GestionAvion;

import Outils.Duree;

public abstract class Etat {
	protected String raison;
	
	public Etat(){
		this.raison = "";
	}
	
	public Etat(String p_raison){
		this.raison = p_raison;
	}
	
	/*Getter*/
	public String getRaison(){
		return this.raison;
	}
	
	public Duree getDuree(){
		return new Duree();
	}
	
	/*Setter*/
	public void setRaison(String p_raison){
		this.raison = p_raison;
	}
	
}
