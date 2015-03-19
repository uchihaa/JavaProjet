package GestionGare;

public class Porte {
	private String numero;
	
	public Porte(){
		this.numero = "";
	}
	
	public Porte(String p_num){
		this.numero = p_num;
	}
	
	/*Getter*/
	public String getNum(){
		return this.numero;
	}
	
	public void setNum(String p_num){
		this.numero = p_num;
	}
}
