package programa;

import entities.Funcionario;
import services.DezOuVintePorCento;
import services.QuinzeOuVintePorCento;

import static enums.CargoEnum.*;

public class CalculadoraDeSalario {

	public static void main(String[] args) {
		
		Funcionario teste = new Funcionario("Menino do Teste", 20, 2900.0, TESTE);
		Funcionario programador = new Funcionario("Menino do Teste", 20, 5500.0, PROGRAMADOR);
		Funcionario dba = new Funcionario("Menino do Teste", 20, 4500.0, DBA);
		
		calcula(programador);
		calcula(teste);
		calcula(dba);
	}
	
	public static double calcula(Funcionario funcionario) {
		if(PROGRAMADOR.equals(funcionario.getCargo())) {
			return new DezOuVintePorCento().calculoBase(funcionario);
		}
		
		if(TESTE.equals(funcionario.getCargo()) || DBA.equals(funcionario.getCargo())) {
			return new QuinzeOuVintePorCento().calculoBase(funcionario);
		}
		throw new RuntimeException("funcionario invalido");
	}
}
