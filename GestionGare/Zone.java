package GestionGare;
import java.util.ArrayList;
import java.util.Iterator;

import Outils.TrancheHoraire;

public class Zone {
	protected ArrayList<? extends Parking> listeParking;
	protected String nom;
	
	public Zone(){
		this.setNom("");
	}
	
	public Zone(String p_nom){
		this.setNom(p_nom);
	}
	
	public Zone(ArrayList<? extends Parking> p_liste, String p_nom){
		this.listeParking = p_liste;
		this.setNom(p_nom);
	}

	/*Getter*/
	public ArrayList<? extends Parking> getListe(){
		return this.listeParking;
	}
	
	public String getNom() {
		return this.nom;
	}
	

	/*Setter*/
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setListe(ArrayList<? extends Parking> p_liste){
		this.listeParking = p_liste;
	}
	
	/*M�thode
	public ArrayList parkingLibre(TrancheHoraire TH){
		
	}*/
	
}
