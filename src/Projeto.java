import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Projeto {
	
	private String nome;
	private Date dt_Inicio;
	private Date dt_Termino;
	private List<Contratacao> listaContratacao = new ArrayList<>();
	
	public Projeto(String nome, Date dt_Inicio, Date dt_Termino) {
		this.nome = nome;
		this.dt_Inicio = dt_Inicio;
		this.dt_Termino = dt_Termino;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDt_Inicio() {
		return dt_Inicio;
	}

	public void setDt_Inicio(Date dt_Inicio) {
		this.dt_Inicio = dt_Inicio;
	}

	public Date getDt_Termino() {
		return dt_Termino;
	}

	public void setDt_Termino(Date dt_Termino) {
		this.dt_Termino = dt_Termino;
	}
	
	public boolean adicionarContratacao(Contratacao contratacao) {
		
		if( contratacao != null && !listaContratacao.contains(contratacao) ) {
			this.listaContratacao.add(contratacao);
			return true;
		}
		
		return false;
		
	}
	
	public boolean removerContratacao(Contratacao contratacao) {
		
		if ( contratacao != null && listaContratacao.size() > 0 && listaContratacao.contains(contratacao) ) {
			
			this.listaContratacao.remove(contratacao);
			return true;
		}
		
		return false;
	}
	
	public void listarContratacao() {
		
		if( listaContratacao.isEmpty() ) {
			
			System.out.println("O Projeto " + this.nome + "Ainda não contratou nenhum funcionário!");
			
		}else {
			System.out.println("*** CONTRATAÇÕES ***");
			System.out.println("\nProjeto:\n\t" + this.nome);
			System.out.println("Funcionario(s):");
			for( Contratacao contrat : this.listaContratacao ) {
				System.out.println("\t" + contrat.getFuncionario().getNome()
						+ "[ Status: " + contrat.getStatus() + "]" ); 
			}
			
		}
		
	}

	
	@Override
	public String toString() {
		return "Projeto [nome=" + nome + ", dt_Inicio=" + dt_Inicio + ", dt_Termino=" + dt_Termino
				+ ", listaContratacao=" + listaContratacao + "]";
	}
	
	
}
