package problema;

import java.util.LinkedList;
import java.util.List;

public class Torre {
	private List<Disco> discos = new LinkedList<Disco>();
	private int topIndex = -1;
	
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
		return this.discos.get(topIndex);
	}

}
