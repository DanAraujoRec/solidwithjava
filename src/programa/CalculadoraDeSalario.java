package programa;

import entities.Funcionario;
import static enums.CargoEnum.*;

public class CalculadoraDeSalario {

	public static void main(String[] args) {
		
		Funcionario teste = new Funcionario("Menino do Teste", 20, 2900.0, TESTE);
		Funcionario programador = new Funcionario("Menino do Teste", 20, 5500.0, PROGRAMADOR);
		Funcionario dba = new Funcionario("Menino do Teste", 20, 4500.0, DBA);
		
		calcula(programador);
	}
	
	public static double calcula(Funcionario funcionario) {
		if(PROGRAMADOR.equals(funcionario.getCargo())) {
			return dezOuVintePorcento(funcionario);
		}
		
		if(TESTE.equals(funcionario.getCargo())) {
			return quinzeOuVintePorCento(funcionario);
		}
		throw new RuntimeException("funcionario invalido");
	}

	private static double quinzeOuVintePorCento(Funcionario funcionario) {
		if(funcionario.getSalarioBase() > 3000.0) {
			return funcionario.getSalarioBase() * 0.15;
		}
		return funcionario.getSalarioBase() * 0.20;
	}

	private static double dezOuVintePorcento(Funcionario funcionario) {
		if(funcionario.getSalarioBase() > 3000.0) {
			return funcionario.getSalarioBase() * 0.10;
		}
		return funcionario.getSalarioBase() * 0.20;
	}

}
