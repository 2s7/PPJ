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
		// wypisywanie na konsolê ³añcucha znaków opisuj¹cego przedmiot
		System.out.println("Cel podró¿y: " + kierunek);
		System.out.println("Linia lotnicza: " + linia + ", wylot z:" + lotnisko);
		System.out.println("zarezerwowane miejsce: " + miejsce);}
	
	// grupa metod dostêpowych (setterów) ustawiaj¹cych wartoœci pól
	public void setMiejsce(int m){miejsce = m;}
	
	
	// grupa metod dostêpowyh (getterów) czytaj¹ca wartoœci pól
	public String getKierunek(){return kierunek;}
	public String getLinia(){return linia;}
	public String getLotnisko() {return lotnisko;}
	public int getMiejsce(){return miejsce;}

	
}
