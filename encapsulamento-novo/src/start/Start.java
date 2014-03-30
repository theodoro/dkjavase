package start;


import model.Cliente;

public class Start {
	
	public static void main(String[] args){
		
		Cliente cli = new Cliente();
		
		cli.setNome("Bruno Aquino");
		cli.setCpf(Integer.valueOf(0000000000));
		
		System.out.println("Nome :" + cli.getNome() + "/" + cli.getCpf());
	}

}
