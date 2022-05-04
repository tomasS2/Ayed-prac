package tp04.ejercicio1;

public class AreaEmpresa {
	private String iden;
	private int tardanza;
	
	public AreaEmpresa (int tardanza,String iden) {
		this.iden = iden;
		this.tardanza= tardanza;
	}

	public String getIden() {
		return iden;
	}

	public void setIden(String iden) {
		this.iden = iden;
	}

	public int getTardanza() {
		return tardanza;
	}

	public void setTardanza(int tardanza) {
		this.tardanza = tardanza;
	}
}
