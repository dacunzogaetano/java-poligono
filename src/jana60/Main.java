package jana60;

public class Main {

	public static void main(String[] args) {
	
		Poligono Quadrato1 = new Quadrato(4);
		Poligono Triangolo1 = new Triangolo(5,4);
		Poligono Pentagono1 = new Pentagono(10,9);
		
		
		
		System.out.println("Il perimetro del quadrato � : ");
		Quadrato1.calcolaPerimetro();
		System.out.println("L'area del quadrato � : ");
		Quadrato1.calcolaArea();
		
		System.out.println("Il perimetro del triangolo � : ");
		Triangolo1.calcolaPerimetro();
		System.out.println("L'area del triangolo � : ");
		Triangolo1.calcolaArea();
		
		System.out.println("Il perimetro del pentagono � : ");
		Pentagono1.calcolaPerimetro();
		System.out.println("L'area del pentagono � : ");
		Pentagono1.calcolaArea();

	}

}
