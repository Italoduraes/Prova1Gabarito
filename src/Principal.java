import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		BDSimulado bds= new BDSimulado();
		
		Cliente c= bds.getInfoCliente("Regina Maria");
		
		System.out.println(c);
		
		ArrayList<Ligacao> a1= bds.LIgacoesPorCliente("Regina Maria");
		
		System.out.println(a1);
		
		System.out.println(bds.gerarConta("Regina Maria"));
		
		
		

	}

}
