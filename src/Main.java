import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Paulo");
		p1.setDia("15");
		p1.setMes("08");
		p1.setAnoNasc(2005);
		p1.setAltura(1.65);
		
		System.out.println(p1.imprimirDadosPessoa());
		
		System.out.println("A idade de " + p1.getNome() + " é: " + p1.somaIdade());

	}

}