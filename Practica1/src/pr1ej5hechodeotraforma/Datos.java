package pr1ej5hechodeotraforma;

public class Datos {
	private int max;
	private int min;
	private double prom;
	
	
	public double getProm() {
		return prom;
	}
	public void setProm(double prom) {
		this.prom = prom;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	@Override
	public String toString() {
		String aux=getMax()+" "+getMin()+" "+getProm();
		return aux;
	}
}
