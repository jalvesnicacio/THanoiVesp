package problema;

public class EstadoTH {
	private Torre torre1;
	private Torre torre2;
	private Torre torre3;
	
	private String nomeAcao = "";

	public EstadoTH(Torre torre1, Torre torre2, Torre torre3) {
		this.torre1 = torre1;
		this.torre2 = torre2;
		this.torre3 = torre3;
	}
	
	public EstadoTH(){
		//nothing here...
	}
	
	public String toString(){
		return "Estado[torre1= "+torre1.toString() + ", torre2= " + torre2.toString() + ", torre3= "+ torre3.toString() + "]";
	}

	public Torre getTorre1() {
		return torre1;
	}

	public Torre getTorre2() {
		return torre2;
	}

	public Torre getTorre3() {
		return torre3;
	}
	
	public String getNomeAcao(){
		return this.nomeAcao;
	}
	
	public void setNomeAcao(String s){
		this.nomeAcao = s;
	}
	
	public void setTorre1(Torre torre1) {
		this.torre1 = torre1;
	}

	public void setTorre2(Torre torre2) {
		this.torre2 = torre2;
	}

	public void setTorre3(Torre torre3) {
		this.torre3 = torre3;
	}

	public boolean equals(EstadoTH estado){
		if (this.torre1.equals(estado.getTorre1()) &
				this.torre2.equals(estado.getTorre2()) &
				this.torre3.equals(estado.getTorre3())){
			return true;
		}
		return false;
	}

	
	public EstadoTH clone(){
		EstadoTH dest = new EstadoTH();
		dest.setTorre1(this.torre1.clone());
		dest.setTorre2(this.torre2.clone());
		dest.setTorre3(this.torre3.clone());
		return dest;
	}
	
	
	
	
	
	
	
	
	
}
