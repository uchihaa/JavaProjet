package GestionGare;

import java.util.ArrayList;

public class ZoneP extends Zone{
	private ArrayList<? extends Parking> listePetit; 

	public ZoneP(){
		super();
	}
	
	public ZoneP(String p_nom){
		super(p_nom);
	}
	
	public ZoneP(ArrayList<? extends Parking> p_liste, String p_nom, ArrayList<? extends Parking> p_listeP){
		super(p_liste, p_nom);
		this.listePetit = p_listeP;
	}

	/*Getter*/
	public ArrayList<? extends Parking> getListeP(){
		return this.listePetit;
	}
	
	/*Setter*/
	public void setListeP(ArrayList<? extends Parking> p_listeP){
		this.listePetit = p_listeP;
	}
}