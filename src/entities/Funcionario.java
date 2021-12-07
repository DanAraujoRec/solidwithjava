package entities;
import java.io.Serializable;

import enums.CargoEnum;

public class Funcionario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private Integer idade;
	private double salarioBase;
	private CargoEnum cargo;	
	
	public Funcionario(String nome, Integer idade, double salarioBase, CargoEnum cargo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.salarioBase = salarioBase;
		this.cargo = cargo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public CargoEnum getCargo() {
		return cargo;
	}
	public void setCargo(CargoEnum cargo) {
		this.cargo = cargo;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
}
