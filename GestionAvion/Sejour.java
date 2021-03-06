package GestionAvion;

import Outils.TrancheHoraire;

public class Sejour {
	private static int nbSejour = 0;
	private int numero;
	private Vol depart = new VolDepart();
	private Vol arrivee = new VolArrivee();

	public Sejour(){
		nbSejour += 1;
		this.numero = nbSejour;
	}
	
	public Sejour(Vol p_depart, Vol p_arrivee){
		nbSejour += 1;
		this.numero = nbSejour;
		this.depart = p_depart;
		this.arrivee = p_arrivee;
	}
	
	/*Getter*/
	public Vol getDepart(){
		return this.depart;
	}
	
	public Vol getArrivee(){
		return this.arrivee;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public TrancheHoraire getTrancheHoraire(){
		return new TrancheHoraire(arrivee.getHeure(),depart.getHeure());
		
	}
	
	/*Setter*/
	public void setDepart(Vol p_depart){
		this.depart = p_depart;
	}
	
	public void setArrivee(Vol p_arrivee){
		this.arrivee = p_arrivee;
	}
}
