package services;

import entities.Funcionario;
import entities.impl.CalcularSalarioClient;

public class QuinzeOuVintePorCento implements CalcularSalarioClient{

	@Override
	public double calculoBase(Funcionario funcionario) {
		if(funcionario.getSalarioBase() > 3000.0) {
			return funcionario.getSalarioBase() * 0.15;
		}
		return funcionario.getSalarioBase() * 0.20;
	}

}
