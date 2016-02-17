package br.com.atendimento.model.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.atendimento.model.dao.AtendimentoDao;
import br.com.atendimento.model.domain.Atendimento;

public class AtendimentoDaoImpl implements AtendimentoDao {

	@PersistenceContext(unitName = "AtendimentoPU")
	private EntityManager em;

	@Override
	public Atendimento salvarOuAtualizar(Atendimento entity) {

		if (entity.getProtocolo() != null) {
			entity = em.merge(entity);
		}

		em.persist(entity);
		
		return entity;
	}

	@Override
	public void remover(Atendimento entity) {

		entity = em.merge(entity);

		em.remove(entity);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Atendimento> listar() {

		Query query = em.createQuery("from Atendimento");

		return query.getResultList();
	}

	@Override
	public Atendimento findByProtocolo(Integer protocolo) {

		return em.find(Atendimento.class, protocolo);
	}

}
