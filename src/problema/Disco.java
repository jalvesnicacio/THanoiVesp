package problema;

public class Disco {
	private String nome;
	private int diametro;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getDiametro() {
		return diametro;
	}
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	
	public Disco(String nome, int diametro) {
		this.nome = nome;
		this.diametro = diametro;
	}
	
	public boolean equals(Disco disco){
		if(this.diametro == disco.getDiametro()){
			return true;
		}
		return false;
	}
	

}
