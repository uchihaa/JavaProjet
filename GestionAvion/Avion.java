package GestionAvion;

public class Avion {
	private String immatriculation;
	private String nom;
	private boolean gros;
	
	Avion(){
		this.immatriculation = "";
		this.nom = "";
		this.gros = false;
	}
	
	public Avion(String p_immat, String p_nom, boolean p_taille){
		this.immatriculation = p_immat;
		this.nom = p_nom;
		this.gros = p_taille;
	}
	
	/*Getter*/
	public String getImmat(){
		return this.immatriculation;
	}
	
	public String getNom(){
		return this.nom;
	}
	
	public boolean getTaille(){
		return this.gros;
	}
	
	/*Setter*/
	public void setImmat(String p_immat){
		this.immatriculation = p_immat;
	}
	
	public void setNom(String p_nom){
		this.nom = p_nom;
	}
	
	public void setTaille(boolean p_taille){
		this.gros = p_taille;
	}
	
	/*M�thodes*/
	public String toString(){
		return "Immatriculation : "+this.immatriculation+". Nom : "+this.nom+". Gros : "+this.gros;
	}
	
	public void afficher(){
		System.out.println(this.toString());
	}
}
