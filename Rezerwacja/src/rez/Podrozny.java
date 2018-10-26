package rez;

public class Podrozny {
	// pola prywatne
		private String imie, nazwisko;
		private int wiek;
		private boolean vip;
		
		// konstruktor z 4 argumentami
		public Podrozny(String imie, String nazwisko, int wiek, boolean vip){
			this.imie = imie;
			this.nazwisko = nazwisko;
			this.wiek = wiek;
			vip = true;
		}
		
		// metoda publiczna print
		public void print(){
			// wypisywanie na konsol� �a�cucha znak�w opisuj�cego przedmiot
			System.out.println(imie +" "+nazwisko+" wiek:"+ wiek +" "+ (vip?"vip":"standard"));
		}
		
		// grupa metod dost�powych (setter�w) ustawiaj�cych warto�ci p�l
		public void setWiek(int w){wiek = w;}
		public void setVip(boolean v){vip = v;}
		
		// grupa metod dost�powyh (getter�w) czytaj�ca warto�ci p�l
		public String getImie(){return imie;}
		public String getNazwisko(){return nazwisko;}
		public int getWiek(){return wiek;}
		public boolean isVip(){return vip;}
		
	}


