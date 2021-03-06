package GestionGare;

import java.util.ArrayList;
import java.util.HashMap;

import GestionAvion.Sejour;
import Outils.TrancheHoraire;

public class Parking {
	protected HashMap<Integer, Sejour> listeSejour = new HashMap<Integer, Sejour>();
	protected Porte porte;
	protected String numero;
	
	
	public Parking(){
		this.setNumero("");
	}
	
	public Parking(String p_num){
		this.setNumero(p_num);
	}
	
	public Parking(Porte p_porte, String p_num){
		this.porte = p_porte;
		this.setNumero(p_num);
	}

	/*Getter*/
	public Porte getPorte() {
		return porte;
	}
	
	public String getNumero() {
		return numero;
	}
	
	//Gildas
	public HashMap getSejours(){
		return listeSejour;
	}
	
	/*Setter*/
	public void setPorte(Porte p_porte) {
		this.porte = p_porte;
	}

	public void setNumero(String p_numero) {
		this.numero = p_numero;
	}
	
	/*M�thodes*/
	public void ajoutSejour(Sejour p_sejour){
		this.listeSejour.put((Integer)p_sejour.getNumero(), p_sejour);
	}

	//Gildas
	/*toString*/
	public String toString(){
		return "Parking n� : " + numero;
	}
}
