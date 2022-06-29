package jana60;

public class Triangolo implements Poligono {
	
	//attributi
	private double lato;
	private double altezza;
	
	//costruttori
	public Triangolo(double lato, double altezza) {
		validaLato(lato, altezza);
		this.lato = lato;
		this.altezza = altezza;
	}
	
	//metodo per validare i dati
		private void validaLato(double lato, double altezza) throws IllegalArgumentException {
			if (lato < 0 || altezza <0)
				throw new IllegalArgumentException("Inserire solo numeri maggiori di 0");
		}

	@Override
	public double calcolaPerimetro() {
		return lato*3;
		
	}

	@Override
	public double calcolaArea() {
		return lato*altezza/2;
		
	}

}
