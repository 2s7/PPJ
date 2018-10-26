package rez;

public class Cel {
	private String kierunek, linia, lotnisko;
	private int miejsce;
	
	
	// konstruktor z 4 argumentami
	public Cel(String kierunek, String linia, String lotnisko, int miejsce){
		this.kierunek = kierunek;
		this.linia = linia;
		this.lotnisko = lotnisko;
		this.miejsce = miejsce;
	}
	
	// metoda publiczna print
	public void print(){
		// wypisywanie na konsol� �a�cucha znak�w opisuj�cego przedmiot
		System.out.println("Cel podr�y: " + kierunek);
		System.out.println("Linia lotnicza: " + linia + ", wylot z:" + lotnisko);
		System.out.println("zarezerwowane miejsce: " + miejsce);}
	
	// grupa metod dost�powych (setter�w) ustawiaj�cych warto�ci p�l
	public void setMiejsce(int m){miejsce = m;}
	
	
	// grupa metod dost�powyh (getter�w) czytaj�ca warto�ci p�l
	public String getKierunek(){return kierunek;}
	public String getLinia(){return linia;}
	public String getLotnisko() {return lotnisko;}
	public int getMiejsce(){return miejsce;}

	
}
