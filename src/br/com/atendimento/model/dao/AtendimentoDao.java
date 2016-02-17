package br.com.atendimento.model.dao;

import java.util.List;

import br.com.atendimento.model.domain.Atendimento;

public interface AtendimentoDao {

	Atendimento findByProtocolo(Integer protocolo);

	List<Atendimento> listar();

	void remover(Atendimento atendimento);

	Atendimento salvarOuAtualizar(Atendimento atendimento);

}
