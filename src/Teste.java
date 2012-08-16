import problema.Disco;
import problema.EstadoTH;
import problema.Torre;
import problema.TorreHanoi;


public class Teste {
	public static void main(String[] args) {
		TorreHanoi problema = new TorreHanoi();
		
//		Disco disco1 = new Disco("disco1",10);
//		Disco disco2 = new Disco("disco2",20);
//		Disco disco3 = new Disco("disco3",30);
//		
//		Torre torre1 = new Torre();
//		Torre torre2 = new Torre();
//		Torre torre3 = new Torre();
//		
//		torre1.adiciona(disco3);
//		torre1.adiciona(disco2);
//		torre1.adiciona(disco1);
//		
//		EstadoTH estadoi = new EstadoTH(torre1,torre2,torre3);
//		EstadoTH estadof = new EstadoTH(torre3,torre2,torre1);
//		
//		
//		System.out.println("Estado inicial:");
//		System.out.println(estadoi.toString());
//		
//		System.out.println("Estado final:");
//		System.out.println(estadof.toString());
		
		System.out.println(problema.getEstadoi().toString());
		System.out.println(problema.getEstadof().toString());
		
		
	}

}
