package start;

import entidade.Galinha;

public class Start {
	
	public static void main(String[] args){
		
		Galinha g1 = new Galinha();
		
		g1.botar().botar().botar();
		
		Galinha g2 = new Galinha();
		
		g2.botar().botar();
	
		
		System.out.println(g1.ovo);
		System.out.println(g2.ovo);
		
		System.out.println("Total da Granja:" + Galinha.ovosDaGranja);
		
		System.out.println("Média: " + Galinha.getMediaOvos(2));
	}

}
