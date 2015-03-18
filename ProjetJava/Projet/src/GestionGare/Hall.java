package GestionGare;

import java.util.ArrayList;

public class Hall {
	private String numero;
	private ArrayList<Porte> listePorte;
	
	public Hall(){
		this.numero = "";
	}
	
	public Hall(String p_num){
		this.numero = p_num;
	}
	
	public Hall(ArrayList<Porte> p_liste){
		this.listePorte = p_liste;
	}
	
	/*Getter*/
	public ArrayList<Porte> getListe(){
		return this.listePorte;
	}
	
	public String getNumero(){
		return this.numero;
	}
	
	/*Setter*/
	public void setListe(ArrayList<Porte> p_liste){
		this.listePorte = p_liste;
	}
	
	public void setNumero(String p_num){
		this.numero = p_num;
	}
	
}
