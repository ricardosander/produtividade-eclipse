package br.com.caelum.empresa;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.caelum.empresa.modelo.Funcionario;
import br.com.caelum.empresa.modelo.Gasto;

public class Principal {

	public static void main(String[] args) {
		
		Calendar dataNascimento = new GregorianCalendar(1990, 8, 28);
		Funcionario funcionario = new Funcionario("Ricardo", 123, dataNascimento);
		System.out.println(funcionario);
		
		Calendar data = Calendar.getInstance();
		Gasto gasto = new Gasto(12, "Taxi", funcionario, data, true);
		Gasto gasto1 = new Gasto(12, "Tansporte", funcionario, data, true);
		Funcionario funcionario2 = new Funcionario("Outro", 23, dataNascimento);
		Gasto gasto11 = new Gasto(12, "Hotel", funcionario2, data, true);
		
		System.out.println(gasto);
		System.out.println(gasto1);
		System.out.println(gasto11);
	}
}