package br.com.atendimento.model.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.atendimento.model.dao.AtendimentoDao;
import br.com.atendimento.model.domain.Atendimento;
import br.com.atendimento.model.service.AtendimentoService;

public class AtendimentoServiceImpl implements AtendimentoService {

	@Inject
	private AtendimentoDao dao;

	@Override
	@Transactional
	public void salvar(Atendimento atendimento) {

		dao.salvarOuAtualizar(atendimento);
	}

	@Override
	@Transactional
	public void remover(Integer protocolo) {

		dao.remover(dao.findByProtocolo(protocolo));
	}

	@Override
	public List<Atendimento> listarTodos() {

		return dao.listar();
	}

}
