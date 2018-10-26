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
			// wypisywanie na konsolê ³añcucha znaków opisuj¹cego przedmiot
			System.out.println(imie +" "+nazwisko+" wiek:"+ wiek +" "+ (vip?"vip":"standard"));
		}
		
		// grupa metod dostêpowych (setterów) ustawiaj¹cych wartoœci pól
		public void setWiek(int w){wiek = w;}
		public void setVip(boolean v){vip = v;}
		
		// grupa metod dostêpowyh (getterów) czytaj¹ca wartoœci pól
		public String getImie(){return imie;}
		public String getNazwisko(){return nazwisko;}
		public int getWiek(){return wiek;}
		public boolean isVip(){return vip;}
		
	}


