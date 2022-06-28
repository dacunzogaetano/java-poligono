package jana60;

public class Triangolo implements Poligono {
	
	//attributi
	private int lato;
	private int altezza;
	
	//costruttori
	public Triangolo(int lato, int altezza) {
		this.lato = lato;
		this.altezza = altezza;
	}

	@Override
	public void calcolaPerimetro() {
		System.out.println(lato*3);
		
	}

	@Override
	public void calcolaArea() {
		System.out.println(lato*altezza/2);
		
	}

}
