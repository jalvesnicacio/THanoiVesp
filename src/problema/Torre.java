package problema;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Torre {
	private List<Disco> discos = new LinkedList<Disco>();
	private int topIndex = -1;
	
	public Torre() {
		//não retorna nada.
	}

	public void adiciona(Disco disco){
		this.discos.add(disco);
		this.topIndex++;
	}
	
	public Disco remove(){
		if(this.topIndex > -1){
			Disco disco = this.discos.remove(topIndex);
			this.topIndex--;
			return disco;
		}else{
			return null;
		}
		
	}
	
	public Disco topDisco(){
		if (!this.discos.isEmpty()){
			return this.discos.get(topIndex);
		}
		return null;
		
	}
	
	public String toString(){
		String nomeDiscos = "{ ";
		for (Disco d : this.discos) {
			nomeDiscos += d.getNome() + " ";
		}
		nomeDiscos += "}";
		return nomeDiscos;
	}
	
	
	
	public List<Disco> getDiscos() {
		return discos;
	}

	public void setDiscos(List<Disco> discos) {
		this.discos = discos;
	}

	public boolean equals(Torre t){
		int counter = 0;
		ListIterator<Disco> li = this.discos.listIterator();
		
		if(this.discos.size() != t.getDiscos().size()){
			return false;
		}
		
		while(li.hasNext()){
			if(li.next().equals(t.getDiscos().get(counter))){ //--> Problema: lista vazia, com get(counter) apontado para null!!!
				counter++;
			}else{
				return false;
			}
		}
		return true;
	}
	
	public Torre clone(){
		Torre dest = new Torre();
		for(Disco d: this.discos){
			dest.adiciona(d);
		}
		return dest;
	}
	
	
	
	
	
	
	
	
	

}
