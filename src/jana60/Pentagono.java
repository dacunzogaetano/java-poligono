package jana60;

public class Pentagono implements Poligono{
	
	//attributi
	double lato;
	double altezza;
	
	//costruttori
	
	public Pentagono(double lato, double altezza) {
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
		return lato*5;
		
	}

	@Override
	public double calcolaArea() {
		return (2*lato*altezza)/2;
		
	}

}
