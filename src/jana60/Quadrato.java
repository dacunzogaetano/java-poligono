package jana60;

public class Quadrato implements Poligono{
	
	//attributi
	private int lato;
	
	//costruttori
	public Quadrato(int lato) {
		validaLato(lato);
		this.lato = lato;
	}
	
	//metodo per validare i dati
	private void validaLato(int lato) throws IllegalArgumentException {
		if (lato < 0)
			throw new IllegalArgumentException("Inserire solo numeri maggiori di 0");
	}

	@Override
	public void calcolaPerimetro() {
		System.out.println(lato * 4);
		
		
	}

	@Override
	public void calcolaArea() {
		System.out.println(lato * lato);
		
	}

}
