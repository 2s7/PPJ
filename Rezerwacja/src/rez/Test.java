package rez;

public class Test {

	public static void main(String[] args){
		
		Podrozny a = new Podrozny("Jan","Kowalski",30, true);
		Podrozny b = new Podrozny("Anna","Kowalska",28, false);
		Cel ac = new Cel("Kopenhaga", "LOT", "Warszawa", 24);
		Cel bc = new Cel("Kopenhaga", "LOT", "Warszawa", 25);
	
		a.print();
		ac.print();
		b.print();
		bc.print();
	}
}

