package start;

import javax.swing.JOptionPane;

import entidade.Cachorro;

public class Start {
	
	public static void main(String[] args){
		
		Cachorro dog = new Cachorro();
		
		dog.setRaca("Cachorro");
		dog.setComida("Ração");
		dog.setPeso(25);
		
		JOptionPane.showMessageDialog(null, dog.getRaca() + "/" + dog.getComida() + "/" + dog.getPeso());
	}

}
