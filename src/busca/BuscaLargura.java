package busca;

import java.util.LinkedList;
import java.util.List;

import problema.EstadoTH;
import problema.TorreHanoi;

public class BuscaLargura {
	private List<No> borda =  new LinkedList<No>();
	
	public List<No> buscar (TorreHanoi problema){
		borda.add(new No(problema.getEstadoi(),null));
		No n;
		while (!borda.isEmpty()){
			n = borda.remove(0);
			if(n.getEstado().equals(problema.getEstadof())){
				//fazer alguma coisa pra retornar o resultado: uma lista de nós que representa a solução
				return n.CaminhoSolucao();
			}else{
				borda.addAll(this.expandir(n, problema));
			}
		}
			
		return null;
	}
	
	public List<No> expandir(No no, TorreHanoi problema){
		List<No> sucessores = new LinkedList<No>();
		for(EstadoTH e: problema.sucessor(no.getEstado())){
			No s = new No(e,no);
			s.setCusto(no.getCusto());
			s.setProfundidade(no.getProfundidade()+1);
			sucessores.add(s);
		}
		return sucessores;
	}

}
