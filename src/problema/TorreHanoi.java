package problema;

import java.util.LinkedList;
import java.util.List;

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
		if(topA.getDiametro()<topB.getDiametro() & topA != null){
			estado.getTorre2().adiciona(estado.getTorre1().remove());
			return estado;
		}
		return null;
	}
	
	public EstadoTH torre1_torre3(EstadoTH estado){
		Disco topA = estado.getTorre1().topDisco();
		Disco topB = estado.getTorre3().topDisco();
		if(topA.getDiametro()<topB.getDiametro() & topA != null){
			estado.getTorre3().adiciona(estado.getTorre1().remove());
			return estado;
		}
		return null;
	}
	
	public EstadoTH torre2_torre1(EstadoTH estado){
		Disco topA = estado.getTorre2().topDisco();
		Disco topB = estado.getTorre1().topDisco();
		if(topA.getDiametro()<topB.getDiametro() & topA != null){
			estado.getTorre1().adiciona(estado.getTorre2().remove());
			return estado;
		}
		return null;
	}
	
	public EstadoTH torre2_torre3(EstadoTH estado){
		Disco topA = estado.getTorre2().topDisco();
		Disco topB = estado.getTorre3().topDisco();
		if(topA.getDiametro()<topB.getDiametro() & topA != null){
			estado.getTorre3().adiciona(estado.getTorre2().remove());
			return estado;
		}
		return null;
	}
	
	public EstadoTH torre3_torre1(EstadoTH estado){
		Disco topA = estado.getTorre3().topDisco();
		Disco topB = estado.getTorre1().topDisco();
		if(topA.getDiametro()<topB.getDiametro() & topA != null){
			estado.getTorre1().adiciona(estado.getTorre3().remove());
			return estado;
		}
		return null;
	}
	
	public EstadoTH torre3_torre2(EstadoTH estado){
		Disco topA = estado.getTorre3().topDisco();
		Disco topB = estado.getTorre2().topDisco();
		if(topA.getDiametro()<topB.getDiametro() & topA != null){
			estado.getTorre2().adiciona(estado.getTorre3().remove());
			return estado;
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
	

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
