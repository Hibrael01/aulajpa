
public enum TipoDeDocumento {
	
	RG ("RG - Registro Geral"),
	CPF ("CPF - Cadastro de Pessoa Física"),
	CNPJ ("CNPJ - Cadastro de Pessoa Jurídica");
	
	private String descricao;

	private TipoDeDocumento(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	
}
