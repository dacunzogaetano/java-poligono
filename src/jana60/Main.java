package jana60;

public class Main {

	public static void main(String[] args) {
	
		Quadrato Quadrato1 = new Quadrato(4);
		Poligono Triangolo1 = new Triangolo(5,4);
		Poligono Pentagono1 = new Pentagono(10,9);
		
		
		
		System.out.print("Il perimetro del quadrato � : ");
		Quadrato1.calcolaPerimetro();
		System.out.print("L'area del quadrato � : ");
		Quadrato1.calcolaArea();
		
		System.out.print("Il perimetro del triangolo � : ");
		Triangolo1.calcolaPerimetro();
		System.out.print("L'area del triangolo � : ");
		Triangolo1.calcolaArea();
		
		System.out.print("Il perimetro del pentagono � : ");
		Pentagono1.calcolaPerimetro();
		System.out.print("L'area del pentagono � : ");
		Pentagono1.calcolaArea();

	}

}
