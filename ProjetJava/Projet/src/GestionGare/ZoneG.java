package GestionGare;
import GestionAvion.Sejour;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import Outils.Horaire;
import Outils.TrancheHoraire;

public class ZoneG extends Zone{
	private ArrayList<? extends Parking> listeGros; 

	public ZoneG(){
		super();
	}
	
	public ZoneG(String p_nom){
		super(p_nom);
	}
	
	public ZoneG(ArrayList<? extends Parking> p_liste, String p_nom, ArrayList<? extends Parking> p_listeG){
		super(p_liste, p_nom);
		this.listeGros = p_listeG;
	}

	/*Getter*/
	public ArrayList<? extends Parking> getListeG(){
		return listeGros;
	}
	
	/*Setter*/
	public void setListeG(ArrayList<? extends Parking> p_listeG){
		this.listeGros = p_listeG;
	}
	
	/*Méthode*/
	//Gildas
	public ArrayList parkingLibre(TrancheHoraire TH){
		ArrayList listeRes = null;
		HashMap mesSejour;
		
		Iterator it = listeGros.iterator();
		Iterator it1;
		Parking p;

		while(it.hasNext()){
			p = (Parking)it.next();
			it1 = (p).getSejours().values().iterator();
			while(it1.hasNext()){
				if(TH.intersection(((Sejour)it1.next()).getTrancheHoraire()) == null){
					listeRes.add(p);
				}
				
			}
		}
			
		return listeRes;
	}
}
