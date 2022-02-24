import java.util.Calendar;
import java.util.Date;

public class Pessoa {
	private String nome;
	private String dia, mes;
	private int anoNasc;
	private double altura;
	
	private Date dataNascimento;
	
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNasc() {
		return anoNasc;
	}
	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public String imprimirDadosPessoa() {
	      String dados = "Nome: " + nome + "\n" + "Data de Nascimento: " + dia + 
	    		         "/" + mes + "/" + anoNasc + "\n" + "Altura: " + altura;
	return dados;}
	
	public int somaIdade() {
		int anoNasc;
		
		Calendar dataAtual = Calendar.getInstance();
		Integer mesAtual = dataAtual .get(Calendar.MONTH) + 1;
		int validacaoData = Integer.parseInt(mes);
		
		if(validacaoData >= mesAtual) {
			return anoNasc = (2022 - 1) - getAnoNasc();
		}
		
		anoNasc = 2022 - getAnoNasc();
	return anoNasc;}

}