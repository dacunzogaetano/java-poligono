package jana60;

public class Quadrato implements Poligono{
	
	//attributi
	private int lato;
	
	//costruttori
	public Quadrato(int lato) {
		this.lato = lato;
	}

	@Override
	public void calcolaPerimetro() {
		System.out.println(lato * 4);
		
		
	}

	@Override
	public void calcolaArea() {
		System.out.println(lato * 2);
		
	}

}
