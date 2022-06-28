package jana60;

public class Pentagono implements Poligono{
	
	//attributi
	int lato;
	int altezza;
	
	//costruttori
	
	public Pentagono(int lato, int altezza) {
		validaLato(lato, altezza);
		this.lato = lato;
		this.altezza = altezza;
	}
	
	//metodo per validare i dati
			private void validaLato(int lato, int altezza) throws IllegalArgumentException {
				if (lato < 0 || altezza <0)
					throw new IllegalArgumentException("Inserire solo numeri maggiori di 0");
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
