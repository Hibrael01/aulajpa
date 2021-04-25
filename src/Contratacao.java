import java.util.Date;

public class Contratacao {

	private Date data;
	private Cargo cargo;
	private Status status;
	private Funcionario funcionario;
	private Projeto projeto;
	
	
	
	public Contratacao( Date data, Cargo cargo, Funcionario funcionario, Projeto projeto) {
		this.data = data;
		this.cargo = cargo;
		this.status = Status.PENDENTE;
		this.funcionario = funcionario;
		this.projeto = projeto;
		projeto.adicionarContratacao(this);
		
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	
	
	@Override
	public String toString() {
		return "Contratacao [data=" + data + ", cargo=" + cargo + ", status=" + status + ", funcionario=" + funcionario
				+ ", projeto=" + projeto + "]";
	}
	
	public void pendente() {
		this.status = Status.PENDENTE;
	}
	
	public void contratar() {
		this.status = Status.CONTRATADO;
	}
	
	public void demitir() {
		this.status = Status.DEMITIDO;
		this.projeto.removerContratacao(this);
	}

	
}
