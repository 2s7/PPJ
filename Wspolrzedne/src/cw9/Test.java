package cw9;
import java.lang.Math;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punkt<Integer> p1 = new Punkt<Integer>(1,2);
		Punkt <Double> p2 = new Punkt<Double>(4.0,5.0);
		
		System.out.println(oblicz(p1,p2));
		
	}
		public static double oblicz(Punkt p1, Punkt p2){
			double a1 = Math.pow(p1.getX().doubleValue() - p2.getX().doubleValue(), 2);
			double a2 = Math.pow(p1.getX().doubleValue() - p2.getX().doubleValue(), 2);
		double wynik=Math.sqrt(a1 + a2);
		return wynik;
		
	}

}
