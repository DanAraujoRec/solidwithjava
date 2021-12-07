package enums;

public enum CargoEnum {
	
	TESTE("teste"),
	PROGRAMADOR("programador"),
	DBA("dba");

	private String descricao;
	
	CargoEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
