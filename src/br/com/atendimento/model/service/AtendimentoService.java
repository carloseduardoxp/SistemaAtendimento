package br.com.atendimento.model.service;

import java.util.List;

import br.com.atendimento.model.domain.Atendimento;

public interface AtendimentoService {

	void salvar(Atendimento atendimento);

	void remover(Integer protocolo);

	List<Atendimento> listarTodos();
}
