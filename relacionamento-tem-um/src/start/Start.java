package start;

import entidade.Carro;
import entidade.Motor;

public class Start {
	
	public static void main(String[] args){
		
		Carro ferrari = new Carro();
		
		ferrari.setModelo("Ferrari");
		ferrari.setVelocidadeMax(425.50);
		
		Motor v12 = new Motor();
		
		v12.setMotor("V12");
		
		ferrari.setMotor(v12);
		
		System.out.println("Modelo :" + ferrari.getModelo());
		System.out.println("Modelo :" + ferrari.getVelocidadeMax());
		System.out.println("Modelo :" + ferrari.getMotor().getMotor());
	}

}
