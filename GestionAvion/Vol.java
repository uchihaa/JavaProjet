package GestionAvion;

import Outils.Duree;
import Outils.Horaire;

public class Vol {
	protected String numero;
	protected Avion avion;
	protected String ville;
	protected Horaire heure;
	protected Etat etat;
	
	public Vol(){
		this.ville = "";
	}
	
	public Vol(String p_num, Avion p_avion, String p_ville, Horaire p_heure, Etat p_etat){
		this.numero = p_num;
		this.avion = p_avion;
		this.ville = p_ville;
		this.heure = p_heure;
		this.etat = p_etat;
	}
	
	/*Getter*/
	public Avion getAvion(){
		return this.avion;
	}
	
	public String getVille(){
		return this.ville;
	}
	
	public Horaire getHeure(){
		return this.heure;
	}
	
	public Etat getEtat(){
		return this.etat;
	}
	
	
	/*Setter*/
	public void setAvion(Avion p_avion){
		this.avion = p_avion;
	}
	
	public void setVille(String p_ville){
		this.ville = p_ville;
	}
	
	public void setHeure(Horaire p_heure){
		this.heure = p_heure;
	}
	
	public void setEtat(Etat p_etat){
		this.etat = p_etat;
	}
	
	
	/*Méthodes*/
	public void retarderVol(String raison, Duree dureeRetard){
		this.etat = new EtatRetard(raison, dureeRetard);
	}
	
	public void annulerVol(String raison){
		this.etat = new EtatAnnul(raison);
	}
	
	public Horaire heureEffective(){
		return this.heure.ajout(this.etat.getDuree());
	}
}
