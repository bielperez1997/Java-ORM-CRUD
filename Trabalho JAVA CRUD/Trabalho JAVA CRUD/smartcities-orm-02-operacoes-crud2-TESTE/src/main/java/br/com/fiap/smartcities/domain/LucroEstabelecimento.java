package br.com.fiap.smartcities.domain;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "tb_LucroEstabelecimento")
public class LucroEstabelecimento {

	@Id
	@SequenceGenerator(name="LucroEstabelecimento",sequenceName="sq_tb_LucroEstabelecimento",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="LucroEstabelecimento")
	@Column(name = "id_LucroEstabelecimento")
	private Integer id;

	@Column(name = "nome_LucroEstabelecimento", length = 50)
	private String nome;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dh_criacao")
	private Calendar dataCriacao;
	
	public LucroEstabelecimento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LucroEstabelecimento(Integer id, String nome, Calendar dataCriacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataCriacao = dataCriacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	@Override
	public String toString() {
		return "LucroEstabelecimento [id=" + id + ", nome=" + nome + ", dataCriacao=" + dataCriacao + "]";
	}
	
	
	
	
}