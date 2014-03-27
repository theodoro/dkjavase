package start;

import controle.Homem;
import controle.Mulher;

public class Start {
	
	public static void main(String[] args){
		
		Homem h = new Homem();
		
		Mulher m = new Mulher();
		
		h.setNome("Bruno");
		h.setIdade(27);
		
		
		
		m.setNome("Priscila");
		m.setIdade(22);
		
		m.casar(h);
		h.casar(m);
	}

}
