package controle;

public class Mulher extends Pessoa implements Casamento{

	@Override
	public void casar(Pessoa p) {
		System.out.println(this.getNome() + "Está casada com" + p.getNome());
		
	}

}
