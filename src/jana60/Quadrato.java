package jana60;

public class Quadrato implements Poligono{
	
	//attributi
	private double lato;
	
	//costruttori
	public Quadrato(double lato) {
		validaLato(lato);
		this.lato = lato;
	}
	
	//metodo per validare i dati
	private void validaLato(double lato) throws IllegalArgumentException {
		if (lato < 0)
			throw new IllegalArgumentException("Inserire solo numeri maggiori di 0");
	}

	@Override
	public double calcolaPerimetro() {
		return lato*4; 
		
	}

	@Override
	public double calcolaArea() {
		return lato * lato;
		
	}

}
