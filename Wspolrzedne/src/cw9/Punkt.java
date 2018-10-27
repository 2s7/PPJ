package cw9;

public class Punkt<T extends Number> {
	private T x;
	private T y;
	public Punkt(T x, T y){
		this.x=x;
		this.y=y;
	}
	public T getX(){
		return x;	
	}
	
	public T getY(){
	return y;
	}
	public void setPunkt(T x, T y){
		this.x = x;
		this.y=y;
	}
}