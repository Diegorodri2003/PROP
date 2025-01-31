package domini;
public class ParaulaFrequent{
	private double esforc;
	private String valor;

	public ParaulaFrequent(){

	}

	public ParaulaFrequent(double esforc, String valor){
		this.esforc = esforc;
		this.valor = valor;
	}

	public String getValor(){
		return valor;
	}

	public double getEsforc(){
		return esforc;
	}

	public void setValor(String valor){
		this.valor = valor;
	}

	public void setEsforc(double esforc){
		this.esforc = esforc;
	}

}
