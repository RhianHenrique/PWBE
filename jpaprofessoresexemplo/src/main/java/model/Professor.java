package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table (name = "professor")
public class Professor implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_professor;
	
	@Column (name = "nome_professor")
	private String nome;
	@Column (name = "especialidade_professor")
	private String especialidade;
	@Column (name = "data_admissao_professor")
	private String data_admissao;
	
	public Professor() {
	}
	
	public Professor( String nome, String especialidade, String data_admissao) {
		this.id_professor = null;
		this.nome = nome;
		this.especialidade = especialidade;
		this.data_admissao = data_admissao;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Integer getId_professor() {
		return id_professor;
	}


	public String getNome() {
		return nome;
	}


	public String getEspecialidade() {
		return especialidade;
	}


	public String getData_admissao() {
		return data_admissao;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public void setData_admissao(String data_admissao) {
		this.data_admissao = data_admissao;
	}
	
	
	
	
	
	
}
