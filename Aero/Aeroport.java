//Test
package Aero;

import java.util.ArrayList;
import java.util.Iterator;

import GestionAvion.Avion;
import GestionGare.Hall;
import GestionGare.Parking;
import GestionGare.Porte;
import GestionGare.Zone;
import GestionGare.ZoneG;

public class Aeroport {
	private String nom;
	private ArrayList<Hall> listeHall;
	private ArrayList<Zone> listeZone;
	
	public Aeroport(){
		this.setNom("");
	}
	
	public Aeroport(String p_nom){
		this.nom = p_nom;
	}
	
	public Aeroport(String p_nom, ArrayList<Hall> p_listHall, ArrayList<Porte> p_listePorte, ArrayList<Parking> p_listeParking, ArrayList<Zone> p_listeZone){
		this.setNom(p_nom);
		this.setListeHall(p_listHall);
		this.setListeZone(p_listeZone);
	}
	
	/*Getter*/
	public String getNom() {
		return this.nom;
	}

	public ArrayList<Hall> getListHall() {
		return this.listeHall;
	}
	
	public ArrayList<Zone> getListeZone() {
		return this.listeZone;
	}


	/*Setter*/
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setListeHall(ArrayList<Hall> p_listHall) {
		this.listeHall = p_listHall;
	}

	public void setListeZone(ArrayList<Zone> p_listeZone) {
		this.listeZone = p_listeZone;
	}
	
	/*Méthode*/
	public void AffecterAvion(Avion a){
		
		Parking p;
		if(a.getTaille()){
			Iterator it = this.getListeZone().iterator();
			ZoneG z= (ZoneG)it.next();
			while(it.hasNext()){
				if(z.getNom() == "Victor"){
					z.parkingLibre()
				}
			}
			
		}
	}
}
