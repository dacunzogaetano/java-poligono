package jana60;

public class Pentagono implements Poligono{
	
	//attributi
	int lato;
	int altezza;
	
	//costruttori
	public Pentagono(int lato, int altezza) {
		this.lato = lato;
		this.altezza = altezza;
	}

	@Override
	public void calcolaPerimetro() {
		System.out.println(lato*5);
		
	}

	@Override
	public void calcolaArea() {
		System.out.println((2*lato * altezza) / 2);
		
	}

}
