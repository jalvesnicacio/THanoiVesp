package problema;

public class EstadoTH {
	private Torre torre1;
	private Torre torre2;
	private Torre torre3;
	
	private String nomeAcao = "";

	public EstadoTH(Torre torre1, Torre torre2, Torre torre3, String nomeAcao) {
		this.torre1 = torre1;
		this.torre2 = torre2;
		this.torre3 = torre3;
		this.nomeAcao = nomeAcao;
	}
	
	public EstadoTH(Torre torre1, Torre torre2, Torre torre3) {
		this.torre1 = torre1;
		this.torre2 = torre2;
		this.torre3 = torre3;
	}
	
	public String toString(){
		return "Estado[torre1= "+torre1.toString() + ", torre2= " + torre2.toString() + ", torre3= "+ torre3.toString() + "]";
	}
	
	

}
