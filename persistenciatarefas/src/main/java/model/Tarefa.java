package model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Tarefa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column(name="id_tarefa")
	private Integer id;
	
	@Column(name="titulo_tarefa")
	private String titulo;
	
	@Column(name="descricao_tarefa", columnDefinition="text")
	private String descricao;
	
	@Column(name="data_criacao")
	@Temporal(TemporalType.DATE)
	private Date dataCriacao;
	
	@Column(name="data_vencimento")
	@Temporal(TemporalType.DATE)
	private Date dataVencimento;
	
	@Column(name="prioridade_tarefa", length=100)
	private String prioridade;
	
	@Column(name="status_tarefa", length=100)
	private String estado;
	
	
	public Tarefa() {
		
	}
	
	public Tarefa(Integer id, String titulo, String descricao, Date dataCriacao, Date dataVencimento, String prioridade, String estado ) {
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataCriacao = dataCriacao;
		this.dataVencimento = dataVencimento;
		this.prioridade = prioridade;
		this.estado = estado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescriacao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, titulo, descricao, dataCriacao, dataVencimento, prioridade, estado);
	}
	
	@Override 
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Tarefa other = (Tarefa) obj;
		return Objects.equals(titulo, other.titulo) && Objects.equals(id, other.id)
						&& Objects.equals(descricao, other.descricao);				
	}
	
	@Override 
	public String toString() {
		return "Tarefa [id = " + id + ", titulo = " + titulo + ", descricao = " + descricao + " ]"; 
	}
	
}
