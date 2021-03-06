package br.com.caelum.empresa.modelo;

import java.util.Calendar;

public class Gasto {

	private double valor;
	private String tipo;
	private Funcionario funcionario;
	private Calendar data;
	private boolean pagoEmDinheiro;
	
	public boolean isPagoEmDinheiro() {
		return pagoEmDinheiro;
	}
	
	public void setPagoEmDinheiro(boolean pagoEmDinheiro) {
		this.pagoEmDinheiro = pagoEmDinheiro;
	}
	
	@Override
	public String toString() {
		return "Tipo: " + this.tipo + ", Funcionario: " + this.funcionario;
	}
	public Gasto(double valor, String tipo, Funcionario funcionario, Calendar data, boolean pagoEmDinheiro) {
		super();
		this.valor = valor;
		this.tipo = tipo;
		this.funcionario = funcionario;
		this.data = data;
		this.pagoEmDinheiro = pagoEmDinheiro;
	}

	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	
	
	
}
