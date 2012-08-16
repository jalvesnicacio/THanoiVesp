package problema;

import javax.swing.text.StyledEditorKit.BoldAction;

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

	public Torre getTorre1() {
		return torre1;
	}

	public Torre getTorre2() {
		return torre2;
	}

	public Torre getTorre3() {
		return torre3;
	}
	
	public boolean equals(EstadoTH estado){
		if (this.torre1.equals(estado.getTorre1()) &
				this.torre2.equals(estado.getTorre2()) &
				this.torre3.equals(estado.getTorre3())){
			return true;
		}
		return false;
	}

	
	
	
	
	
	
	
	
	
}
