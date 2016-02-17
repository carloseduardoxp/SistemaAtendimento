package br.com.atendimento.model.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.atendimento.utils.NotaAtendimentoEnum;

@Entity
@Table(name = "ATENDIMENTO")
public class Atendimento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column( name = "PROTOCOLO")
	private Integer protocolo;

	@Column(name = "NOME_CLIENTE")
	private String nomeCliente;

	@Column(name = "DETALHAMENTO")
	private String detalhamento;

	@Column(name = "ATENDIMENTO_ENUM")
	private NotaAtendimentoEnum atendimentoEnum;

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Integer getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(Integer protocolo) {
		this.protocolo = protocolo;
	}

	public String getDetalhamento() {
		return detalhamento;
	}

	public void setDetalhamento(String detalhamento) {
		this.detalhamento = detalhamento;
	}

	public NotaAtendimentoEnum getAtendimentoEnum() {
		return atendimentoEnum;
	}

	public void setAtendimentoEnum(NotaAtendimentoEnum atendimentoEnum) {
		this.atendimentoEnum = atendimentoEnum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((protocolo == null) ? 0 : protocolo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Atendimento other = (Atendimento) obj;
		if (protocolo == null) {
			if (other.protocolo != null)
				return false;
		} else if (!protocolo.equals(other.protocolo))
			return false;
		return true;
	}

}
