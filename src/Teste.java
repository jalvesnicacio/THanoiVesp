import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import busca.BuscaLargura;
import busca.No;
import problema.Disco;
import problema.EstadoTH;
import problema.Torre;
import problema.TorreHanoi;


public class Teste {
	public static void main(String[] args) {
		TorreHanoi problema = new TorreHanoi();
		BuscaLargura busca = new BuscaLargura();
		List<No> solucao = new LinkedList<No>();
		
		solucao = busca.buscar(problema);
		
		//Para busca A*: (coloquei como um modelo de como executar com A*)
		//TorreHanoi problema = new TorreHanoi();
		//BuscaAEstrela busca = new BuscaAEstrela();
		//List<no> solucao = new LinkedList<No>();
		
		if (solucao != null){
			//Escrevendo na tela o caminho:
			ListIterator<No> iteracao = solucao.listIterator();
			while(iteracao.hasNext()){
				No n = iteracao.next();
				System.out.println(n.getEstado().getNomeAcao());
			}
			
		}else{
			System.out.println("Sem solução");
		}
		
	}

}
