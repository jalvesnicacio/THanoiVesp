package busca;

import java.util.LinkedList;
import java.util.List;
import problema.EstadoTH;

public class No {
	private EstadoTH estado;
	private No noPai;
	private int custo;
	private int profundidade;
	
	public No(EstadoTH estado, No noPai) {
		this.estado = estado;
		this.noPai = noPai;
		this.custo = calcularCusto();
		this.profundidade = 1;
	}
	
	private int calcularCusto(){
		return 1;
	}

	public EstadoTH getEstado() {
		return estado;
	}

	public void setEstado(EstadoTH estado) {
		this.estado = estado;
	}

	public No getNoPai() {
		return noPai;
	}

	public void setNoPai(No noPai) {
		this.noPai = noPai;
	}

	public int getCusto() {
		return custo;
	}

	public void setCusto(int custo) {
		this.custo = custo;
	}
	
	public int getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(int profundidade) {
		this.profundidade = profundidade;
	}
	
	//Este método retorna apenas o ramo da árvore onde foi encontrada a solução, desde o estado inicial até o final
	public List<No> CaminhoSolucao(){
		LinkedList<No> caminho = new LinkedList<No>();
		No n = this;
		
		while(n.noPai != null){
			caminho.push(n);
			n = n.noPai;
		}
		//Salvar o estado inicial no caminho
		caminho.push(n);
		
		return caminho;
	}

	

}
