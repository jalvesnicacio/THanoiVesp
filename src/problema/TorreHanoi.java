package problema;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TorreHanoi {
	private EstadoTH estadoi;
	private EstadoTH estadof;
	
	
	public TorreHanoi() {
		Disco disco1 = new Disco("disco1",10);
		Disco disco2 = new Disco("disco2",20);
		Disco disco3 = new Disco("disco3",30);
		
		Torre torre1 = new Torre();
		Torre torre2 = new Torre();
		Torre torre3 = new Torre();
		
		torre1.adiciona(disco3);
		torre1.adiciona(disco2);
		torre1.adiciona(disco1);
		
		this.estadoi = new EstadoTH(torre1,torre2,torre3);
		this.estadof = new EstadoTH(torre3,torre2,torre1);
		
	}


	public EstadoTH getEstadoi() {
		return estadoi;
	}


	public EstadoTH getEstadof() {
		return estadof;
	}
	
	//Açoes
	
	public EstadoTH torre1_torre2(EstadoTH estado){
		Disco topA = estado.getTorre1().topDisco();
		Disco topB = estado.getTorre2().topDisco();
		EstadoTH aux = estado.clone();
		if(topA != null){
			if(topA.menorQue(topB)){
				aux.getTorre2().adiciona(aux.getTorre1().remove());
				aux.setNomeAcao("move " + topA.getNome() + " da torre 1 para a torre 2");
				return aux;
			}
		}
		
		return null;
	}
	
	public EstadoTH torre1_torre3(EstadoTH estado){
		Disco topA = estado.getTorre1().topDisco();
		Disco topB = estado.getTorre3().topDisco();
		EstadoTH aux = estado.clone();
		if(topA != null){
			if(topA.menorQue(topB)){
				aux.getTorre3().adiciona(aux.getTorre1().remove());
				aux.setNomeAcao("move " + topA.getNome() + " da torre 1 para a torre 3");
				return aux;
			}
		}
		return null;
	}
	
	public EstadoTH torre2_torre1(EstadoTH estado){
		Disco topA = estado.getTorre2().topDisco();
		Disco topB = estado.getTorre1().topDisco();
		EstadoTH aux = estado.clone();
		if(topA != null){
			if(topA.menorQue(topB)){
				aux.getTorre1().adiciona(aux.getTorre2().remove());
				aux.setNomeAcao("move " + topA.getNome() + " da torre 2 para a torre 1");
				return aux;
			}
		}
		return null;
	}
	
	public EstadoTH torre2_torre3(EstadoTH estado){
		Disco topA = estado.getTorre2().topDisco();
		Disco topB = estado.getTorre3().topDisco();
		EstadoTH aux = estado.clone();
		if(topA != null){
			if(topA.menorQue(topB)){
				aux.getTorre3().adiciona(aux.getTorre2().remove());
				aux.setNomeAcao("move " + topA.getNome() + " da torre 2 para a torre 3");
				return aux;
			}
		}
		return null;
	}
	
	public EstadoTH torre3_torre1(EstadoTH estado){
		Disco topA = estado.getTorre3().topDisco();
		Disco topB = estado.getTorre1().topDisco();
		EstadoTH aux = estado.clone();
		if(topA != null){
			if(topA.menorQue(topB)){
				aux.getTorre1().adiciona(aux.getTorre3().remove());
				aux.setNomeAcao("move " + topA.getNome() + " da torre 3 para a torre 1");
				return aux;
			}
		}
		return null;
	}
	
	public EstadoTH torre3_torre2(EstadoTH estado){
		Disco topA = estado.getTorre3().topDisco();
		Disco topB = estado.getTorre2().topDisco();
		EstadoTH aux = estado.clone();
		if(topA != null){
			if(topA.menorQue(topB)){
				aux.getTorre2().adiciona(aux.getTorre3().remove());
				aux.setNomeAcao("move " + topA.getNome() + " da torre 3 para a torre 2");
				return aux;
			}
		}
		return null;
	}
	
    public List<EstadoTH> sucessor(EstadoTH estado){
    	List<EstadoTH> s = new LinkedList<EstadoTH>();
    	
    	EstadoTH e = torre1_torre2(estado);
    	if(e != null){
    		s.add(e);
    	}
    	
    	e = torre1_torre3(estado);
    	if (e != null){
    		s.add(e);
    	}
    	
    	e = torre2_torre1(estado);
    	if (e != null){
    		s.add(e);
    	}
    	
    	e = torre2_torre3(estado);
    	if (e != null){
    		s.add(e);
    	}
    	
    	e = torre3_torre1(estado);
    	if (e != null){
    		s.add(e);
    	}
    	
    	e = torre3_torre2(estado);
    	if (e != null){
    		s.add(e);
    	}
    	return s;
    }
    
    public String imprimeLista(List<EstadoTH> lista){
    	ListIterator<EstadoTH> iteracao = lista.listIterator();
    	String saida = "Lista de estados sucessores: \n";
    	while (iteracao.hasNext()) {
			EstadoTH estadoTH = (EstadoTH) iteracao.next();
			saida += estadoTH.toString();
		}
    	return saida;
    }
	

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
