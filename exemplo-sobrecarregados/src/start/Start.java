package start;

import entidade.Matematica;

public class Start {
	
	public static void main(String[] args){
		
		Matematica m = new Matematica();
		
		double media =
		
				m.getMedia(15, 55);
		
		System.out.println(media);
		
		System.out.println("Aqui estou passsando String\n" + m.getMedia("15" , "55"));
	}

}
